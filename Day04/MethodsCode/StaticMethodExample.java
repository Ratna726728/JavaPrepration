package Day04.MethodsCode;

public class StaticMethodExample {

    public static void test(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        //way 1: by using class name
        StaticMethodExample.test();

        //way 2: by creating the object of class
        StaticMethodExample obj = new StaticMethodExample();
        obj.test();

        //way 3: by method name only
        test();
    }
}
