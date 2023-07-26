package Java_lessons.lesson10.homework;

public class Document {
    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + "-" + blocks[1]);
    }

    public static void printHiddenDocumentNumber(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder hiddenNumber = new StringBuilder();
        for (int i = 0; i < blocks.length; i++) {
            if (i == 1 || i == 3) {
                hiddenNumber.append("***");
            } else {
                hiddenNumber.append(blocks[i]);
            }
            if (i != blocks.length - 1) {
                hiddenNumber.append("-");
            }
        }
        System.out.println(hiddenNumber.toString());
    }

    public static void printLettersOnly(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder lettersOnly = new StringBuilder();
        for (char c : blocks[1].toCharArray()) {
            if (Character.isLetter(c)) {
                lettersOnly.append(Character.toLowerCase(c)).append("/");
            }
        }
        for (char c : blocks[3].toCharArray()) {
            if (Character.isLetter(c)) {
                lettersOnly.append(Character.toLowerCase(c)).append("/");
            }
        }
        lettersOnly.deleteCharAt(lettersOnly.length() - 1);
        System.out.println(lettersOnly.toString());
    }

    public static void printLettersWithLabel(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder lettersWithLabel = new StringBuilder("Letters:");
        for (int i = 1; i < blocks.length; i += 2) {
            for (char c : blocks[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    lettersWithLabel.append(Character.toUpperCase(c));
                }
            }
            lettersWithLabel.append("/");
        }
        lettersWithLabel.deleteCharAt(lettersWithLabel.length() - 1);
        System.out.println(lettersWithLabel.toString());
    }

    public static void containsABC(String documentNumber) {
        String normalized = documentNumber.replaceAll("[Aa][Bb][Cc]", "");
        if (normalized.length() < documentNumber.length()) {
            System.out.println("Document number contains abc/ABC");
        } else {
            System.out.println("Document number does not contain abc/ABC");
        }
    }

    public static void startsWith555(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with 555");
        } else {
            System.out.println("Document number does not start with 555");
        }
    }

    public static void endsWith1a2b(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with 1a2b");
        } else {
            System.out.println("Document number does not end with 1a2b");
        }
    }
}
