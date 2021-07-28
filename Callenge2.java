import java.util.*;

public class Callenge2 {

    public static int[] insertElementInArray(int[] arr ,int Value){
        int[] newArr = new int[arr.length + 1];
        int shiftedIndex = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if( i == (Math.ceil(((float)arr.length / 2))))
            {
                newArr[i] = Value ;
                shiftedIndex = 1 ;
            }
            newArr[i + shiftedIndex] = arr[i] ;
        }
        return  newArr ;
    }

    public static void main(String[]args){
        System.out.println("Hello in Code Challenge Number 2");
        int[] arr1 = {1,2,3,4,9,6};
        System.out.println(Arrays.toString(insertElementInArray(arr1,5)));
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(insertElementInArray(arr2,15)));
    }
}