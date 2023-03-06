package schedular.modele;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AddNotes<T extends Schedule> implements Serializable {

    private ArrayList<T> scheduls;

    public AddNotes() {
        this.scheduls = new ArrayList<>();
    }

    public ArrayList<T> getScheduls() {
        return scheduls;
    }
    public void showShedules() {
        int i = 1;
        for(Schedule sch : scheduls) {
            System.out.println("\n№\t " + i + " " + sch);
            i++;
        }
    }

    public void addSchedule(T schedule) {
        this.scheduls.add(schedule);
    }
    public void removeSchedule(T schedule) {
        this.scheduls.remove(schedule);
    }





}
