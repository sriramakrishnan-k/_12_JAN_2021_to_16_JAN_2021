import java.util.TimeZone;
public class Time_Zone {
    public static void main(String args[]){
        String[] timeZones = TimeZone.getAvailableIDs(5*60*60*1000); 
        // [no of hr] * 60 min * 60 sec * 1000 ns = total no of ns for the specified hr;


        for(String timeZone : timeZones){
            System.out.println(timeZone);
    
            TimeZone timezoneObject = TimeZone.getTimeZone(timeZone);
            System.out.println(timezoneObject); // full time zone details

        }
        System.out.println(timeZones.length);

        System.out.println(TimeZone.getDefault()); // gives local time zone ( this location ) 

        TimeZone.setDefault(TimeZone.getTimeZone(timeZones[0])); // set the default time zone to different value

        System.out.println(TimeZone.getDefault());

    }
}

// ID - name or short form of the location
// time zone  - detail info about the zone