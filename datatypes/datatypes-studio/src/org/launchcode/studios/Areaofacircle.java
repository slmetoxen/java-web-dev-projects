package org.launchcode.studios;

import java.util.Scanner;
public class Areaofacircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter a radius:");
       double radius = input.nextDouble();
       System.out.println(3.14* radius * radius);

    }
}
