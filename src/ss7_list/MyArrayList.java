package ss7_list;

public class MyArrayList {
    private int[] arr;
    private int capacity = 10;
    private int size = 0;

    public int size() {
        return size;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void add(int element) {
        if(size == capacity) {
            this.capacity *= 1.5;
            int[] brr = new int[capacity];

            for(int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }
            // tăng kích thước lên 1.5 lần
            arr = brr;
        }

        arr[size] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++) {
            stringBuilder.append(arr[i] + "\t");
        }
        return stringBuilder.toString();
    }
}
