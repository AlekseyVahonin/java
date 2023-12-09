package lectures.lecture_01;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        /*
         * Вывод двумерного массива в консоль
         */

        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) { //проходим по строкам до количества строк
            for (int j = 0; j < arr[i].length; j++) { // проходим по столбцам до количества el в столбце
                // тоже что и a[[1,2,3],[4,5,6]] len(a[0])
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        /*
         * Можно через 1 экземпляр, а можно через несколько. Как лучше?
         *
         */

        // Scanner iScanner = new Scanner(System.in); // экземляр класса

        // System.out.printf("name: "); // вывод в консоль текста
        // String name = iScanner.nextLine(); // считывание строки из консоли
        // System.out.printf("Привет, %s!\n", name); // вывод в консоль через format

        // System.out.printf("int a: ");
        // int x = iScanner.nextInt(); // считывание int
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble(); // считывание double
        // System.out.printf("%d + %f = %f\n", x, y, x + y); // d = double, f = float и
        // т.д.

        /*
         * Проверка ввода данных с консоли
         */

//
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt(); // метод hasNextInt
//         if (flag) {
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         }
//         else {
//         System.out.println("Некорректный ввод");
//         }
//

        // iScanner.close();

        // String st = "asd";
        // int num = 520;
        // String res = String.format("%s%d", st, num);

        // System.out.println(res);

        /*
         * Создание, запись/дозапись
         *
         */
//        try (FileWriter fw = new FileWriter("file.txt", false)) { //false файл не надо создавать
//            fw.write("line 1"); // записать в файл
//            fw.append('\n'); // добавить в файл
//            fw.append('2');
//            fw.append('\n');
//            fw.write("line 3");
//            fw.flush(); //копим данные в буффере, а потом раз и залили в подключенный ресурс
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
