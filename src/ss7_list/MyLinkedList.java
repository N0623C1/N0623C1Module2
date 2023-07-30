package ss7_list;

public class MyLinkedList<E> {
    private class Node {
        E value;
        Node next; // mặc định tham chiếu đến null

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head; // mặc định tham chiếu đến null
    private Node tail; // mặc định tham chiếu đến null
    private int size = 0;

    public void addFirst(E element) {
        Node newNode = new Node(element);

        if (head == null) { // danh sách rỗng
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);

        if (head == null) { // danh sách rỗng
            addFirst(element);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, E element) {
        if(index < 0 || index > size) {
            System.out.println("Ngoài phạm vi");
        } else if(index == 0) {
            addFirst(element);
        } else if(index == size) {
            addLast(element);
        } else {
            Node temp = head;
            for(int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;

            size++;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
//        while (temp.next != null) {
//            stringBuilder.append(temp.value + "\t");
//            temp = temp.next;
//        }
//        stringBuilder.append(temp.value + "\t");

        for(int i = 0; i < size; i++) {
            stringBuilder.append(temp.value + "\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
