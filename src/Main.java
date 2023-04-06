import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static class Student {
        private String name;
        private int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public int getCourse() {
            return course;
        }
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 2));

        System.out.println("Students in course 1:");
        printStudents(students, 1);

        System.out.println("Students in course 2:");
        printStudents(students, 2);
    }
}
