package Day04.ConstructorCodes.ConstructorChaining;
// constructor chaining within the same class
public class SameClass {

    public SameClass(){
        this(5);
        System.out.println("this is the Default constructor");
    }

    public SameClass( int x){
        this("Test");
        System.out.println(x);
    }

    public SameClass(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        SameClass sameClass = new SameClass(); //calling default constructor
    }
}
