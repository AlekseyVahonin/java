package seminars.seminar02;

public class Polindrom {

    /**
     * Напишите метод, который принимает на вход строку (String) и
     * определяет является ли строка палиндромом (возвращает boolean значение).
     * Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */

    public static void main(String[] args) {

        System.out.println(polindrom("А роза упала на лапу Азора"));
    }

    public static boolean polindrom(String str) {
        str = str.toLowerCase();
        str = str.replace(" ", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
