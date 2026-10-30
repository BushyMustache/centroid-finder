package io.github.BushyMustache.centroidFinder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Optional;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

public class VideoReader implements AutoCloseable{
    private final FFmpegFrameGrabber grabber;
    private final Java2DFrameConverter converter;

    public VideoReader(String inputPath) throws FFmpegFrameGrabber.Exception {
        grabber = new FFmpegFrameGrabber(inputPath);
        converter = new Java2DFrameConverter();
        grabber.start();
    }

    public Optional<VideoFrame> readNextFrame() throws FFmpegFrameGrabber.Exception {
        Frame frame;

        while ((frame = grabber.grabImage()) != null) {
            BufferedImage image = converter.convert(frame);

            if (image != null) {
                double timestampSeconds = grabber.getTimestamp() / 1_000_000.0;
                return Optional.of(new VideoFrame(image, timestampSeconds));
            }
        }
        return Optional.empty();
    }

    @Override
    public void close() throws IOException {
        try {
            grabber.stop();
        } finally {
            grabber.release();
            converter.close();
        }
    }
}
