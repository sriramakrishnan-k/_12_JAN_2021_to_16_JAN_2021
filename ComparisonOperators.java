import java.util.Scanner;
public class ComparisonOperators {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the value a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf( "%d is greater than %d : %b \n", a, b, a >  b ? true : false );
        System.out.printf( "%d is lesser  than %d : %b \n", a, b, a <  b ? true : false );
        System.out.printf( "%d is not equal to %d : %b \n", a, b, a != b ? true : false );
        System.out.printf( "%d is equal to     %d : %b \n", a, b, a == b ? true : false );
        System.out.printf( "%d is greater than or equal to %d : %b \n", a, b, a >= b ? true : false );
        System.out.printf( "%d is lesser  than or equal to %d : %b \n", a, b, a <= b ? true : false );
    }
}
