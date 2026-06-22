import java.util.*;

// Name Sort Class.
class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }

    public static void main(String[] args) {
        ArrayList<Student> list = StudentList.getStudentList();

        SelectionSort.sort(list, new SortByName());

        System.out.println("=== Student List (Sorted by Name) ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}