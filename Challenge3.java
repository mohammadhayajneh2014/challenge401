import java.util.*;

public class Challenge3 {
    public static void main(String[] args) {
        int[] listOfArray={7,8,10,12};
        int number=10;
        BinarySearch(listOfArray, number);
        System.out.println(BinarySearch(listOfArray, number));    }
    public static int BinarySearch(int[] array,int number) {
        int lastIndex=array.length-1;
        int firstIndex=0;
        int rotatIndex;
        while(firstIndex<=lastIndex){
            rotatIndex=firstIndex+(lastIndex-firstIndex)/2;
            if(array[rotatIndex]==number){
                return rotatIndex;
            }
            else if(number<array[rotatIndex]){
                lastIndex=rotatIndex -1;
            }
            else {
                firstIndex=rotatIndex+1;
            }
        }
        return -1;
    }
}