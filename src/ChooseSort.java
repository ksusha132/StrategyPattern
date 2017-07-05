import java.io.IOException;
import java.util.Arrays;


class ChooseSort implements Sorting {
    public int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    public void sort(int array[]) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) { // внешний фор проходит по элементам от первого до последнего
            min = i; // запоминаем индекс текущего элемента/ ищем минимальный элемент чтобы поместить на место 1 ого
            for (int j = i + 1; j < array.length; j++) { // length - 1 не нужен так как при послед иттерации последнмй элемент займет свое место и так
                if (array[j] < array[min]) { // если второй элемент массива меньше первого
                    min = j; // тогда ставим индекс второго в мин/ говорим, что он минимальный
                }
                int tmp = array[i]; // меняем местами
                array[i] = array[min];
                array[min] = tmp;
                count++; // счетчик иттераций
            }
        }
    }
}


