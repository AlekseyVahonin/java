package homework.homework02;

import java.io.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {

        StringBuilder stBuilder = new StringBuilder();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String logPath = "src/homework/homework02/log.txt";

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    mas[i] = mas[i] ^ mas[i + 1] ^ (mas[i + 1] = mas[i]);
                    flag = true;
                }
            }
            stBuilder.append(simpleDateFormat.format(date));
            stBuilder.append(" ");
            stBuilder.append(Arrays.toString(mas));
            stBuilder.append("\n");
        }

        try (FileWriter fileWriter = new FileWriter(logPath)) {
            fileWriter.write(stBuilder.toString());
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}