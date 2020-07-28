package baitap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileTo {
    public static void main(String[] args) {
        try {
            File fileTo = new File("To.txt");
            fileTo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
