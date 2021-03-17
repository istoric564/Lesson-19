package Lesson19_Hw;

import java.util.Comparator;

public class studentFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
