public class Inc_Dec_Operator {
    public static void main(String args[]){
        int a = 100;
        System.out.println(++a); //pre increment (before statement completion  increment takes place)
                                 // hence value  will be 101

        System.out.println(a++);  //post increment (after stament completion  increment takes place)
                                 // hence value  will be 101   at output                    
    
        System.out.println(a);   // now a = 102;
        
        a = 20;

        System.out.println(--a); //pre decrement (before statement completion  decrement takes place)
                                // hence value  will be 19

        System.out.println(a--);  //post decrement  (after stament completion  decrement takes place)
                                 // hence value  will be 19   at output                    

        System.out.println(a);    // now a = 18
        }
}
