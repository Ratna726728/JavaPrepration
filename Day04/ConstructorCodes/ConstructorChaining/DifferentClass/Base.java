package Day04.ConstructorCodes.ConstructorChaining.DifferentClass;

public class Base {
    String name;

    public Base(){
        this("");
        System.out.println("No-arguments constructor of base class ...");
    }

    public Base(String name){
        this.name = name;
        System.out.println("calling parameterized constructor of base class....");
    }
}
