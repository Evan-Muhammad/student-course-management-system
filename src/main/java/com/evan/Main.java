package com.evan;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int choose;

        do{
            System.out.println("===== Student Course Management =====");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students in Course");
            System.out.println("5. View Courses of Student");
            System.out.println("6. Save");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            choose=input.nextInt();

            switch(choose){
                case 1:
                    System.out.println("Manage Students");
                    break;

                case 2:
                    System.out.println("Manage Courses");
                    break;

                case 3:
                    System.out.println("Enroll Student");
                    break;

                case 4:
                    System.out.println("View Students in Course");
                    break;

                case 5:
                    System.out.println("View Courses of Student");
                    break;

                case 6:
                    System.out.println("Save");
                    break;

                case 7:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();


        }while(choose!=7);

        input.close();

    }
}
