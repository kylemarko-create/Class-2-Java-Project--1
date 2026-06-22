//Do not run independently, not scoped to perform all functions.
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    static ArrayList<Student> studentList = new ArrayList<Student>();

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    public static void main(String[] args){
        Scanner studentScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Enter Name");
            String name = studentScanner.nextLine();

            System.out.println("Enter ID Number");
            int rollno = studentScanner.nextInt();
            studentScanner.nextLine();

            System.out.println("Enter Address");
            String address = studentScanner.nextLine();

            studentList.add(new Student(name, rollno, address));
            System.out.println("---------------");
        }

        System.out.println("10 students added.");
        //to view the sort methods, please run listviewer.java, this module is not designed to run on its own.

        studentScanner.close();
    }
}

// Create a Java program that will store 
// 10 student objects in an ArrayList, 

// ArrayList<Student>. A student object consists of the following fields:

// int rollno
// String name
// String address

// Implement two comparator classes to sort student objects 
// by name and by rollno (roll number). 
// Implement your own selection sort method and place 
// your code in a separate Java source file. 
// Do not use a sort method from the Java collections library.