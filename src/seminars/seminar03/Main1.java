package seminars.seminar03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        List<Object> lst = new ArrayList<>();
        lst.add("Марс");
        lst.add(1);
        lst.add("Венера");
        lst.add(2);
        lst.add(10);
        lst.add("Земля");
        lst.add(3.5);
        lst.add(-5);
        lst.add(0);
        lst.add(true);

//        for (int i = 0; i < lst.size(); i++) {
//            if (lst.get(i) instanceof Integer) {
//                lst.remove(i);
//                i--;
//            }
//        }
        Iterator<Object> iterator = lst.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(lst);
    }
}
