package com.company;

public class Main {

    public static void main(String[] args) {
	// Welcome message.
    String firstline = "Hello, again";
    System.out.println(firstline);
    System.out.println(" ");

    // Date Message.
    String day = "Saturday";
    String date = "4th.";
    String month = "September";
    String year = "2021";
    System.out.println("This is made the:");
    //European date.
        System.out.println("European format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(year);
        System.out.println(".");
    //American Date.
        System.out.println("American format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(year);
        System.out.println(".");


    }
}
