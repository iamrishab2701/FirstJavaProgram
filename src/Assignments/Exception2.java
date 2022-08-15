package Assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {

    public static void main(String[] args) throws IOException {

        FileReader fl = null;
        fl = new FileReader("C:\\Users\\RishabSingh\\Documents\\Test.txt");

        BufferedReader br = new BufferedReader(fl);
        System.out.println(br.readLine());


    }
}
