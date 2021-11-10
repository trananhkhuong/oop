package Oop;

public class Baitap1 {
    double numBer1, numBer2, numBer3;
    public Baitap1(){
    }
    public Baitap1(double numBer1, double numBer2, double numBer3){
        this.numBer1 = numBer1;
        this.numBer2 = numBer2;
        this.numBer3 = numBer3;
    }
    public double delta(){

        return (this.numBer2 * this.numBer2) - 4 * this.numBer1 * this.numBer3;
    }
    public double nghiem1(){

        return (-this.numBer2 + (Math.pow(delta(), 0.5)) / 2 * numBer1 );
    }
    public double nghiem2(){

        return (-this.numBer2 - (Math.pow(delta(), 0.5)) / 2 * numBer1);
    }
}
