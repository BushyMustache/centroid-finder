package io.github.BushyMustache.centroidFinder;

import java.util.Optional;

public class VideoReaderTest {

    public static void main(String[] args) throws Exception {

        try (VideoReader reader = new VideoReader("sampleInput/moving-square-triangle.mp4")) {

            Optional<VideoFrame> result;

            while ((result = reader.readNextFrame()).isPresent()) {

                VideoFrame videoFrame = result.get();

                System.out.println(
                    "Timestamp: " + videoFrame.timeStamp()
                    + " seconds, "
                    + "Dimensions: "
                    + videoFrame.frame().getWidth()
                    + "x"
                    + videoFrame.frame().getHeight()
                );
            }
        }
    }
}
