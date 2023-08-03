package ss10_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main1 {
    public static void main(String[] args) {
//        Integer.parseInt("123.0");
//        int[] arr = {10, 20};
//        arr[2] = 100;
//        System.out.println("Line số 7");
//        int a = 1 / 0; // Vô cùng
//
//        System.out.println(a);


       try {
           readFile();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }


        try {
            checkRange(new int[0], 2, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Chương trình kết thúc không lỗi lầm!!!");
    }

    public static void checkRange(int[] arr, int index, int value) throws Exception {
        if(index < 0 || index > arr.length) {
            throw new Exception("Ngoài phạm vi truy cập");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("src/ss9_set_map/MapStudy.jav");
        FileReader fileReader = new FileReader(file);
    }
}
