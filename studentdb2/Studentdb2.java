/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb2;

import java.io.Serializable;
import java.util.*;
import java.io.*;

/**
 *
 * @author localuser
 */
public class Studentdb2 implements Serializable {

    private ArrayList<Student> student = new ArrayList<>();

    public static void main(String[] args) {
        Studentdb2 studentdb2 = new Studentdb2();
        studentdb2.menu();
    }

    public void addStudent() {
        Scanner sc1 = new Scanner(System.in);

        //student number
        System.out.println("Student Number: ");
        String studentNum = sc1.next();

        for (Student s : student) {
            if (studentNum.equals(s.getStudentNumber())) {
                System.out.println("Student already exist!");

            } else {
                continue;
            }
        }

        // first name
        System.out.println("First Name: ");
        String fName = sc1.next();

        // middle initial
        System.out.println("Middle Initial: ");
        String mi = sc1.next();
        char mInit = mi.charAt(0);

        //last name
        System.out.println("Last Name: ");
        String lName = sc1.next();

        // course
        System.out.println("Program: ");
        String course = sc1.next();

        System.out.println("Favorite Subject: ");
        String courseCode = sc1.next();

        System.out.println("Description: ");
        String courseDescription = sc1.next();

        // year level
        System.out.println("Year Level: ");
        int yrLvl = sc1.nextInt();

        //crush
        System.out.println("crushName");
        String crushName = sc1.next();

        Course x = new Course(courseCode, courseDescription);

        Student newStudent = new Student(studentNum, fName, mInit, lName, course, yrLvl, crushName, x);

        student.add(newStudent);

        System.out.println("Processing...");

        processing();

        System.out.println("Successfully added!");

        /*
         for (Student s2 : student) {
         System.out.println(s2);
         }*/
    }

    public void saveStudent() {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fos = new FileOutputStream("C:/temp/Database.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();

            System.out.println("Saving...");
            processing();

            System.out.println("Successfully save data!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent() {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Remove Student Number: ");
        String sNumber = sc4.next();

        if (student.isEmpty()) {
            System.out.println("No Loaded Database!");
        }

        for (Student s : student) {
            if (sNumber.equals(s.getStudentNumber())) {
                System.out.println("Remove Student " + s.getFirstName() + "?" + " (y/n)");
                String remove = sc4.next();
                if (remove.equals("Y") || remove.equals("y")) {
                    student.remove(s);
                    System.out.println("Removing from database...");
                    processing();
                    System.out.println("Successfully removed!");
                } else {
                    deleteStudent();
                }
            }
        }
    }

    public void searchStudent() {

        if (student.isEmpty()) {
            System.out.println("No Loaded Database!");
        }

        System.out.println("Student Number: ");

        Scanner sc3 = new Scanner(System.in);
        String sNumber = sc3.next();

        for (Student s : student) {
            if (sNumber.equals(s.getStudentNumber())) {
                System.out.println(s.toString());
            } else {
                System.out.println("Student not found!");
            }
        }
    }

    public void loadStudent() {

        Student isko;

        String sn = "";
        String fn = "";
        char mi = ' ';
        String ln = "";
        String prgrm = "";
        int yrlvl = 0;
        String crushName = "";
        Course x = new Course(null, null);

        BufferedReader readData = null;
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;


        try {
            
      
            fis = new FileInputStream("C:/temp/Database.txt");
            ois = new ObjectInputStream(fis);
           
            student = (ArrayList<Student>) ois.readObject();

            System.out.println("Successfully Loaded Data!");

        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException ce) {
            // this might be thrown by ois.readObject()
            ce.printStackTrace();
        }finally {

            // make sure to close the files!
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void processing() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void menu() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Menu: 1. Add Student    2. Save Data    3. Remove Student   4. Search Student   5. Load Database    6. Exit");
        System.out.println("Select Menu: ");
        int selection = sc2.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Add Student selected!");
                addStudent();
                break;
            case 2:
                System.out.println("Save Option selected!");
                saveStudent();
                break;
            case 3:
                System.out.println("Remove Student selected!");
                deleteStudent();
                break;
            case 4:
                System.out.println("Search Student selected!");
                searchStudent();
                break;
            case 5:
                System.out.println("Load Data selected!");
                loadStudent();
                break;
            case 6:
                System.out.println("Exit? (y/n)");
                String yOn = sc2.next();

                if (yOn.equals("Y") || yOn.equals("y")) {
                    System.exit(0);
                } else {
                    menu();
                }
        }
        menu();
    }
}
