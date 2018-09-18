import java.util.*;
import java.text.*;
public class CalculateFirstDateLastDate {
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("First date of week: "+df.format(c.getTime()));
        c.add(Calendar.DATE,6);
        System.out.println("Last date of week: "+df.format(c.getTime()));
        System.out.println();
    }
}