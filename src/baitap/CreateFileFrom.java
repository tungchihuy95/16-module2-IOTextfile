package baitap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileFrom {
    public static void main(String[] args) {
        try {
            FileWriter fileFrom = new FileWriter("From.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileFrom);
            bufferedWriter.write("Hi Tung \n My New Friend");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
