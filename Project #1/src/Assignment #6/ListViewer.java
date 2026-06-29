//use this as your main entry point function, this Code performs all paramaters of the assignment:
//1. Uses the Class StudentList to add students as defined in the Student.class file.
import java.util.*;

class ListViewer {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        // My example students:
        studentList.add(new Student("Alice", 535, "123 Milton St"));
        // format is name, id, address
        studentList.add(new Student("#1 Hunter", 23, "789 Pine Rd"));
        studentList.add(new Student(":) Tammy", 843, "456 Oak Ave"));
        studentList.add(new Student("Miku", 341, "321 Elm St"));
        studentList.add(new Student("Eve", 44343, "654 Mullberry Dr"));
        studentList.add(new Student("Jacklin", 130, "987 Nighmare St"));
        studentList.add(new Student("Bojack", 3945, "111 Birch Blvd"));
        studentList.add(new Student("Hank", 3947, "222 Walnut Way"));
        studentList.add(new Student("Hill", 69433, "666 Spruce Ct"));
        studentList.add(new Student("Jack", 994393, "444 Ash Pl"));

        // call SortByName.class
        SelectionSort.sort(studentList, new SortByName());
        System.out.println("=== Student List (Sorted by Name) ===");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

        // call SortByRollNo.class
        SelectionSort.sort(studentList, new SortByRollNo());
        System.out.println("\n=== Student List (Sorted by Roll No) ===");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
