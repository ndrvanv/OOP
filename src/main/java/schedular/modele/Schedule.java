package schedular.modele;

import schedular.modele.Priority;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Schedule implements Serializable {
    private int id;
    private String nameUser;
    private String notes;
    private LocalDateTime startTime;
    private LocalDateTime deadLine;

    private Priority priority;

    public Schedule(int id, String name, String notes, LocalDateTime startTime, LocalDateTime deadLine, Priority priority) {
        this.id = id;
        this.nameUser = name;
        this.notes = notes;
        this.startTime = startTime;
        this.deadLine = deadLine;
        this.priority = priority;
    }
    public Schedule() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nameUser;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", name='" + nameUser + '\'' +
                ", notes=" + notes +
                ", dateAddNote=" + startTime +
                ", deadLine='" + deadLine + '\'' +
                ", priority=" + priority +
                '}';
    }
}
