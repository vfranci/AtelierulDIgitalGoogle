package collections.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        Student stud = new Student("1234567893", "Andrei Popescu2");
        students.add(new Student("1234567890", "Ana Maria"));
        students.add(new Student("1234567891", "Andrei Popescu"));
        students.add(new Student("1234567892", "Ana Maria2"));
        //students.add(new Student("1234567893", "Andrei Popescu2"));
        students.add(stud);
        students.add(stud);
        students.add(stud);
        StudentDataBase sd = new StudentDataBase(students);
        String name = sd.findStudentName("1234567891");
        System.out.println(name);
        String name1 = sd.findStudentName("1234567892");
        System.out.println(name1);
        HashSet<Student> hashStudents = new HashSet<>(students);
        System.out.println("HS = " + hashStudents);

    }
}
