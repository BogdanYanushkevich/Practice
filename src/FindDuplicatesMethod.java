/* Дан массив целых чисел. Необходимо реализовать метод, которые определяет,
содержит ли данный массив дубликаты
(только факт наличия дубликатов - подсчитывать количество повторений НЕ нужно).

Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза

Array: [4,5,6,7,8]
Result: false
Дубликатов нет
*/

import java.util.TreeSet;

public class FindDuplicatesMethod {

    public static boolean findDuplicates(int[] array) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int j : array) {
            if (!ts.add(j)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 6, 8};
        int[] array1 = {4, 5, 6, 7, 8};

        System.out.println("Presence of duplicates in this array: " + findDuplicates(array));
        System.out.println("Presence of duplicates in this array: " + findDuplicates(array1));

    }
}
