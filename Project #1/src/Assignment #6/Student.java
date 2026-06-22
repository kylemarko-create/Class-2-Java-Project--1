// Create a Java program that will store 10 student objects in an ArrayList, 

// ArrayList<Student>. A student object consists of the following fields:

// int rollno
// String name
// String address

// Implement two comparator classes to sort student objects 
// by name and by rollno (roll number). 
// Implement your own selection sort method and place your code in a separate Java source file. 
// Do not use a sort method from the Java collections library.

import java.util.ArrayList;

public class Student {
    // ArrayList<Student>

    // int rollno
    public int rollno;
    // String name
    public String name;
    // String address
    public String address;

    public Student(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public String getName() { return name; }
    public int getRollNo() { return rollno; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}