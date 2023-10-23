import java.util.*;

public class LargestNum{

    public static int largeClass(int a[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++){
            if(a[i] >= largest){
                largest = a[i];
            }   
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {5,98,34,62,87,91,45,50,100};
        int largest = largeClass(arr);

        System.out.println("largest: " +largest);
    }
}