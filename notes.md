BinarizingImageGroupFinder.java:
- 

BinaryGroupFinder.java:
- 

ColorDistanceFinder.java:
- 

Coordinate.java:
- 

DfsBinaryGroupFinder.java:
- 

DistanceImageBinarizer.java:
- 

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