package demojavacollectionframework;

import model.Student;

import java.util.HashMap;

import java.util.Map;


public class AppMap {
    public static void main(String[] args) {
        Map<String, Student> myMap = new HashMap<>();
        Student student1 = new Student("quan", "Nam@gmail.com", "C01");
        myMap.put("quan", student1);        // puts key adn vaoye
        for(Object key : myMap.keySet()){
            System.out.println( myMap.get(key));
        }
        System.out.println(myMap.keySet()); // display keys

    }
}

