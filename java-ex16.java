/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age= myObj.nextInt();

        if (age >= 16) {
            System.out.print("You are old enough to legally drive.");
        } else {
            System.out.print("You are not old enough to legally drive.");
        }
        
        myObj.close();
    }
}