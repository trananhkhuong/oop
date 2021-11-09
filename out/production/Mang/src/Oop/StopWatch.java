package Oop;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    long starTime, endTime;

    public long star(){
        starTime = new Date().getTime();
        return starTime;
    }

    public long end(){
        endTime = new Date().getTime();
        return endTime;
    }

    public long getElapsedTime(){return endTime - starTime;};
}
class Time {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        Scanner sc = new Scanner(System.in);


        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());


        while (true) {
            System.out.println("1. Start ");
            System.out.println("2. End ");
            System.out.println("3. Show ");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    stopWatch.star();
                    break;
                case 2:
                    stopWatch.end();
                    break;
                default:
                    System.out.println(stopWatch.getElapsedTime());

            }
        }
    }
}