package Asg_4;

import java.util.*;

class Name {
    String FirstName;
    String MiddleName;
    String LastName;

    Name(String FirstName, String MiddleName, String LastName) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
    }

    void display() {
        System.out.println("Student Name : "
                + FirstName + " "
                + MiddleName + " "
                + LastName);
    }
}

class DOB {
    int date;
    int month;
    int year;

    DOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void display() {
        System.out.println("Date of Birth : "
                + date + "/" + month + "/" + year);
    }
}

class Student {

    int ID;
    char gender;

    // 1D array
    int[] marks = new int[3];

    // Aggregation
    Name N;
    DOB D;

    Student(int ID, char gender, Name N, DOB D, int[] marks) {

        this.ID = ID;
        this.gender = gender;
        this.N = N;
        this.D = D;

        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }
    }

    void display() {

        System.out.println("\n----------------------------------");

        System.out.println("Student ID  : " + ID);

        N.display();

        System.out.println("Gender      : " + gender);

        D.display();

        System.out.println("Marks:");

        System.out.println("English     : " + marks[0]);

        System.out.println("Mathematics : " + marks[1]);

        System.out.println("Computer Sc : " + marks[2]);

        System.out.println("----------------------------------");
    }
}

public class Asg_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array of Student objects
        Student[] students = new Student[n];

        // =========================
        // Create Student Database
        // =========================

        for (int i = 0; i < n; i++) {

            System.out.println("\n===== Student " + (i + 1) + " =====");

            // ID
            System.out.print("Enter Student ID: ");
            int ID = sc.nextInt();

            // Name
            System.out.print("Enter First Name: ");
            String firstName = sc.next();

            System.out.print("Enter Middle Name (enter - if none): ");
            String middleName = sc.next();

            if (middleName.equals("-")) {
                middleName = "";
            }
            System.out.print("Enter Last Name: ");
            String lastName = sc.next();

            Name N = new Name(
                    firstName,
                    middleName,
                    lastName
            );

            // Gender
            System.out.print("Enter Gender [M/F/O]: ");
            char gender = sc.next().charAt(0);

            // DOB
            System.out.print("Enter Date of Birth: ");
            int date = sc.nextInt();

            System.out.print("Enter Month of Birth: ");
            int month = sc.nextInt();

            System.out.print("Enter Year of Birth: ");
            int year = sc.nextInt();

            DOB D = new DOB(
                    date,
                    month,
                    year
            );

            // Marks
            int[] marks = new int[3];

            System.out.print("Enter English Marks: ");
            marks[0] = sc.nextInt();

            System.out.print("Enter Mathematics Marks: ");
            marks[1] = sc.nextInt();

            System.out.print("Enter Computer Science Marks: ");
            marks[2] = sc.nextInt();

            // Create Student object
            students[i] = new Student(
                    ID,
                    gender,
                    N,
                    D,
                    marks
            );
        }

        // =========================
        // Display Database
        // =========================

        System.out.println("\n\n========== STUDENT DATABASE ==========");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        // =========================
        // Search Menu
        // =========================

        while (true) {

            System.out.println("\n========== SEARCH MENU ==========");
            System.out.println("1. Search by ID");
            System.out.println("2. Search by Name");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int searchID = sc.nextInt();

                    boolean foundID = false;

                    for (Student s : students) {

                        if (s.ID == searchID) {

                            System.out.println("\nStudent Found:");
                            s.display();

                            foundID = true;
                            break;
                        }
                    }

                    if (!foundID) {
                        System.out.println("Student not found!");
                    }

                    break;

                case 2:

                    System.out.print("Enter Student First Name: ");
                    String searchName = sc.next();

                    boolean foundName = false;

                    for (Student s : students) {

                        if (s.N.FirstName.equalsIgnoreCase(searchName)) {

                            System.out.println("\nStudent Found:");
                            s.display();

                            foundName = true;
                            break;
                        }
                    }

                    if (!foundName) {
                        System.out.println("Student not found!");
                    }

                    break;

                case 3:

                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}