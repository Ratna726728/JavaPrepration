package Day01;

public class VariableTest {
    //Global scope
    int test = 256;
    float var;

    public static void main(String[] args) {
        //local scope
        int a =10;
        //int b;
        System.out.println("value of local variable: "+ a);
        //System.out.println("value of local variable: "+ b); will throw compile time error

        // to use this global variables create a object of class
        VariableTest variableTest = new VariableTest();
        System.out.println(variableTest.test);
        System.out.println(variableTest.var);

    }
}
