package Day03.ArraysExample;
/* Java program to illustrate how to declare, instantiate, initialize and
traverse the java array
 */
public class TestArray {
    public static void main(String[] args) {

        //declaration and instantiation
        int a[] = new int[5];

        //initialization
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //traversing array
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
