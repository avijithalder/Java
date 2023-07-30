package Student_Detail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Student {

	public static void main(String[] args) {

		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss.SS");
		sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

		System.out.println("\nNow: "+sdf.format(System.currentTimeMillis()));
	}

}
