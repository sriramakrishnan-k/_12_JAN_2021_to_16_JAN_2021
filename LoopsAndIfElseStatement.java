import java.util.ArrayList;
import java.util.Scanner;
public class LoopsAndIfElseStatement {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String args[]){
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Enter the no of elements you want to store");
        int size = sc.nextInt(),i = 0;

        if(size != 0){
            System.out.println("Enter the elements you want to store");
        }

        for( ; i++ < size ; arrList.add(sc.nextInt()) ){}

        i = 0;

        if(!arrList.isEmpty()){
            do{
                System.out.println(arrList.get(i));
            }while(++i < arrList.size());
        }
        else{
            System.out.println("array is empty");
        }
        
    }
    
}
