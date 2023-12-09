package seminars.seminar06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и
        с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */
        Integer[] arr = addRandom(0,24, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqueness(arr));
    }

    public static Integer[] addRandom(int min, int max, int count) {
        Random rnd = new Random();
        Integer[] arr = new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i] = rnd.nextInt(min, max + 1);
        }
        return arr;
    }

    public static float uniqueness(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.f / arr.length;
    }
}
