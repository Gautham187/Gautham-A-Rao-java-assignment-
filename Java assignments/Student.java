public class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + this.name + ", Marks: " + this.marks);
    }

    public static void main(String[] args) {
        // Creating two Student objects sharing the same class blueprint
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 92);

        student1.displayDetails();
        student2.displayDetails();
    }
}