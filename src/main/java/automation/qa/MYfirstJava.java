package automation.qa;

import java.util.Scanner;

public class MYfirstJava {
    public static void main(String[] args) {
    //writes the text in the console
        System.out.println("Please enter your first name");
        //Scanner is class for reading values from the console

    Scanner scanner = new Scanner(System.in);
    //a string variable that will store value entered from the user
    String firstName = scanner.next();

        System.out.println("Your name is: " + firstName);
        //integer variable that will store the age entered from the user

        System.out.println("Please enter your age:");


        int userAge = scanner.nextInt();
        System.out.println("your age is: " + userAge);

        if (userAge >= 18){
           System.out.println(firstName + " can drink");
        }

        if (userAge < 18){
            System.out.println(firstName + " can`t drink");
        }

        if(userAge>=65){
            System.out.println(firstName + " is retired");
        }


    }
}
