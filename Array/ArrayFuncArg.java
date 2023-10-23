import java.util.*;

public class ArrayFuncArg{

    public static void update(int mark[]){
        for(int i = 0; i < mark.length; i++){
            mark[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {89, 30, 56};
        update(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}