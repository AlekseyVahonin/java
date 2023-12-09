package homework.homework01;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculate {
    /**
     * <sumary>Калькулятор</sumary>
     **/
    Deque<Integer> tempOp = new ArrayDeque<>();

    public int calculate(char op, int a, int b) {
        switch (op) {
            case '*':
                addElem(a * b);
                return a * b;
            case '/':
                addElem(a / b);
                return a / b;
            case '+':
                addElem(a + b);
                return a + b;
            case '-':
                addElem(a - b);
                return a - b;
            case '<':
                return getElem();
            default:
                throw new RuntimeException("Некорректный оператор: " + op);
        }
    }

    private void addElem(int num) {
        if (tempOp.size() >= 2) {
            tempOp.remove();
            tempOp.offer(num);
        } else {
            tempOp.offer(num);
        }
    }

    private int getElem(){
        return tempOp.poll();
    }
}
