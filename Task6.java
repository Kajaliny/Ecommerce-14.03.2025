import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Task6 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 88));
        students.add(new Student("Eve", 92));

        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        System.out.println("Average Marks: " + (total / students.size()));
    }
}
