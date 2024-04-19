package model;

import java.util.LinkedList;
import java.util.Queue;

public class AppQueue {
    public static void main(String[] args) {
        Queue<Student> queue = new LinkedList<>();
        Student student1 = new Student("Nam", "Nam@gmail.com", "C01");
        Student student2 = new Student("Gau", "Nam@gmail.com", "C02");
        Student student3 = new Student("Hi", "Nam@gmail.com", "C02");
        Student student4 = new Student("Ta", "Nam@gmail.com", "C04");
        Student student5 = new Student("TR", "Nam@gmail.com", "C05");
        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        queue.add(student4);
        queue.add(student5);
        System.out.println("Dang tong so sinh vien: " + queue.size());

    }
}

