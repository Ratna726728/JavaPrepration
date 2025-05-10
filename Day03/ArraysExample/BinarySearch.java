package Day03.ArraysExample;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //step1:
        int arr[] = {10, 20, 15, 30, 50};
        Arrays.sort(arr);
        //step2:
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
        //step3:
        int searchNum = 30;
        int index= Arrays.binarySearch(arr, searchNum);
        //step4:
        if(index>=0){
            System.out.println("Element "+searchNum + " found at index "+index);
        }else{
            System.out.println("Element "+searchNum+ " not found");
        }

    }
}
