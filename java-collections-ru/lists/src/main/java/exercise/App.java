package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        List<Character> lettersList = new ArrayList<>();
        for (char symbolOne: letters.toLowerCase().toCharArray()) {
            lettersList.add(symbolOne);
        }
        List<Character> wordList = new ArrayList<>();
        for (char symbolTwo: word.toLowerCase().toCharArray()) {
            wordList.add(symbolTwo);
        }
        for (Character ch: wordList) {
            if (!lettersList.remove(ch)) {
                return false;
            }
        }
        return true;
    }
}
//END
