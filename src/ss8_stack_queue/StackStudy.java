package ss8_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
        int n = 6;
        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        /*
        Quy đổi số thập phân sang nhị phân
         */
    }
}
