package Java_lessons.homeworks;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Citizen of Turkmenistan!";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        System.out.println("Количество символов:");
        for (Character ch : charCountMap.keySet()) {
            System.out.println(ch + ": " + charCountMap.get(ch));
        }
    }
}