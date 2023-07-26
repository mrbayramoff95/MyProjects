package Java_lessons.lesson12Homeworks;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        List<Integer> inputSymbols = new ArrayList<>();
        for (int i = 0; i < random.nextInt(25); i++) {
            inputSymbols.add(random.nextInt(5));
        }
        System.out.println(inputSymbols);

        Map<Integer, Integer> symbols = new HashMap<>();

        for (Integer inputSymbol : inputSymbols) {
            if (symbols.containsKey(inputSymbol)) {
                symbols.put(inputSymbol, symbols.get(inputSymbol) + 1);
            } else {
                symbols.put(inputSymbol, 1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> symbol : symbols.entrySet()) {
            if (symbol.getValue() > 1) {
                System.out.println(symbol.getKey() + " - " + (symbol.getValue() - 1));
                count += symbol.getValue() - 1;
            }
        }
        System.out.println("Общее количество повторений: " + count);
    }
}
