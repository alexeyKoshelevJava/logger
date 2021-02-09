import java.util.ArrayList;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаю программу");
        logger.log("Прошу пользователя ввести входные данные");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи два числа через пробел. Первое число, это кол-во элементов, 2-е максимальное значение");


        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        try {
            int value = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("this is not number");
        }
        int listSize = Integer.parseInt(parts[0]);

        try {
            int maxValue = Integer.parseInt(parts[1]);

        } catch (NumberFormatException e) {
            System.out.println("this is not number");
        }
        int maxValue = Integer.parseInt(parts[1]);
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        logger.log("Наполняем список");
        while (count < listSize) {
            list.add(random.nextInt(maxValue));
            count++;

        }
        System.out.println("вот мой список исходных значений " + list);
        logger.log("просим ввести пользователя порог для фильтрации списка ");
        System.out.println("Введите порог для фильтрации списка");
        String input1 = scanner.nextLine();
        try {
            int value = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            System.out.println("вы ввели не число");
        }
        int treshold = Integer.parseInt(input1);
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим значение на экран");
        System.out.println(result);
        logger.log("Завершаем программу");
    }
}
