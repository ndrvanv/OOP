package semFive.calculator.modele;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg) {

        try(FileWriter file = new FileWriter("C:\\Users\\1311103\\OneDrive\\Рабочий стол\\GB\\OOP\\src\\main\\java\\semFive\\calculator\\Log.log", true)) {
            Date currentTime = new Date();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime + ": " + msg + "\n");
            file.append(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
