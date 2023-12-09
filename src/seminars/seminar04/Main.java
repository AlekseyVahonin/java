package seminars.seminar04;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Реализовать консольное приложение, которое:
            Принимает от пользователя и “запоминает” строки.
            Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
            Если введено revert, удаляет предыдущую введенную строку из памяти
         */
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            String lineTemp = scanner.nextLine();
            if (lineTemp.equals("print")) {
                for (String item: list) {
                    System.out.println(item);
                }

//                ListIterator<String> iterator = list.listIterator(list.size());
//                while (iterator.hasPrevious()) {
//                    System.out.println(iterator.previous());
//                }
//                for (int i = list.size() - 1; i >= 0; i--) {
//                    System.out.println(list.get(i));
//                }
            } else if (lineTemp.equals("revert")) {
                list.remove(0);
            } else if (lineTemp.equals("stop")) {
                flag = false;
            } else {
                list.add(0, lineTemp);
            }

        }
    }
}
