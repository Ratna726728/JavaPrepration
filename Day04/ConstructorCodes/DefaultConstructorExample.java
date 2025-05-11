package Day04.ConstructorCodes;

public class DefaultConstructorExample {

    String name;

    public DefaultConstructorExample(){
        name = "Raj";
    }

    public static void main(String[] args) {
        DefaultConstructorExample defaultConstructorExample = new DefaultConstructorExample();
        System.out.println("Name is : "+ defaultConstructorExample.name);
    }

}
