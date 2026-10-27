# Video Library Options
## JavaCV
#### Pros:
- Works well with Java APIs to retrieve specific frames of video
- Can decode video and images
- Avoids using a seperate FFmpeg command line workflow

#### Cons:
- Uses a lot of additional dependencies
- Native library and platform compatibility may require troubleshooting
- You may need to understand FFmpeg and/or OpenCV concepts to understand JavaCV

## OpenCV
#### Pros:
- Lots of image processing and computer-vision functionality
- Good for thresholding, segmentation, and object tracking
- Can handle both video and image capture analysis

#### Cons:
- May be difficult to setup due to using native code
- The API and data types may require some refactoring of current image-processing code
- May be more complex than needed for this project

## FFmpeg
#### Pros:
- Has a broad support for video formats and codec
- Is great at extracting frames, converting cide, and creating processed video output
- You don't need to integrate Java binding and can execute FFmpeg through the command line

#### Cons:
- The command line interface is not a native Java API
- You will have to launch subprocesses, handling errors, frame timings, and output streams
- You may need another library for Java image-processing logic