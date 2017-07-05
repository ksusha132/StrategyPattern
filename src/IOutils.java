import java.io.*;


public class IOutils {
    public static int readInteger() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        int res = Integer.parseInt(a);

        return res;
    }
}
