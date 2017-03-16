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
/*
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        List<String> read = IO.read("1.txt");
        System.out.println(read);

        //code that tries to read the file...

//        int[] arr = {1, 2, 3};
//        System.out.println(arr[4]);

        String reddit = "https://www.reddit.com/.json";
        try {
            URL url = new URL(reddit);
            URLConnection con = url.openConnection();
            InputStream in = con.getInputStream();
        } catch (MalformedURLException e) {
            System.out.println("Bad url");
        }catch (IOException e){
            System.out.println("Please connect to the internet");
        }catch (Exception e){
           writeToFile();
        }


    }


public static void writeToFile(){
    try {
        FileWriter writer = new FileWriter("1.txt");
        writer.write("Hello, Java");
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
 */

