package day1.worksheet;

class Student {
    private static int counter = 0; // static counter for total students
    private int studentId;
    private String name;

    // Constructor
    public Student(String name) {
        counter++;
        this.studentId = counter;  // Assign unique ID
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }

    // Static method to get total number of students
    public static int getTotalStudents() {
        return counter;
    }
}

public class Q6_StudentRegistry {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        System.out.println("Total number of students: " + Student.getTotalStudents());
    }
}
