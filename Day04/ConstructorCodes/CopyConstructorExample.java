package Day04.ConstructorCodes;

public class CopyConstructorExample {

    String name;
    int id;

    // Parameterized Constructor
    public CopyConstructorExample(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    CopyConstructorExample(CopyConstructorExample obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    public static void main(String[] args) {

        // This would invoke the parameterized constructor
        System.out.println("First Object");
        CopyConstructorExample copy1 = new CopyConstructorExample("Sweta", 68);
        System.out.println("Name: " + copy1.name + " and Id: " + copy1.id);

        System.out.println();

        // This would invoke the copy constructor
        CopyConstructorExample copy2 = new CopyConstructorExample(copy1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name: " + copy2.name + " and GeekId: " + copy2.id);
    }
}
