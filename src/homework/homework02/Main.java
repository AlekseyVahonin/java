package homework.homework02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
         * 1. Удалить лишнее в строке PARAMS
         * 2. Сделать массив строк
         * 3. Пересобрать массив в StringBuilder без null
         */
//        String QUERY = "select * from students where ";
//        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        Answer ans = new Answer();
//        System.out.println(ans.answer(QUERY, PARAMS));

//        int[] arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
        ParsingJson pJson = new ParsingJson();
        pJson.jsonParsing();
    }
}
