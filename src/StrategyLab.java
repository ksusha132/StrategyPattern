import java.io.IOException;
import java.util.Arrays;

public class StrategyLab {
    public static void main(String[] args) throws IOException {

        StrategyClient cu = new StrategyClient();// создаем объект класса клиента
        System.out.println("Type your number.");
        int number = IOutils.readInteger();

        System.out.println("Choose sorting.");
        int[] array0 = MatrixUtils.createMart(number); // инициализания массива
        System.out.println("Choose sorting: " + Arrays.toString(array0));
        cu.setStrategy(new ChooseSort()); // назначили стратегию
        cu.executeStartegy(array0); // выполнили
        System.out.println("After choose sorting: " + Arrays.toString(array0) + " Count itterations = " + cu.getStrategy().getCount());
        System.out.println();

        System.out.println("Inserting sorting.");
        int[] array1 = MatrixUtils.createMart(number); // инициализания массива
        System.out.println("Inserting sorting: " + Arrays.toString(array1));
        cu.setStrategy(new InsertSorting()); // назначили стратегию
        cu.executeStartegy(array1); // выполнили
        System.out.println("After inserting sorting: " + Arrays.toString(array1) + " Count itterations = " + cu.getStrategy().getCount());
        System.out.println();

        System.out.println("Bubble sorting.");
        int[] array2 = MatrixUtils.createMart(number); // инициализания массива
        System.out.println("Bubble sorting: " + Arrays.toString(array2));
        cu.setStrategy(new ChooseSort()); // назначили стратегию
        cu.executeStartegy(array2); // выполнили
        System.out.println("After bubble sorting: " + Arrays.toString(array2) + " Count itterations = " + cu.getStrategy().getCount());

    }
}
