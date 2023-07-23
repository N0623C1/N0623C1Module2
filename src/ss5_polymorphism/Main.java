package ss5_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        student: id, name, score
        teacher: id, name, salary
         */

        // Đa hình => Cha có thể tham chiếu đến con
//        Person person = new Student();
//
//        // runtime => đối tượng tham chiếu tới
//
//        person.run();
//
//        person.add(10, 20);

//        Student s1 = new Student(1, "Nguyễn Văn A", 9.6);
//        Student s2 = new Student(2, "Nguyễn Văn A", 9.6);

        //Sắp xếp giá của tất cả điện thoại tăng dần
        // List 1 => DT cũ [5, 6, 4]
        // List 2 => DT mới [5.5, 6, 4]
//        ArrayList<Person> people = new ArrayList<>();
//        people.addAll(Arrays.asList(new Student(), new Student()));
//        people.add(new Teacher());

//        System.out.println(s1 == s2); // false
//        System.out.println(s1.equals(s2)); // true
//
//        Object object = new Student();
//        Object object2 = new Integer(5);
//        Object object3 = new String("123");


//        System.out.println(student.toString());
//        System.out.println(student); // tự động gọi đến phương thức toString()
//        String str = "";
//        str += student.toString();
//        str += student;

        /*
        Student: 3 thuộc tính
        Person: 2 thuộc tính
         */
        Person person = new Person(); // Ngầm định: Con => Cha

        // instanceof kiểm tra đối tượng hiện tại có phải là Student hay không => Kiểm tra lúc runtime
        if(person instanceof Student) {
            Student student = (Student) person; // Tường minh: Cha => Con
        }
    }
}
