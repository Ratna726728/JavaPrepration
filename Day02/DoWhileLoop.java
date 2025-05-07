package Day02;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("increment");
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        System.out.println();
        System.out.println("Decrement");
        int j=10;
        do{
            System.out.println(j);
            j--;
        }while(j>0);
    }
}
