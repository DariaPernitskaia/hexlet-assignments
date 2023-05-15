package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Разбиваем предложение на слова
        String[] words = sentence.split(" ");

        // Считаем количество повторений каждого слова
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        // Обходим все ключи словаря
        for (String word : wordCount.keySet()) {
            sb.append("  ").append(word).append(": ").append(wordCount.get(word)).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }
}

//END
