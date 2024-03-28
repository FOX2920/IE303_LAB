/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth2;

/**
 *
 * @author Hii
 */
import java.util.*;

// Define the structure of a Student
class Student {
    int studentID;
    String fullName;
    double calculusGrade;
    double physicsGrade;
    double programmingGrade;
    double averageGrade;

    // Method to calculate the average grade
    void calculateAverageGrade() {
        averageGrade = (calculusGrade + physicsGrade + programmingGrade) / 3;
    }
}

//public class BT2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of students: ");
//        int n = scanner.nextInt();
//        
//        // Initialize the array of students
//        Student[] studentList = new Student[n];
//        
//        // Input student information
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter information for student " + (i + 1) + ":");
//            studentList[i] = new Student();
//            studentList[i].studentID = i + 1;
//            scanner.nextLine(); // Consume newline left-over
//            System.out.print("Full name: ");
//            studentList[i].fullName = scanner.nextLine();
//            System.out.print("Calculus grade: ");
//            studentList[i].calculusGrade = scanner.nextDouble();
//            System.out.print("Physics grade: ");
//            studentList[i].physicsGrade = scanner.nextDouble();
//            System.out.print("Programming grade: ");
//            studentList[i].programmingGrade = scanner.nextDouble();
//            
//            // Calculate the average grade
//            studentList[i].calculateAverageGrade();
//        }
//        
//        // List of students who receive scholarships
//        System.out.println("\nList of students who receive scholarships:");
//        for (int i = 0; i < n; i++) {
//            if (studentList[i].averageGrade >= 8.0 && studentList[i].programmingGrade >= 9.0) {
//                System.out.println("Student ID: " + studentList[i].studentID);
//                System.out.println("Full name: " + studentList[i].fullName);
//                System.out.println("Average grade: " + String.format("%.2f", studentList[i].averageGrade));
//                System.out.println();
//            }
//        }
//        
//        // Find students with the highest average grade
//        double maxAverageGrade = studentList[0].averageGrade;
//        for (int i = 1; i < n; i++) {
//            if (studentList[i].averageGrade > maxAverageGrade) {
//                maxAverageGrade = studentList[i].averageGrade;
//            }
//        }
//        
//        // Print information of students with the highest average grade
//        System.out.println("\nInformation of students with the highest average grade:");
//        for (int i = 0; i < n; i++) {
//            if (studentList[i].averageGrade == maxAverageGrade) {
//                System.out.println("Student ID: " + studentList[i].studentID);
//                System.out.println("Full name: " + studentList[i].fullName);
//                System.out.println("Average grade: " + String.format("%.2f", studentList[i].averageGrade));
//                System.out.println();
//            }
//        }
//        
//        // Sort the list of students in descending order of average grade
//        Arrays.sort(studentList, new Comparator<Student>() {
//            public int compare(Student s1, Student s2) {
//                if (s1.averageGrade < s2.averageGrade) {
//                    return 1;
//                } else if (s1.averageGrade > s2.averageGrade) {
//                    return -1;
//                }
//                return 0;
//            }
//        });
//        
//        // Output the top 10 students with the highest grades
//        System.out.println("\nTop 10 students with the highest average grades:");
//        int top = Math.min(10, n);
//        for (int i = 0; i < top; i++) {
//            System.out.println("Student ID: " + studentList[i].studentID);
//            System.out.println("Full name: " + studentList[i].fullName);
//            System.out.println("Average grade: " + String.format("%.2f", studentList[i].averageGrade));
//            System.out.println();
//        }
//    }
//}

public class BT2 {
    public static void main(String[] args) {
        // Pre-entered information for the list of students
        Student[] studentList = {
            new Student(){{studentID=1; fullName="John Smith"; calculusGrade=8.5; physicsGrade=10; programmingGrade=7.8;}},
            new Student(){{studentID=2; fullName="Anna Johnson"; calculusGrade=4.5; physicsGrade=9.6; programmingGrade=10;}},
            new Student(){{studentID=3; fullName="Orb Cube"; calculusGrade=10; physicsGrade=10; programmingGrade=10;}},
            new Student(){{studentID=4; fullName="Taylor Swift"; calculusGrade=3; physicsGrade=4; programmingGrade=5;}},
            new Student(){{studentID=5; fullName="Jack Kirby"; calculusGrade=9; physicsGrade=3; programmingGrade=7;}},
            new Student(){{studentID=6; fullName="Peter Quill"; calculusGrade=5; physicsGrade=1; programmingGrade=2;}},
            new Student(){{studentID=7; fullName="Matthew Port"; calculusGrade=8; physicsGrade=8; programmingGrade=8;}},
            new Student(){{studentID=8; fullName="Lucky John"; calculusGrade=9; physicsGrade=9; programmingGrade=9;}},
            new Student(){{studentID=9; fullName="Holo Boom"; calculusGrade=3; physicsGrade=0; programmingGrade=5;}},
            new Student(){{studentID=10; fullName="Summer jean"; calculusGrade=1; physicsGrade=9; programmingGrade=8;}},
            new Student(){{studentID=11; fullName="Lois Bart"; calculusGrade=5.4; physicsGrade=3; programmingGrade=2;}},
            new Student(){{studentID=12; fullName="Lucy Amy"; calculusGrade=8; physicsGrade=9; programmingGrade=10;}},
            new Student(){{studentID=13; fullName="None Null"; calculusGrade=10; physicsGrade=10; programmingGrade=10;}},
            new Student(){{studentID=14; fullName="HMMMMMM"; calculusGrade=10; physicsGrade=10; programmingGrade=10;}},
            new Student(){{studentID=15; fullName="Louis Vuitton"; calculusGrade=0; physicsGrade=0; programmingGrade=0;}}
        };

        int n = studentList.length;

        // Calculate average grade for each student
        for (Student student : studentList) {
            student.calculateAverageGrade();
        }
        
        // List of students who receive scholarships
        System.out.println("List of students who receive scholarships:");
        for (Student student : studentList) {
            if (student.averageGrade >= 8.0 && student.programmingGrade >= 9.0) {
                System.out.println("Student ID: " + student.studentID);
                System.out.println("Full name: " + student.fullName);
                System.out.println("Average grade: " + String.format("%.2f", student.averageGrade));
                System.out.println();
            }
        }

        // Find students with the highest average grade
        double maxAverageGrade = studentList[0].averageGrade;
        for (Student student : studentList) {
            if (student.averageGrade > maxAverageGrade) {
                maxAverageGrade = student.averageGrade;
            }
        }

        // Print information of students with the highest average grade
        System.out.println("Information of students with the highest average grade:");
        for (Student student : studentList) {
            if (student.averageGrade == maxAverageGrade) {
                System.out.println("Student ID: " + student.studentID);
                System.out.println("Full name: " + student.fullName);
                System.out.println("Average grade: " + String.format("%.2f", student.averageGrade));
                System.out.println();
            }
        }

        // Sort the list of students in descending order of average grade
        Arrays.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.averageGrade < s2.averageGrade) {
                    return 1;
                } else if (s1.averageGrade > s2.averageGrade) {
                    return -1;
                }
                return 0;
            }
        });

        // Output the top 10 students with the highest grades
        System.out.println("Top 10 students with the highest average grades:");
        int top = Math.min(10, n);
        for (int i = 0; i < top; i++) {
            System.out.println("Student ID: " + studentList[i].studentID);
            System.out.println("Full name: " + studentList[i].fullName);
            System.out.println("Average grade: " + String.format("%.2f", studentList[i].averageGrade));
            System.out.println();
        }
    }
}