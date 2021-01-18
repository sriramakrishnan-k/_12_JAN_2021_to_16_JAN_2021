import java.util.Calendar;
import java.util.Scanner;
class CalenderJava {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        Calendar calenderObject = Calendar.getInstance();
        
        System.out.println("current time =  " + calenderObject.getTime());
        System.out.println("minimum value for year / month / date");
        System.out.println(calenderObject.getMinimum(calenderObject.YEAR));
        System.out.println(calenderObject.getMinimum(calenderObject.MONTH)); // 0 for Jan
        System.out.println(calenderObject.getMinimum(calenderObject.DATE));

        System.out.println("maximum value for year / month / date");
        System.out.println(calenderObject.getMaximum(calenderObject.YEAR));
        System.out.println(calenderObject.getMaximum(calenderObject.MONTH)); //11 for Dec
        System.out.println(calenderObject.getMaximum(calenderObject.DATE));

        // to add or sub value form a specific field we can use add method 

        System.out.println("adding 5 month to the current date");
        System.out.println("Before adding : " + calenderObject.getTime()); // month - jan
        calenderObject.add(calenderObject.MONTH, 5);
        System.out.println("After adding : " + calenderObject.getTime());  // month - jun

        //we can get a specific field (ie. year or month or date etc., ) using get method

        System.out.println("Year  : " + calenderObject.get(calenderObject.YEAR));
        System.out.println("Month : " + calenderObject.get(calenderObject.MONTH));
        System.out.println("date  : " + calenderObject.get(calenderObject.DATE));
    }
}
