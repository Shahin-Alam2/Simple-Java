import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String args[]){
        
        Date date=new Date();
        DateFormat DateFormat=new SimpleDateFormat("dd/MM/YYYY");
        String currentDate=DateFormat.format(date);
        System.out.println("Current Date: "+currentDate);
        
        LocalTime time=LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
        String Time=time.format(formatter);
        System.out.println(Time);
    }
}
