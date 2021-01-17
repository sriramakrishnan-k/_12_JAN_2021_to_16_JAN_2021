import java.util.Scanner;
import java.util.Arrays;

public class stringBuilderJava {

    public static Scanner sc = new Scanner(System.in);

    public static void display(StringBuilder ...sbObjects){
        System.out.printf(" sbWithDefaultConstructor  = '%s' \n", sbObjects[0]);
        System.out.printf(" sbWithStringObject        = '%s' \n", sbObjects[1]);
        System.out.printf(" sbWithStringLiteral       = '%s' \n", sbObjects[2]);
        System.out.printf(" sbWithCapacity            = '%s' \n", sbObjects[3]);
    }

    public static void main(String args[]){
        // default construct (initialize with empty string)
        StringBuilder sbWithDefaultConstructor = new StringBuilder();

        System.out.println("Enter the string");

        // construct takes string literal or string(class) object as argument 
        StringBuilder sbWithStringObject = new StringBuilder(sc.nextLine());
        StringBuilder sbWithStringLiteral = new StringBuilder("string builder with string constant");

        // construct takes capacity as a argument
        StringBuilder sbWithCapacity = new StringBuilder(20); //hold minimum 20

        StringBuilder sbObjects[] = { 
                                      sbWithDefaultConstructor, 
                                      sbWithStringObject,
                                      sbWithStringLiteral,
                                      sbWithCapacity 
                                    };

        display( sbObjects ); // displaying the string objects

        System.out.printf(" sbWithCapacity(capacity)  = '%d' \n", sbWithCapacity.capacity());

        sbWithCapacity.ensureCapacity(200);
    
        System.out.printf(" sbWithCapacity(capacity) after ensuring capacity = '%d' \n", sbWithCapacity.capacity());

        System.out.println("enter the string you want to append");
        String appendString = sc.nextLine();

        Arrays.asList(sbObjects).stream().forEach(sb -> sb.append(appendString));
        display(sbObjects);

        System.out.println("enter the string you want to insert along with position");
        String insertString = sc.nextLine();
        int positionToInsert = sc.nextInt();

        Arrays.asList(sbObjects).stream().forEach(sb -> sb.insert( positionToInsert, insertString ));
        display(sbObjects);


        sbWithStringObject.replace(5, 12, "REPLACE");
        System.out.printf(" sbWithStringObject (after replacing from 5 to 12 positions)  = '%s' \n", sbObjects[1]);

        sbWithStringObject.delete(5, 12);
        System.out.printf(" sbWithStringObject (after delete from 5 to 12 positions)     = '%s' \n", sbObjects[1]);

        sbWithStringObject.reverse();
        System.out.printf(" sbWithStringObject (in reverse) = '%s' \n", sbObjects[1]);
        
        System.out.printf(" sbWithStringObject character ( in 5 position ) = '%s' \n",sbWithStringObject.charAt(5));
        
        System.out.printf(" sbWithStringObject substring ( from 2 to 5 ) = '%s' \n",sbWithStringObject.substring(2, 5));
        System.out.printf(" sbWithStringObject substring ( from 2 to end ) = '%s' \n",sbWithStringObject.substring(2));

        System.out.printf("sbWithStringObject is empty : %b\n",sbWithStringObject.isEmpty());

        sbWithStringObject.delete(0,sbWithStringObject.length());

        System.out.printf("sbWithStringObject is empty (after removing all characters): %b\n",sbWithStringObject.isEmpty());
    }
}
