package Day02;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("less than or equal to condition");
        for(int i =1; i<=5; i++){
            System.out.println("Value of i>>"+i);
        }
        System.out.println();
        System.out.println("less than condition");
        for(int i=1; i<5 ;i++){
            System.out.println("value of i>>"+i);
        }
        System.out.println();
        System.out.println("intialization out of for loop");
        int i =1;
        for(;i<5;i++){
            System.out.println("value of i>>"+i);
        }
        System.out.println();
        System.out.println("decrement operator");
        for(int a = 10; a>0 ;a--){
            System.out.println("a>>"+a);
        }
    }
}
