import java.util.Arrays;

public class BubbleSort implements Sorting {
    public int count = 0;

    @Override
    public int getCount() {

        return count;
    }

    public void sort(int array[]) { // реализация метода, описанного в интерфейсе
        for (int i = 0; i <= array.length; i++) { // внешний проход по количество эл-тов
            for (int j = 0; j < array.length - 1 - i; j++) { // проход по парам (каждый эелемент вытылкиваем - i - 1 - для того, чтобы не трогать уже обработанные числа)
                if (array[j] > array[j + 1]) { // if element of the row bigger than next element we're going to replace it. (7 6)
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                count++; // counter
            }
        }
    }

}
