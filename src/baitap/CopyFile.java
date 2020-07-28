package baitap;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fromFile=new FileReader("From.txt");
            BufferedReader reader=new BufferedReader(fromFile);
            FileWriter toFile=new FileWriter("To.txt");
            BufferedWriter writer=new BufferedWriter(toFile);
            //Cách copy từng dòng:
            /*String line=null;
            int count=0;
            while ((line=reader.readLine())!=null) {
                writer.write(line+"\n");
                count++;
            }*/
            //Cách copy từng charactor:
            int copy;
            int count=0;
            while ((copy=reader.read())!=-1) {
                writer.write(copy);
                count++;
            }
            writer.close();
            System.out.println("Numbers of charactor copied: "+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
