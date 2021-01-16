//package _12_JAN_2021_to_16_JAN_2021.classFile;

/*
Topic covered in this program
  --> switch case
  --> string (immutable)
  --> mutable ---> string buffer(synchronized - thread safe / slower than builder ),
                   string builder(non - synchronized - not a thread safe / faster than buffer)
  --> string function
*/
import java.util.Arrays;
import java.util.Scanner;

public class SwitchCase {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter 2 string values for stringbuffer and stringbuilder");
        //String string = new String(sc.nextLine());
        StringBuffer stringBuffer = new StringBuffer(sc.nextLine());
        StringBuilder stringBuilder = new StringBuilder(sc.nextLine());

        Arrays.asList("Enter your choice for different operation (case insensitive)",
                      "lower case",
                      "upper case",
                      "position  of",
                      "letter at ",
                      "info")
                .stream()
                .forEach( displaySentence -> System.out.println( displaySentence ) );
        SwitchCase.switchCase(sc.nextLine(),stringBuffer,stringBuilder);

    }
    public static void switchCase(String option, StringBuffer stringBuffer, StringBuilder stringBuilder){
        StringBuilder strBuilder = new StringBuilder();

        switch(option.toLowerCase()){
            case "upperr case":
                System.out.println(stringBuffer.toString().toUpperCase());
                System.out.println(stringBuilder.toString().toUpperCase());
            break;

            case "lower case":
                System.out.println(stringBuffer.toString().toLowerCase());
                System.out.println(stringBuilder.toString().toLowerCase());
            break;

            case "letter at":
                System.out.println("Enter the index of the char you want");
                int index = sc.nextInt();
                System.out.println(stringBuffer.charAt(index));
                System.out.println(stringBuilder.charAt(index));
            break;

            case "position of":
                System.out.println("Enter the place of the char you want");
                char letter = sc.next().charAt(0);
                System.out.println(stringBuffer.toString().indexOf(letter));
                System.out.println(stringBuilder.toString().indexOf(letter));
            break;

            case "info":
                System.out.printf("string buffer : { %s }\n",stringBuffer.toString());

                System.out.println("capacity = " + stringBuffer.capacity());

                // hashcode used to check whether two reference point to same location are not
                System.out.println("hashcode = " + stringBuffer.hashCode()); 
                
                System.out.println("empty or not : " + stringBuffer.isEmpty());

                System.out.println("size = " + stringBuffer.length());
            break;

            default:
                System.out.println("invalid choice");
        }
    }
}
