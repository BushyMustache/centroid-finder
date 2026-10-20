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
- Finds the Euclidean color distance - the distance between two hex RGB colors, ranging from 0-255
- The distance is calculated with this formula: sqrt((r1 - r2)^2 + (g1 - g2)^2 + (b1 - b2)^2)
- With this calculation, we will be able to tell how different each color is from each other

Group.java:
- How pixels will be grouped and represented in an image
- The top-left cell of the array will be considered coordinate (x, y) - (0, 0)
- The size of the group is the number of pixels in the group
- Groups will be compared together and sorted by their size

ImageBinarizer.java:
- An interface that converts images from RGB to binary black and white
- Binary images are represented as 2D array of integers (0 - black, 1 - white)
- This interface should do the following:
- A BufferedImage will be converted into a binary 2D array
- A binary 2D array will be converted into a BufferedImage

ImageGroupFinder.java:
- Finds connected groups of pixels in an image
- Returns a DESCENDING sorted List<Group> 

ImageSummaryApp.java:
- Summarizes the image through:
- Loading the input image
- Parsing the target color from hex string to 24-bit integer (0-255)
- Compares the color distance then places the colors into a binary 2D array
- Converts the binary array into the BufferedImage
- Looks at white pixels (which should originally be similar colored pixel groups)
- Size and centroid are computed
- Writes a CSV containing the size and coordinates