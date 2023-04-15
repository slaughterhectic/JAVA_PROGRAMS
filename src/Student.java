import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private double cgpa;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    public void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        double minCGPA = Double.MAX_VALUE;
        String minCGPAName = "";

        System.out.println("Enter the details of " + n + " students:");
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].read();
            if (students[i].cgpa < minCGPA) {
                minCGPA = students[i].cgpa;
                minCGPAName = students[i].name;
            }
        }

        System.out.println("Details of all students:");
        System.out.println("Roll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        System.out.println("The student with the lowest CGPA is " + minCGPAName);
    }
}
