/* Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
 значения которых в сумме дают число переданное в массив.

Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
Один и тот же элемент не может быть использован дважды.

array = [3, 8, 15, 17], Number = 23
result = [1,2]

Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23 */


import java.util.ArrayList;


public class ReturnIndexMethod {

    public static ArrayList<Integer> returnIndexes(int number, int[] array) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    indexes.add(i);
                    indexes.add(j);
                }
            }
        }
        return indexes;
    }


    public static void main(String[] args) {

        int number = 23;
        int[] array = {3, 8, 15, 17};

        System.out.println("Indexes of numbers that formed the required sum: "
                + (returnIndexes(number, array)));

    }
}

