import java.util.Scanner;

public class LogicalOperator {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Enter the value a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf( "%d is greater than %d and %d is greater than 0   : %b \n", a, b, a, (a > b) && (a > 0) ? true : false );
        System.out.printf( "%d is greater than %d or  %d is greater than 100 : %b \n", a, b, a, (a > b) || (a > 100) ? true : false );
        System.out.printf( "%d is not greater %d : %b \n", a, b, !(a > b)? true : false );
        
        
    }
}
