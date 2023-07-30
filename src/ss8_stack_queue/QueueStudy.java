package ss8_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(10);// 40 30 20 10
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);

        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.remove());
        }
    }
}
