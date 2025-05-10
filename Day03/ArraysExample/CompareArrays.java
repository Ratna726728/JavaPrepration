package Day03.ArraysExample;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        //step1: create arrays
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int arr3[]={1,2,3,2,1};

        //step2:compare
        boolean isEqual1 = Arrays.equals(arr1,arr2);
        boolean isEqual2 = Arrays.equals(arr2,arr3);

        System.out.println("array1 equals array2? " + isEqual1);
        System.out.println("array2 equals array3? " + isEqual2);

    }
}
