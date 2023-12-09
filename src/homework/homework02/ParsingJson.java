package homework.homework02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class ParsingJson {
    public static void jsonParsing() {

        String filePath = "src/homework/homework02/test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
