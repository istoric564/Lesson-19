package Lesson19_Hw;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    /**
     * 1. Написать метод markLength4, принимающий в качестве
     * параметра список (List) строк и размещающий строку "****"
     * перед каждым четырёхсимвольным элементом.
     * Оригинальные элементы должны остаться на месте.
     * Например:
     * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
     * ->
     * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****",
     * "Java", "programmer"}
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        Task1Util.markLength4(list);
        System.out.println(list);
    }
}
