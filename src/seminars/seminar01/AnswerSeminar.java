package seminars.seminar01;

public class AnswerSeminar {

    /**
     * <sumaru>Возвести число в степень</sumaru>
     */
    public double pow(double a, int b) {
        if (b == 0 || a == 1) return 1;
        double res = 1;
        if (b < 0) {
            b = -b;
            a = 1.0 / a;
        }
        for (int i = 0; i < b; i++) res *= a;
        return res;
    }

    /**
     * <sumaru>Сортирует массив по заданному числу</sumaru>
     */
    public int[] sort(int[] arr, int num) {
        int[] sortArr = new int[arr.length];

        int countVal = arr.length - 1;
        int countNum = 0;

        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] == num) {
                sortArr[countVal] = num;
                countVal--;
            } else {
                sortArr[countNum] = arr[i];
                countNum++;
            }
        }
        return sortArr;
    }
    }

