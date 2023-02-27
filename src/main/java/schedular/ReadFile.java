package schedular;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReadFile implements Serializable {
    public static  <T> T initFromFile(String file) {
        T t = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            t = (T) ois.readObject();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
