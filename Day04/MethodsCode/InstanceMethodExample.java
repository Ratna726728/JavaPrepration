package Day04.MethodsCode;

public class InstanceMethodExample {

    public void test(){
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        //way 1: by creating object of class
        InstanceMethodExample obj = new InstanceMethodExample();
        obj.test();

    }
}
