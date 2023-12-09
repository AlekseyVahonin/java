package seminars.seminar04;

/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */

public class Main5 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println("size: " + stack.size());
//        System.out.println("empty: " + stack.empty());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

        MyStack stack1 = new MyStack();
        System.out.println(stack);
        System.out.println(stack1);
    }
}
