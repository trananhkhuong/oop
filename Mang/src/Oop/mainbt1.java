package Oop;

import java.util.Scanner;

public class mainbt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        double numBer1 = sc.nextDouble();
        System.out.println("Nhap gia tri b: ");
        double numBer2 = sc.nextDouble();
        System.out.println("Nhap gia tri c: ");
        double numBer3 = sc.nextDouble();
        Baitap1 bac2 = new Baitap1(numBer1, numBer2, numBer3);
        System.out.println("Delta: " + bac2.delta());
        if (bac2.delta() >  0){
            System.out.println("Phương trình có 2 nghiệm là : " + bac2.nghiem1() + " và " + bac2.nghiem2());
        }else if (bac2.delta() == 0){
            System.out.println("Phương trình có nghiệm là :" + bac2.nghiem1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
