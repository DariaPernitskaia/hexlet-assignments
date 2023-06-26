package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {

    @Test
    public void testEnlargeArrayImage() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] expectedEnlargedImage = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };

        String[][] actualEnlargedImage = App.enlargeArrayImage(image);

        assertThat(actualEnlargedImage).isEqualTo(expectedEnlargedImage);
    }

    @Test
    public void testEnlargeArrayImage_EmptyImage() {
        String[][] emptyImage = {};

        String[][] expectedEnlargedImage = {};

        String[][] actualEnlargedImage = App.enlargeArrayImage(emptyImage);

        assertThat(actualEnlargedImage).isEqualTo(expectedEnlargedImage);
    }

    @Test
    public void testEnlargeArrayImage_SingleRow() {
        String[][] image = {
                {"*", "*", "*", "*"}
        };

        String[][] expectedEnlargedImage = {
                {"*", "*", "*", "*","*", "*", "*", "*"},
                {"*", "*", "*", "*","*", "*", "*", "*"}
        };

        String[][] actualEnlargedImage = App.enlargeArrayImage(image);

        assertThat(actualEnlargedImage).isEqualTo(expectedEnlargedImage);
    }
}
// END
