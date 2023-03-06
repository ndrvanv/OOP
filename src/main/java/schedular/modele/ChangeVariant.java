package schedular.modele;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ChangeVariant extends AddNotes<T>{
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

    private static void changeDeadline(int num, AddNotes<Schedule> addNotes) {
        addNotes.changeDeadline(addNotes.getScheduls().get(num), createDate("Установите новую дату и время дедлайна: "));
    }

    private static void changeDateStart(int num, AddNotes<Schedule> addNotes) {
        addNotes.changeDateStart(addNotes.getScheduls().get(num), createDate("Установите новую дату и время: "));
    }

    private static void changePriority(int num, AddNotes<Schedule> addNotes) {
        addNotes.changePriority(addNotes.getScheduls().get(num), changePriority());
    }

    private static void changeNotes(int num, AddNotes<Schedule> addNotes, String text) {
        addNotes.changeNotes(addNotes.getScheduls().get(num), text);
    }

}
