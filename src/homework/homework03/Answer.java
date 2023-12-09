package homework.homework03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Answer {

    /**
     * <summary>Удаляет четные элементы массива</summary>
     */
    public void removeEvenNumbers(Integer[] arr) {
        List<Integer> lst = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                lst.add(integer);
            }
        }
        System.out.println(lst);
    }

    /**
     * Сортирует массив, находит min, max, average
     */
    public void analyzeNumbers(Integer[] arr) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        lst.sort(Comparator.naturalOrder());
        System.out.println(lst);
        System.out.println("Minimum is " + lst.get(0));
        System.out.println("Maximum is " + lst.get(lst.size() - 1));
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += arr[i];
        }
        System.out.println("Average is = " + sum / lst.size());
    }
}
