package ExpectionHandling;

import java.io.*;

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException, InterruptedException {

        FileReader fr = null;
        fr = new FileReader("C:\\Users\\RishabSingh\\Documents\\Test.txt");

        BufferedReader bfr = new BufferedReader(fr);
        System.out.println(bfr.readLine());

        Thread.sleep(5000);

    }
}
