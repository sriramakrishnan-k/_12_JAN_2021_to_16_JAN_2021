import java.util.Scanner;

class Assert {

    private int value;
    Assert(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }

    void setValue(int value){
        assert value >= 0 : "Negative value"; // assumption value is always positive
        this.value = value;
    }

}
public class AssertionAndException{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){

        Assert obj = new Assert(100);
        System.out.println("Enter a positive value");
        obj.setValue(sc.nextInt());
        System.out.println("obj.value = " + obj.getValue());

        int arr[] = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = i;
        }

        try{
            for( int i = 0 ; i < 6 ; i++ ){
                System.out.println(arr[i]);
            }
        }

        catch(ArrayIndexOutOfBoundsException arrIndexOutOfBoundsException){

            // to know the cause of exception
            System.out.println("cause   : " + arrIndexOutOfBoundsException.getCause());

            // to know about the exception
            System.out.println("message : " + arrIndexOutOfBoundsException.getMessage());
            
            System.out.println(arrIndexOutOfBoundsException.getStackTrace().toString());
        }

    }
}

// assert condition are used for testing
// assert comes under error
// hence it cannot be handle by exception handling 
// assert is disabled by default to enable { java -ea filename_without_extension  (or)
//                                           java -enableassert filename_without_extension }
// To disable  { java -da filename_without_extension  (or)
//               java -disableassert filename_without_extension }

//good to use in 
//  ---> first statement in a method
//  ---> to check the state of private variable
//  ---> to keep the assert statement where it never execute