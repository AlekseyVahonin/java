package homework.homework01;

import homework.homework01.AnswerHome;
import homework.homework01.Calculate;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        AnswerHome ans = new AnswerHome();
        Scanner iScan = new Scanner(System.in);
        Calculate calc = new Calculate();

        Calculate calculator = new Calculate();
        int result = calculator.calculate('+', 5, 5);
        System.out.println(result);
        int result2 = calculator.calculate('*', 5, 10);
        System.out.println(result2);

        int result3 = calculator.calculate('-', 5, 10);
        System.out.println(result3);
        int result4 = calculator.calculate('/', 10, 3);
        System.out.println(result4);

        int prevResult = calculator.calculate('<', 0, 0);
        System.out.println(prevResult);

    }
}
