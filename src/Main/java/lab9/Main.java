package Main.java.lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

// Student class
class Student {
    private String name;
    private String rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber='" + rollNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return rollNumber.equals(student.rollNumber);
    }

    @Override
    public int hashCode() {
        return rollNumber.hashCode();
    }
}

// Course class for managing student enrollments
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + courseName);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// GradeBook class for recording and retrieving student grades
class GradeBook {
    private Map<Student, String> studentGrades;

    public GradeBook() {
        studentGrades = new HashMap<>();
    }

    public void recordGrade(Student student, String grade) {
        studentGrades.put(student, grade);
        System.out.println("Recorded grade " + grade + " for student " + student.getName());
    }

    public String getGrade(Student student) {
        return studentGrades.get(student);
    }

    public void printAllGrades() {
        for (Map.Entry<Student, String> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName() + ", Grade: " + entry.getValue());
        }
    }
}

// LibraryNotificationSystem class for managing overdue book notifications
class LibraryNotificationSystem {
    private Set<Student> studentsWithOverdueBooks;

    public LibraryNotificationSystem() {
        studentsWithOverdueBooks = new HashSet<>();
    }

    public void addOverdueNotification(Student student) {
        studentsWithOverdueBooks.add(student);
        System.out.println("Notification sent to student " + student.getName() + " for overdue books.");
    }

    public boolean hasOverdueBooks(Student student) {
        return studentsWithOverdueBooks.contains(student);
    }

    public void notifyAllOverdueStudents() {
        for (Student student : studentsWithOverdueBooks) {
            System.out.println("Sending notification to student " + student.getName() + " for overdue books.");
        }
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "2022-SE-001");
        Student student2 = new Student("Bob", "2022-SE-002");

        // Enrollment system
        Course course = new Course("Data Structures");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("\nEnrolled students in Data Structures:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        // Grades recording system
        GradeBook gradeBook = new GradeBook();
        gradeBook.recordGrade(student1, "A");
        gradeBook.recordGrade(student2, "B");

        System.out.println("\nGrades recorded:");
        gradeBook.printAllGrades();

        // Library notification system
        LibraryNotificationSystem libraryNotificationSystem = new LibraryNotificationSystem();
        libraryNotificationSystem.addOverdueNotification(student1);

        System.out.println("\nStudents with overdue books:");
        libraryNotificationSystem.notifyAllOverdueStudents();
    }
}

