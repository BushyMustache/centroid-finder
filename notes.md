BinarizingImageGroupFinder.java:
- A class that uses the ImageGroupFinder interface.
- Uses ImageBinarizer to convert an image into a binary 2D array.
- Each pixel in this array is either 0 or 1.
- BinaryGroupFinder is used to locate connected groups (descending order) of white pixels.

BinaryGroupFinder.java:
- An interface with a method that returns a list of sorted groups that are in descending order.
- Pixels are considered only vertically and horizontally.
- row equals x and column equals y.

ColorDistanceFinder.java:
- A interface with a method that measures the distance between two colors.
- The distance is a double and not an int.

Coordinate.java:
- A record that represents the location in an image or array.
- x increases to the right and y increases downward.

DfsBinaryGroupFinder.java:
- A class that implements the BinaryGroupFinder interface.
- Finds connected pixel groups of 1s in an integer array representing a binary image.
- Its findConnectedGroups method return a list of found groups of connect pixels in descending order.

DistanceImageBinarizer.java:
- A class that implements the ImageBinarizer interface.
- Has methods that convert a buffered image into a binary 2D array and vice versa.
- The constructor contains a color parameter as a 24-bit hex RGB integer for comparison reference.
- The constructor contains a threshold that determines whether a pixel is black or white.
- Pixels with distances less than the threshold are marked white and others are marked black.

EuclideanColorDistance.java:
- 

Group.java:
- 

ImageBinarizer.java:
- 

ImageGroupFinder.java:
- 

ImageSummaryApp.java:
- 

