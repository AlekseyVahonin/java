package seminars.seminar02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */
public class Main4 {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "src/seminars/seminar02/test.txt";
        String logPath = "src/seminars/seminar02/log.txt";
        String s = "test";
        int n = 10;

        createLogger(logPath);

        String res = repeat(s, n);
        writeInFile(res, filePath);

        closeLogger();
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            handler.close();
        }
    }

    static void createLogger(String logPath) {
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeInFile(String s, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(s);
            writer.write("\n");
            logger.info("12333");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("jlkjlkjlkjlkj");
        }
    }

    static String repeat(String s, int n) {
//        return s.repeat(n + " ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
