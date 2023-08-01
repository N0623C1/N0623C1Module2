package ss9_set_map;

import java.util.*;

public class SetStudy {
    public static void main(String[] args) {
//        Set<Integer> integerSet = new HashSet<>();
//        integerSet.add(new Integer(10));
//        integerSet.add(new Integer(10));
//        integerSet.add(new Integer(10));
//
//        System.out.println(integerSet.size()); // 3
//
//        Set<Student> students = new HashSet<>();
//        students.add(new Student(1, "Nguyễn Văn A", 9.6));
//        students.add(new Student(1, "Nguyễn Văn A", 9.6));
//        students.add(new Student(1, "Nguyễn Văn A", 9.6));
//
//        System.out.println(students.size()); // 3

//        Set<Integer> integerSet = new TreeSet<>(Collections.reverseOrder());
//        integerSet.add(10);
//        integerSet.add(-10);
//        integerSet.add(-20);
//        integerSet.add(30);
//        integerSet.add(50);
//
//        System.out.println(integerSet);
//
//        Set<Student> students = new TreeSet<>();
//        students.add(new Student(2, "Nguyễn Văn A", 9.6));
//        students.add(new Student(1, "Nguyễn Văn B", 9.6));
//
//        for(Student student : students) { // foreach
//            System.out.println(student);
//        }


//        List<Student> students = new ArrayList<>();
//        students.add(new Student(2, "Nguyễn Văn A", 9.6));
//        students.add(new Student(1, "Nguyễn Văn B", 9.6));
//
//        Collections.sort(students, Collections.reverseOrder());
//
//        for(Student student : students) { // foreach
//            System.out.println(student);
//        }

        // C#
                Set<Integer> integerSet = new HashSet<>();
        integerSet.add(new Integer(-10));
        integerSet.add(new Integer(10));
        integerSet.add(new Integer(100));
        integerSet.add(new Integer(50));
        integerSet.add(new Integer(40));

        System.out.println(integerSet);
    }
}
