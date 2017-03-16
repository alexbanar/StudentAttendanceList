package edu.alex.java;

import edu.alex.java.utils.IO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StudentAttendanceList studentAttendanceList = new StudentAttendanceList();
        studentAttendanceList.restoreFromFile();

        boolean isExit = false;
        do {
            System.out.println();
            System.out.println("Press '1' - to add student");
            System.out.println("Press '2' - to print details of all students");
            System.out.println("Press '3' - to exit");

            int option = IO.getIntegerRecursive("Enter your option: ", 1, 3);
            switch (option) {
                case 1:
                    System.out.println();
                    studentAttendanceList.addNewStudent();
                    break;
                case 2:
                    studentAttendanceList.printAllStudents();
                    break;
                case 3:
                    studentAttendanceList.saveToFile();
                    isExit = true;
                    break;
                default:
                    throw new RuntimeException("Impossible main menu option");
            }
        } while (!isExit);
    }
}

