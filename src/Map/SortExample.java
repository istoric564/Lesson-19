package Map;

import Lesson19.Person;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("123", "456", "14", "678");
//        Collections.sort(strings);
//        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "ivan", "Ivanov"),
                new Person(29, "petr", "petrov"),
                new Person(3, "sveta", "svetikova")
        );

        Collections.sort(personList);
        System.out.println(personList);

//        personList.sort(new firstNameComparator());
        personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(personList);
    }
    public static class firstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
