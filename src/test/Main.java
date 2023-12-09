package test;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> STACK = new Stack<>();

        STACK.push(8);
        STACK.push(5);
        STACK.push(9);
        STACK.push(2);
        STACK.push(4);

        System.out.println("The stack is: " + STACK);

        System.out.println("Does the stack contains '8'? "
                + STACK.search(8));

        System.out.println("Does the stack contains '5'? "
                + STACK.search(5));

        System.out.println("Does the stack contains '4'? "
                + STACK.search(4));

        System.out.println(new int[][]{{1,2,3},{4,5,6}}[1][2]);
    }
}

