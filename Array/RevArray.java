import java.util.*;

public class RevArray{

    public static void revArr(int a[]){

        int start = 0, end = a.length-1;

        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start ++;
            end --;
        }

    }
    public static void main(String args[]){
        int arr[] = {7,4,9,3,6};

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
            //System.out.println();
        }

        revArr(arr);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
            //System.out.println();
        }
    }
}