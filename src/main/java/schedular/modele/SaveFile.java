package schedular.modele;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveFile implements Serializable {
    public static <T> void saveFile(T t, String file) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false));
            oos.writeObject(t);
            System.out.println("Сохранено");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
