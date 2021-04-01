package by.it._classwork_.jd01_12;

import java.util.*;

public class TaskB3 {

    private static String process(ArrayList<String> list) {
        boolean del = false;
        while (list.size() > 1) {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (del) {
                    iterator.remove();
                }
                del = !del;
            }
        }
        return list.get(0);
    }

    private static String process(LinkedList<String> list) {
        while (list.size() > 1) {
            list.addLast(list.removeFirst());
            list.removeFirst();
        }
        return list.get(0);
    }
}
