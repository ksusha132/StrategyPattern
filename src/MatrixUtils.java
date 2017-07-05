import java.io.IOException;


public class MatrixUtils {

    public  static int[] createMart(int size) throws IOException { // create
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        return array;
    }
}
