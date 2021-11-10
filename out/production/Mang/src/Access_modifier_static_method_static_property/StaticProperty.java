package Access_modifier_static_method_static_property;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaticProperty(String name, String engine){

        this.name = name;
        this.engine = engine;

        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }
}
class TestStaticProperty{
    public static void main(String[] args) {
        StaticProperty st = new StaticProperty("BMW", "I8");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty st1 = new StaticProperty("KIA", "Cerato");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty st3 = new StaticProperty("Mazda", "3");
        System.out.println(StaticProperty.numberOfCars);
    }
}
