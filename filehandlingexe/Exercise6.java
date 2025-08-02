import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercise6 {

    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });

        queue.offer(new Student("Bibek", 'C'));
        queue.offer(new Student("Anish", 'A'));
        queue.offer(new Student("Rita", 'B'));
        queue.offer(new Student("Anish", 'A'));

        System.out.printf("%s\n", queue);

        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());

    }

    public static class Student {

        private final String name;
        private final char grade;

        Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return this.name;
        }

        public char getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }

    }
}
