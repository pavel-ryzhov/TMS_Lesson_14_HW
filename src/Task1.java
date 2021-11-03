import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * 	- Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * 	- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * 	- Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vitaliy", "Maria", "Pavel", "Anton", "Kirill", "Alexandr"));

        System.out.println(names.stream().filter(e -> e.equalsIgnoreCase("pavel")).count());    // - Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)

        names.stream().filter(e -> e.toLowerCase().startsWith("a")).forEach(System.out::println);          // - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)

        System.out.println(names.isEmpty() ? "Empty": names.stream().sorted().findFirst().get());          // - Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
    }
}
