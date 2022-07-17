package lesson1;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scaner.nextLine();
        System.out.println("hello" + name);
    }
}
