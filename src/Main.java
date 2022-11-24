import java.io.*;

public class Main {
    public static void docFileText() {
        try {
            FileReader input = new FileReader("input.txt");
            FileWriter output = new FileWriter("output.txt");

            int line;
            while((line = input.read()) != -1) {
                output.write(line);
                System.out.println(line);
            }

            output.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ghiFileNhiPhan() {
        try {
            FileReader input = new FileReader("input.txt");
            FileOutputStream output = new FileOutputStream("inputNhiPhan.txt");

            int line;
            while((line = input.read()) != -1) {
                output.write(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void docFileNhiPhan() {
        try {
            FileInputStream input = new FileInputStream("inputNhiPhan.txt");
            FileOutputStream output = new FileOutputStream("src\\outputNhiPhan.txt");

            int line;

            while((line = input.read()) != -1) {
                output.write(line);
            }

            input.close();
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
//        docFileText();
//        ghiFileNhiPhan();
        docFileNhiPhan();
    }
}