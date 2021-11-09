package com.codegym;

import java.util.Scanner;

public class Songuyento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int number = sc.nextInt();
        if (number < 2)
            System.out.println(number + "is not prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + "is the prime");
            else
                System.out.println(number + " is not prime");
        }
    }
}
