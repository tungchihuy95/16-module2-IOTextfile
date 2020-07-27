import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //Doc file theo duong dan
            ///Users/tungchihuy95/Desktop/tung.txt
            File file = new File(filePath);

            //Kiem tra neu file khong ton tai thi nem ra ngoai le.
            if (!file.exists()) {
                file.createNewFile();
//                throw new FileNotFoundException();
            }

            //Doc tung dong cua file va tien hanh cong Tong lai:
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            //Hien thi ra man hinh tong cac so nguyen trong file
            System.out.println("Tong = " + sum);

        } catch (Exception e) {
            //Truong hop file khong ton tai hoac noi dung file co loi thi se hien thi thong bao loi;
            System.err.println("File khong ton tai or noi dung co loi");

        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
