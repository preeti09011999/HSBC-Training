import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		Date old = new Date(0);
		System.out.println(old);	// java's first date 
		System.out.println(old.toString());
		long time = now.getTime();
		System.out.println(time);
		now.setTime(time);	//You can change this date by passing number of milliseconds
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();	//Example of factory pattern which we're 
//		using so far
		c.setTime(now);
		c.add(Calendar.DAY_OF_MONTH, 1);	//DAY_OF_MONTH is a constant and static field
		System.out.println(c.getTime());
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.println(format.format(now));
	}

}
