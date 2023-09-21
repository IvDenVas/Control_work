import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        boolean work = true;
        while (work) {
            System.out.println("""
                    Выберите действие из меню:\s
                    1-завести новое животное
                    2-увидеть список команд, которое выполняет животное
                    3-Обучить животное новым командам
                    4-Выход""");
            try {
                Scanner scanner = new Scanner(System.in);
                String inputOne = scanner.nextLine();
                if(isNumeric(inputOne) && (inputOne.equals("1") || inputOne.equals("2") || inputOne.equals("3") ||
                        inputOne.equals("4"))) {
                    AnimalService aService = new AnimalService();
                    label:
                    switch (inputOne) {
                        case "1" -> {
                            switch (chooseClassOfUser()) {
                                case "1" -> aService.write(new Dog(getNameFromUser(), getDateFromUser()),
                                        "dogs");
                                case "2" -> aService.write(new Cat(getNameFromUser(), getDateFromUser()),
                                        "cats");
                                case "3" -> aService.write(new Hamster(getNameFromUser(), getDateFromUser()),
                                        "hamsters");
                                case "4" -> aService.write(new Horse(getNameFromUser(), getDateFromUser()),
                                        "horses");
                                case "5" -> aService.write(new Camel(getNameFromUser(), getDateFromUser()),
                                        "camels");
                                case "6" -> aService.write(new Donkey(getNameFromUser(), getDateFromUser()),
                                        "donkeys");
//                                default -> throw new RuntimeException("Такого класса нет! Попробуйте заново!");
                            }
                        }
                        case "2" -> {
                            switch (chooseClassOfUser()) {
                                case "1" -> aService.readListOfClass("commands_dog");
                                case "2" -> aService.readListOfClass("commands_cat");
                                case "3" -> aService.readListOfClass("commands_hamster");
                                case "4" -> aService.readListOfClass("commands_horse");
                                case "5" -> aService.readListOfClass("commands_camel");
                                case "6" -> aService.readListOfClass("commands_donkey");
                            }
                        }
                        case "3" -> {
                            switch (chooseClassOfUser()) {
                                case "1" -> aService.write(getCommandFromUser(), "commands_dog");
                                case "2" -> aService.write(getCommandFromUser(), "commands_cat");
                                case "3" -> aService.write(getCommandFromUser(), "commands_hamster");
                                case "4" -> aService.write(getCommandFromUser(), "commands_horse");
                                case "5" -> aService.write(getCommandFromUser(), "commands_camel");
                                case "6" -> aService.write(getCommandFromUser(), "commands_donkey");
                            }
                        }
                        case "4" -> {
                            System.out.println("До встречи!");
                            work = false;
                        }
                    }
                } else {
                    throw new RuntimeException("Такого пункта меню нет! Попробуйте еще!");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static String getNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        return name;
    }
    public  static String getDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате dd.MM.yyyy: ");
        String date = scanner.nextLine();
        boolean work = true;
        while (work) {
            if(isDate(date)) {

                return date;

            } else {
                throw new RuntimeException();

            }
        }
        return date;
    }
    private static boolean isDate(String str) {
        if (str == null) {
            return false;
        }
        try {
            LocalDate d = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static String chooseClassOfUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                                    Выберите класс животного:
                                    1-Собака
                                    2-Кошка
                                    3-Хомяк
                                    4-Лошадь
                                    5-Верблюд
                                    6-Осел""");
        String res = scanner.nextLine();
        if (isNumeric(res) && Integer.parseInt(res) > 0 && Integer.parseInt(res) < 7) {
            return res;
        } else {
            throw new RuntimeException("Неверный ввод! Попробуйте заново!");
        }
    }
    public static String getCommandFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую команду: ");
        String command = scanner.nextLine();
        return command;
    }
}