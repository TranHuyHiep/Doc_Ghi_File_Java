package Bai2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bai2 {

    public static void ghiFile(Map<String, String> danhSach) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src\\Bai2\\account.txt"));

            output.writeObject(danhSach);

            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> docFile() {
        Map<String, String> danhSach = new HashMap<>();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("src\\Bai2\\account.txt"));

            danhSach = (Map<String, String>) input.readObject();

            input.close();
            return danhSach;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {
        Map<String, String> danhSach = new HashMap<>();
        danhSach = docFile();
        System.out.println(danhSach);
    }
}
