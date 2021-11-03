import java.util.ArrayList;
import java.util.Random;

/**
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 */
public class Task0 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt());
        }

        list.stream()
                .distinct()                                         // - Удалить дубликаты
                .peek(e -> {                                        // - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
                    if (e % 2 == 0 && e >= 7 && e <= 17)
                        System.out.println(e);
                })
                .map(e -> e * 2)                                    // - Каждый элемент умножить на 2
                .sorted()                                           // - Отсортировать
                .limit(4).forEach(System.out::println);             // - Вывести на экран первых 4 элемента

        long count = list.stream().count();
        System.out.println(count);                                  // - Вывести количество элементов в стриме

        int sum = list.stream().reduce(Integer::sum).get();
        System.out.println(sum / count);                            // - Вывести среднее арифметическое всех чисел в стриме
    }
}
