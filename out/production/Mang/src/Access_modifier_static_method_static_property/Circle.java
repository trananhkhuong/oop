package Access_modifier_static_method_static_property;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle(){
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Area(){
        return this.radius * this.radius * Math.PI;
    }
}

class TestCirle{
    public static void main(String[] args) {
        Circle ci = new Circle();
        double radius = ci.getRadius();
        double area = ci.Area();
        String color = ci.getColor();
        System.out.println(radius);
        System.out.println(color);
        System.out.println(area);
    }
}
