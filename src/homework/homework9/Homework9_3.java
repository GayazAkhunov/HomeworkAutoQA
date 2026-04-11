package homework.homework9;

import java.util.HashMap;
import java.util.Map;

public class Homework9_3 {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            resultMap.put(word, countMap.get(word) >= 2);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(test1));
        String[] test2 = {"c", "b", "a"};
        System.out.println(wordMultiple(test2));
        String[] test3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(test3));
    }
}