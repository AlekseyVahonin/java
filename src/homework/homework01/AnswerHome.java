package homework.homework01;

public class AnswerHome {

    /**
     * <summary>Возвращает сумму чисел от 1 до n<summary>
     **/
    public int countNTriangle(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    /**
     * <summary>Печатает простые числа от 1 до 1000<summary>
     **/
    public void printPrimeNums() {
        for (int i = 2; i <= 1_000_000; i++) {
            int count = 0;
            for (int j = 2; j < Math.pow(i, 0.5) + 1; j++) {
                if (i % j == 0 && i != 2) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

}
