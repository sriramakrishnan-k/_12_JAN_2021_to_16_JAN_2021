public class AssignmentOperator {
    public static void main(String[] args){
        int a = 10; // assign value on RHS to LHS
        System.out.println(a);
        a += 3;    // a = a + 3 { now a value is 13}
        System.out.println(a);
        a -= 5;   // a = a - 5 { now a value is 8}
        System.out.println(a);
        a /= 4;  // a = a / 4 { now a value is 2}
        System.out.println(a);
        a *= 10; // a = a * 10 { now a value is 20}
        System.out.println(a);
        a %= 2; // a = a % 2 {now a valur is 0}
        System.out.println(a);
    }
}
