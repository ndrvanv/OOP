package schedular.view;

import schedular.modele.AddNotes;
import schedular.modele.Priority;
import schedular.modele.SaveFile;
import schedular.modele.Schedule;
import schedular.presenter.MenuHW4;

import java.time.LocalDateTime;
import java.util.Scanner;

//С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
//Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
//
//Например:
//определить уровень приоритетов: низкий, средний, немедленное выполнение
//выделить компоненту для хранения данных
//выделить компоненту для организации импорта\экспорта данных
//Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
//данные хранятся в файле csv/jsom/xml
//другие компоненты
public class Main {
    private static final String path = "C:\\Users\\1311103\\OneDrive\\Рабочий стол\\GB\\OOP\\src\\main\\java\\schedular\\plans.txt";
    private static final String MENU = "Выберите действие что хотели бы сделать" +
            "\n1)\tПоказать все имеющиеся заметки: " +
            "\n2)\tДобавить заметки: " +
            "\n3)\tИзменить план" +
            "\n4)\tУдалить заметку" +
            "\n5)\tДля выхода";

    public static void main(String[] args) {
        startMenu();
    }
    public static void data() {
        AddNotes<Schedule> scheduleAddNotes = new AddNotes();

        scheduleAddNotes.addSchedule(new Schedule(1, "Кот Петрович", "Накормить рыбу", LocalDateTime.of(23, 02, 26, 16, 10, 20),
                LocalDateTime.of(2023, 03, 10, 14, 05), Priority.IMMIDIATE));
        scheduleAddNotes.addSchedule(new Schedule(2,"Кот Матроскин", "Сделать домашку", LocalDateTime.of(2023, 02, 20, 12, 20, 20),
                LocalDateTime.of(2023, 03, 05, 10, 05), Priority.MIDDLE));
        scheduleAddNotes.addSchedule(new Schedule(3, "Кот Наплакал", "Посмотреть лекцию Камянецкого", LocalDateTime.of(23, 02, 25, 12, 00),
                LocalDateTime.of(23, 02, 25, 19, 00), Priority.LOW));
        SaveFile.saveFile(scheduleAddNotes, path);
    }
    public static void startMenu() {
        while (true) {
            System.out.println(MENU);
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    MenuHW4.showShedules();
                    break;
                case 2:
                    MenuHW4.addNewSchedule();
                    break;
                case 3:
                    MenuHW4.changeSchedule();
                    break;
                case 4:
                    MenuHW4.removeSchedule();
                    break;
                case 5:
                    break;

            }
        }
    }

}
