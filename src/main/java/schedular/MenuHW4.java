package schedular;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import static java.util.Locale.ENGLISH;

public class MenuHW4 {
    private static final String path = "C:\\Users\\1311103\\OneDrive\\Рабочий стол\\GB\\OOP\\src\\main\\java\\schedular\\plans.txt";
    private static Scanner scanner = new Scanner(System.in);
    private static int id = 4;

    public static void startWork() {
    AddNotes<Schedule> scheduleAddNotes = new AddNotes();

    scheduleAddNotes.addSchedule(new Schedule(1, "Кот Петрович", "Накормить рыбу", LocalDateTime.of(23, 02, 26, 16, 10, 20),
             LocalDateTime.of(2023, 03, 10, 14, 05), Priority.IMMIDIATE));
    scheduleAddNotes.addSchedule(new Schedule(2,"Кот Матроскин", "Сделать домашку", LocalDateTime.of(2023, 02, 20, 12, 20, 20),
            LocalDateTime.of(2023, 03, 05, 10, 05), Priority.MIDDLE));
    scheduleAddNotes.addSchedule(new Schedule(3, "Кот Наплакал", "Посмотреть лекцию Камянецкого", LocalDateTime.of(23, 02, 25, 12, 00),
            LocalDateTime.of(23, 02, 25, 19, 00), Priority.LOW));
    SaveFile.saveFile(scheduleAddNotes, path);

    }
    public static void showShedules() {
//        startWork();
        AddNotes<Schedule> scheduleAddNotes = ReadFile.initFromFile(path);
        scheduleAddNotes.showShedules();
    }
    public static void removeSchedule() {
        AddNotes<Schedule> scheduleAddNotes = ReadFile.initFromFile(path);
        showShedules();
        System.out.println("Введите номер задачи, которую хотите удалить: ");
        int num = scanner.nextInt();
        scheduleAddNotes.removeSchedule(scheduleAddNotes.getSchedals().get(num - 1));
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
        }else {
            for(int i = 0; i < addNotes.getSchedals().size(); i++) {
                if((addNotes.getSchedals().get(i).getStartTime().isBefore(start)) && addNotes.getSchedals().get(i).getDeadLine().isAfter(deadLine)) {
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
    private static void changeDeadline(int num, AddNotes<Schedule> addNotes) {
        addNotes.changeDeadline(addNotes.getSchedals().get(num), createDate("Установите новую дату и время дедлайна: "));
    }
    private static void changeDateStart(int num, AddNotes<Schedule> addNotes) {
        addNotes.changeDateStart(addNotes.getSchedals().get(num), createDate("Установите новую дату и время: "));
    }
    private static void changePriority(int num, AddNotes<Schedule> addNotes) {
        addNotes.changePriority(addNotes.getSchedals().get(num), changePriority());
    }
    private static void changeNotes(int num, AddNotes<Schedule> addNotes, String text) {
        addNotes.changeNotes(addNotes.getSchedals().get(num), text);
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
        }
        else if (num == 2) {
            return Priority.MIDDLE;
        }
        else if (num == 3) {
            return Priority.IMMIDIATE;
        }
        else {
            System.out.println("Нет такого из вариантов");
        }
        return Priority.IMMIDIATE;
    }



}
