package Mang;

import java.util.Scanner;

public class Thuchanh2 {
    public static void main(String[] args) {
        String[] students = {"Sơn vẹo ", "Vinh vâu", "Đạt 007", "Tú senna", "Du thẩm", "Sơn baton", "David Thắng Xoắn", "Trần Khương Entertainment", "Thắng 94", "Tú LOL"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a students: ");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
