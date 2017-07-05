import java.io.*;
import java.util.Arrays;

// strategy client - why use strategy.
public class StrategyClient {
    Sorting strategy; // link on interface Sorting

    public void setStrategy(Sorting strategy) { // та стратегия, которую мы передаем в функцию при ее вызове в майне
        this.strategy = strategy; // set strategy // назначаем какой вид стратегии мы хотим реализовать
    }

    public void executeStartegy(int array[]) {
        strategy.sort(array); // execute strategy // вызываем функцию сортировки массива на ту стратегию, которую назначили выше
    }

    public Sorting getStrategy() {
        return strategy;
    }
}





