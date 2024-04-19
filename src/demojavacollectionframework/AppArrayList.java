package demojavacollectionframework;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppArrayList {
    public static void main(String[] args) {
        List<Student> myList = new ArrayList<Student>();
        Student student1 = new Student("Nam", "Nam@gmail.com", "C01");
        Student student2 = new Student("Gau", "Nam@gmail.com", "C02");
        Student student3 = new Student("Hi", "Nam@gmail.com", "C02");
        Student student4 = new Student("Ta", "Nam@gmail.com", "C04");
        Student student5 = new Student("TR", "Nam@gmail.com", "C05");
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.add(student4);
        myList.add(student5);
        System.out.println("Dang tong so sinh vien: " + myList.size());

    }
}

