import java.io.*;
import java.util.Arrays;

public class InsertSorting implements Sorting {
    public int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++) { // внешний цикл по количеству элементов в массиве начинаем не с 0 а с первого элемента
            int index = i; // назначаем индекс = номеру эелемента
            while (index - 1 >= 0 && array[index] < array[index - 1]) { // ищем куда вставить наш элемент
                int tmp = array[index]; // меняем местами
                array[index] = array[index - 1];
                array[index - 1] = tmp;
                index--;
            }
            count++;
        }
    }
}

