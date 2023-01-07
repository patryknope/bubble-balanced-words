import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    private static final String WORD_REGEXP = "[a-zA-Z]+";

    public static int count(String input) {

        if (input == null) {
            throw new RuntimeException("Input is null");
        } else if (input.length() < 1) {
            return 0;
        } else if (!input.matches(WORD_REGEXP)) {
            throw new RuntimeException("Input contains illegal characters. Use a-z A-Z only.");
        }

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subWord = input.substring(i, j);
                if (isBalanced(subWord)) {
                    result++;
                }
            }
        }
        return result;
    }

    private static boolean isBalanced(String word) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] wordCharArray = word.toCharArray();
        for (char c : wordCharArray) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int ref = countMap.values()
                .stream()
                .findFirst()
                .orElse(0);
        for (int count : countMap.values()) {
            if (count != ref) {
                return false;
            }
        }
        return true;
    }
}

