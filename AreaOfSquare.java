import java.util.*;
public class AreaOfSquare{
    public static void main(String args[]){

        // Calculate the area of a square
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int area = side * side;
        
        System.out.println(area);
    }
}