package exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        Map<String, String> variables = new LinkedHashMap<>();

        Arrays.stream(content.split("\\r?\\n"))
                .filter(line -> line.contains("environment="))
                .map(line -> line.split("\""))
                .filter(parts -> parts.length > 1)
                .map(parts -> parts[1].split(","))
                .flatMap(Arrays::stream)
                .filter(envVar -> envVar.startsWith("X_FORWARDED_"))
                .map(envVar -> envVar.split("="))
                .filter(varParts -> varParts.length > 1)
                .forEach(varParts -> {
                    String name = varParts[0].substring("X_FORWARDED_".length());
                    String value = varParts[1];
                    variables.put(name, value);
                });

        return variables.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .reduce("", (acc, entry) -> acc.isEmpty() ? entry : acc + "," + entry);
    }
}
//END
