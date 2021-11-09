package Oop;

public class TH1_1 {
    double chieuDai, chieuRong;
    public TH1_1(){
    }
    public TH1_1(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return (this.chieuRong + this.chieuDai) * 2;
    }
    public double dienTich(){
        return this.chieuDai * this.chieuRong;
    }
    public String display(){
        return "Rectangle{" + "width=" + chieuDai + ", height=" + chieuRong + "}";
    }
}

