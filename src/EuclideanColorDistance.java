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

        return Math.sqrt((rgbA[0] - rgbB[0])^2 + (rgbA[1] - rgbB[1])^2 + (rgbA[2] - rgbB[2])^2);
    }

    private int[] convertToRGB(int color) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        Map<Character, Integer> values = new HashMap<>();
        int num = 10;

        for (char letter : letters) {
            values.put(letter, num);
            num++;
        }

        int[] components = new int[3];
        String colorString = Integer.toHexString(color);

        String red = colorString.substring(0, 2);
        String green = colorString.substring(2, 4);
        String blue = colorString.substring(4);

        components[0] = (values.get(red.charAt(0)) * 16) + values.get(red.charAt(1));

        components[1] = (values.get(green.charAt(0)) * 16) + values.get(green.charAt(1));

        components[2] = (values.get(blue.charAt(0)) * 16) + values.get(blue.charAt(1));;

        return components;
    }
}
