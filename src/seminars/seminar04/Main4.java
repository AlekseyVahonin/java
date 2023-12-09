package seminars.seminar04;

import java.util.*;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.
 */

public class Main4 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
        printAsQueue(arr);
    }

    static void printAsQueue(String[] arr){
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printAsStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

//        System.out.println(stack);

//        for (String s: stack){
//            System.out.println(s);
//        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
