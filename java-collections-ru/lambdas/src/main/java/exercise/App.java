package exercise;

import java.util.Arrays;
import java.util.stream.Stream;
public class App {

    public static String[][] enlargeArrayImage(String[][] image) {
        if (image.length == 0 || image[0].length == 0) {
            return new String[0][0];
        }

        int rows = image.length;
        int cols = image[0].length;

        String[][] enlargedImage = new String[rows * 2][cols * 2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String pixel = image[i][j];
                enlargedImage[i * 2][j * 2] = pixel;
                enlargedImage[i * 2][j * 2 + 1] = pixel;
                enlargedImage[i * 2 + 1][j * 2] = pixel;
                enlargedImage[i * 2 + 1][j * 2 + 1] = pixel;
            }
        }

        return enlargedImage;
    }
}
// END
