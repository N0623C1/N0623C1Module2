package ss7_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> arrayList = new ArrayList<>();

//        MyArrayList arrayList = new MyArrayList(5);
//
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(50);
//        arrayList.add(60);

//        System.out.println(arrayList);


        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(40);
        myLinkedList.addFirst(50);
        myLinkedList.addLast(100);
        myLinkedList.addLast(200);
        myLinkedList.add(2, 99);

        System.out.println(myLinkedList);
    }
}
