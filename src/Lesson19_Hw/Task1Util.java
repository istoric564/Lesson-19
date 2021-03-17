package Lesson19_Hw;

import java.util.List;
import java.util.ListIterator;

public final class Task1Util {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private Task1Util(){
    }

    public static void markLength4(List<String> list){
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH){
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }


}
