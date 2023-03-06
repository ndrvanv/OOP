package schedular.presenter;


import schedular.modele.Schedule;
import schedular.modele.AddNotes;
import schedular.modele.Priority;
import schedular.modele.ReadFile;
import schedular.modele.SaveFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuHW4 {
    private static final String path = "C:\\Users\\1311103\\OneDrive\\Рабочий стол\\GB\\OOP\\src\\main\\java\\schedular\\plans.txt";
    private static Scanner scanner = new Scanner(System.in);
    private static int id = 4;


    public static void showShedules() {
        AddNotes<Schedule> scheduleAddNotes = ReadFile.initFromFile(path);
        scheduleAddNotes.showShedules();
    }

    public static void removeSchedule() {
        AddNotes<Schedule> scheduleAddNotes = ReadFile.initFromFile(path);
        showShedules();
        System.out.println("Введите номер задачи, которую хотите удалить: ");
        int num = scanner.nextInt();
        scheduleAddNotes.removeSchedule(scheduleAddNotes.getScheduls().get(num - 1));
        System.out.println("Задача успешно удалена с плана");
        SaveFile.saveFile(scheduleAddNotes, path);
        id--;
        showShedules();
    }

    public static void addNewSchedule() {
        AddNotes<Schedule> addNotes = ReadFile.initFromFile(path);
        Priority priority = changePriority();
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.println("Введите задачу которую хотите поставить в план: ");
        String note = scanner.nextLine();
        LocalDateTime start = createDate("Дата записи: ");
        LocalDateTime deadLine = createDate("Дата дедлайна: ");
        if (start.isAfter(deadLine)) {
            System.out.println("Извините но задача должна быть поставлена раньше чем сам дедлайн");
            changePriority();
        } else {
            for (int i = 0; i < addNotes.getScheduls().size(); i++) {
                if ((addNotes.getScheduls().get(i).getStartTime().isBefore(start)) && addNotes.getScheduls().get(i).getDeadLine().isAfter(deadLine)) {
                    System.out.println("Эта задача стоит в плане"); //TODO add details
                }
            }
            addNotes.addSchedule(new Schedule(id, name, note, start, deadLine, priority));
            id++;
        }
    }

    public static void changeSchedule() {
        AddNotes<Schedule> addNotes = ReadFile.initFromFile(path);
        showShedules();
        System.out.print("Введите номер задачи который хотите изменить: ");
        int num = scanner.nextInt();
        System.out.print("Введите новую задачу: ");
        String text = scanner.nextLine();
        changeNotes(num - 1, addNotes, text);
        System.out.print("Измените приоритет");
        changePriority(num - 1, addNotes);
        System.out.print("Измените дату: ");
        changeDateStart(num - 1, addNotes);
        System.out.print("Можете изменить дэдлайн: ");
        changeDeadline(num - 1, addNotes);
        SaveFile.saveFile(addNotes, path);
        showShedules();
    }



    private static LocalDateTime createDate(String str) {
        System.out.println(str);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.print("Введите дату и время /дд.ММ.гггг/: ");
        String date = scanner.nextLine();
        System.out.print("Введите время /чч:мм/");
        String time = scanner.nextLine();
        String dateTime = date + " " + time;
        LocalDateTime dt = LocalDateTime.parse(dateTime, formatter);
        System.out.print(formatter.format(dt));
        return dt;
    }

    private static Priority changePriority() {
        System.out.println("Выберите приоритет \n\t1) Низкий\n\t2) Средний \n\t3) Срочный");
        int num = scanner.nextInt();
        if (num == 1) {
            return Priority.LOW;
        } else if (num == 2) {
            return Priority.MIDDLE;
        } else if (num == 3) {
            return Priority.IMMIDIATE;
        } else {
            System.out.println("Нет такого из вариантов");
        }
        return Priority.IMMIDIATE;
    }
}


