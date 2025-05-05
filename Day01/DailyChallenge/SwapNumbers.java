package Day01.DailyChallenge;
//Write a program to swap two numbers without using a third variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);

        b = b-a;
        a = a+b;

        System.out.println("AFTER SWAP");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
