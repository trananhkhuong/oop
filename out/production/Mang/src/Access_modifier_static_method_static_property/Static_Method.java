package Access_modifier_static_method_static_property;

public class Static_Method {
    private int rollo;
    private String name;
    private static String college = "BBDIT";

    Static_Method(int r, String n){
        rollo = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";

    }

    void display(){
        System.out.println(rollo + " " + name + " " + college);
    }
}
class Test{
    public static void main(String[] args) {
        Static_Method.change();

        Static_Method s1 = new Static_Method(111, "Hi1");
        Static_Method s2 = new Static_Method(123, "Hi2");
        Static_Method s3 = new Static_Method(135, "Hi3");

        s1.display();
        s2.display();
        s3                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      .display();
    }
}
