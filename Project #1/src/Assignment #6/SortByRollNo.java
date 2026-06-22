import java.util.*;

//Roll Number sort class.
class SortByRollNo implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = StudentList.getStudentList();

        SelectionSort.sort(list, new SortByRollNo());

        System.out.println("=== Student List (Sorted by Roll No) ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}