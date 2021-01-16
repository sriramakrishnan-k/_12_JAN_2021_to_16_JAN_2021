import java.util.Scanner;

@FunctionalInterface
interface Lambda< argType, returnType>{
    abstract returnType change(argType arg);
}

class BitwiseAndShiftOperator {
    public static Scanner sc = new Scanner(System.in);
    //functionalinterface object to hold and implement change function
    public static Lambda<Integer, Boolean> bool = (arg)->{
        return arg == 1 ? true : false ;
    };
    public static void main(String args[]){
        // bitwise operator covert a decimal no in binary form and apply logical operator on each bits of the operants
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a & b);
        System.out.println(a | b);
    
        System.out.println( "Enter two value 1 and 0 combo of your choice to see xor table output");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf( "%d xor %d : %d\n", x, y,bool.change(x) ^ bool.change(y) ? 1 : 0 );
        //xor output( if both value are same output is false )
        //          ( if both value are same output is false )
        System.out.printf("1's complement %d : %d\n",x, ~x);
        System.out.println("! changes true to false and vice verse");
        System.out.println("!(true) --> " + !true);

        // bitwise operator
        System.out.println(a >>  2); // shift 2 bit right side -> in simple (a / (2 pow 2))
        System.out.println(a <<  2); // shift 2 bit left  side -> in simple (a * (2 pow 2))
        System.out.println(a >>> 2); // same as right shift but yield different value for -ve and +ve

    }
}
