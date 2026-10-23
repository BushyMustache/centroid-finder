import java.util.HashMap;
import java.util.Map;

public class EuclideanColorDistance implements ColorDistanceFinder {
    /**
     * Returns the euclidean color distance between two hex RGB colors.
     * 
     * Each color is represented as a 24-bit integer in the form 0xRRGGBB, where
     * RR is the red component, GG is the green component, and BB is the blue component,
     * each ranging from 0 to 255.
     * 
     * The Euclidean color distance is calculated by treating each color as a point
     * in 3D space (red, green, blue) and applying the Euclidean distance formula:
     * 
     * sqrt((r1 - r2)^2 + (g1 - g2)^2 + (b1 - b2)^2)
     * 
     * This gives a measure of how visually different the two colors are.
     * 
     * @param colorA the first color as a 24-bit hex RGB integer
     * @param colorB the second color as a 24-bit hex RGB integer
     * @return the Euclidean distance between the two colors
     */
    @Override
    public double distance(int colorA, int colorB) {
        int[] rgbA = convertToRGB(colorA);
        int[] rgbB = convertToRGB(colorB);

        if(colorA == colorB) return 0;

        return Math.sqrt((rgbA[0] - rgbB[0])^2 + (rgbA[1] - rgbB[1])^2 + (rgbA[2] - rgbB[2])^2);
    }

    private int[] convertToRGB(int color) {
        int[] components = new int[3];
        String colorString = String.format("%06X", color);

        String red = colorString.substring(0, 2);
        String green = colorString.substring(2, 4);
        String blue = colorString.substring(4);

        components[0] = (charToInt(red) * 16) + charToInt(red);
        components[0] = (charToInt(green) * 16) + charToInt(green);
        components[0] = (charToInt(blue) * 16) + charToInt(blue);

        return components;
    }

    //This method takes the first character of a String then converts it to Hex int
    private int charToInt(String s){ 
        return Integer.parseInt(String.valueOf(s.charAt(0)), 16);
    }
}
