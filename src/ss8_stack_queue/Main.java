package ss8_stack_queue;

import ss5_polymorphism.Student;
import ss7_list.MyLinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//
//        arrayList.add(10);
////        arrayList.add("20");
////        arrayList.add(20.3);
//
//        // Cộng tất cả số ở trong ArrayList
//        double total = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
////            if (arrayList.get(i) instanceof Integer) {
////                total += (Integer) arrayList.get(i);
////            } else if (arrayList.get(i) instanceof Double) {
////                total += (Double) arrayList.get(i);
////            }
//            total += arrayList.get(i);
//        }
//
//        System.out.println(total);

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(new Student());
        myLinkedList.addFirst(new Student());

        Integer[] arr = {10, 20, 30};
        printArray(arr);
    }

    static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
