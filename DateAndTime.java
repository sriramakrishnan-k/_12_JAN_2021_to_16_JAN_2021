import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Arrays;

public class DateAndTime {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        /*
        String str = new String(sc.nextLine());
        System.out.println(str.compareTo(str.toUpperCase()));
        System.out.println(str.charAt(0));
        */
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(" Enter the no of different type of date format you want ");
        int numberOfFormat = sc.nextInt(),i = 0;
        
        Arrays.asList("Enter the different format using the followings",
                      "dd : date",
                      "MM : month",
                      "yyyy : year",
                      "HH : hour",
                      "mm : minute",
                      "ss : seconds",
                      "ns : nano seconds",
                      "for eg :- dd : MM : yyyy / HH : mm : ss : ns")
                .stream()
                .forEach( displaySentence -> System.out.println( displaySentence ) );
        sc.nextLine();
        while(i++ < numberOfFormat){
            String dateTimeFormatInput = sc.nextLine();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatInput);
            System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        }
    }
}
