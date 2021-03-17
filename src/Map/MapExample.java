package Map;

import Lesson19.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, " Ivan ", "Ivanov");
        Person petr = new Person(2, " Petr ", "Petrov");
        Person sveta = new Person(1, " Sveta ", "Svetikova");

//        Ключ по значению
        Map<Integer, Person> map = new HashMap<>();
//          Уникальность по ключу
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
//        Проверяет наличие такого айди, и не кладет туда варианты
        map.putIfAbsent(sveta.getId(), sveta);
//        Вывод всех ключей на консоль
        System.out.println(map.keySet());
//        Вывод всех значений
        System.out.println(map.values());
//        Вывод множества ключ-значений
        System.out.println(map.entrySet());

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());

        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }

        boolean b = map.containsKey(4);
        System.out.println(b);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(4));
//        Если под индексом ~5 ничего нет, пожалуйста, верни свету. А если есть, то верни то,что под данным индексом
        System.out.println(map.getOrDefault(5, sveta));
    }
}
