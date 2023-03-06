package schedular.modele;

import schedular.Schedule;

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

    public void changeNotes(T schedule, String notes) {
        schedule.setNotes(notes);
    }
    public void changePriority(T schedule, Priority priority) {
        schedule.setPriority(priority);
    }
    public void changeDeadline(T schedule, LocalDateTime deadline) {
        schedule.setDeadLine(deadline); // "yyyy.MM.dd G 'at' HH:mm:ss z"
    }
    public void changeDateStart(T schedule, LocalDateTime startTime) {
        schedule.setStartTime(startTime);
    }


}
