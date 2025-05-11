package Day04.ConstructorCodes.ConstructorChaining.DifferentClass;

public class Derived extends Base{
    public Derived(){
        System.out.println("No- argument constructor of derived class....");
    }

    public Derived(String name){
        super(name);//calling base class constructor
        System.out.println("Calling parameterized constructor of derived class");
    }

    public static void main(String[] args) {
        Derived derived = new Derived("Right");
    }
}
