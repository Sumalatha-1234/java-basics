//Sort a list of students by marks using Comparator
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 88));
        list.add(new Student("Bob", 75));
        list.add(new Student("Charlie", 92));

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks; // descending order
            }
        });

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
/*
output:
Charlie - 92
Alice - 88
Bob - 75
 */
