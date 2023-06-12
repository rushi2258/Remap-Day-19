package com.bridgelabz.assignment;

import java.util.Scanner;

public class UserInputValidation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        if (!isValidFirstName(firstName)) {
            System.out.println("Invalid First Name!");
            return;
        }


        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        if (!isValidLastName(lastName)) {
            System.out.println("Invalid Last Name!");
            return;
        }


        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid Email!");
            return;
        }


        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        if (!isValidMobileNumber(mobileNumber)) {
            System.out.println("Invalid Mobile Number!");
            return;
        }

        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        if (!isValidPassword(password)) {
            System.out.println("Invalid Password!");
            return;
        }

        System.out.println("All inputs are valid!");
    }

    public static boolean isValidFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }

    public static boolean isValidLastName(String lastName) {
        return lastName.matches("[A-Z][a-zA-Z]{2,}");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-][a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$");
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber.matches("^[1-9]\\d{0,2}\\s\\d{10}$");
    }

    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}
