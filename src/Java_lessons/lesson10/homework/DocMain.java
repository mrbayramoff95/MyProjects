package Java_lessons.lesson10.homework;

import static Java_lessons.lesson10.homework.Document.*;

public class DocMain {
    public static void main(String[] args) {
        String documentNumber = "1234-ABC-5678-DEF-9G0H";
        printFirstTwoBlocks(documentNumber);
        printHiddenDocumentNumber(documentNumber);
        printLettersOnly(documentNumber);
        printLettersWithLabel(documentNumber);
        containsABC(documentNumber);
        startsWith555(documentNumber);
        endsWith1a2b(documentNumber);
    }
}
