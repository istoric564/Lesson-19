package Lesson19_Hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 *Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 *Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.

 */
public class Task2 {
    public static void main(String[] args) {
        List<Student> studentsList = Arrays.asList(new Student("Alex", "Alexeev", 22, 3.4),
        new Student("Bob", "Bobrov", 21, 4.4),
                new Student("Dasha", "Dubrova", 19, 4.9),
                new Student("Ivan", "Ivanov", 23, 3.0),
                new Student("Sveta", "Svetikova", 20, 4.0));

        studentsList.sort(new studentAverageScoreComparator());
        System.out.println(studentsList);
        studentsList.sort(new studentFullNameComparator());
        System.out.println(studentsList);
        studentsList.sort(new studentAgeComparator());
        System.out.println(studentsList);
        studentsList.sort(new studentFullNameComparator().thenComparing(new studentAgeComparator()));
        System.out.println(studentsList);
        System.out.println(StudentHelper.getTheBestStudent(studentsList));
    }
}
