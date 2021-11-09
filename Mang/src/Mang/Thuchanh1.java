package Mang;

import java.util.Scanner;

public class Thuchanh1 {

    public static void main(String[] args) {
	// write your code here
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size khong duoc qua 20");
        } while (size > 20);
            array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println(i + 1);
            array[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[ size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
