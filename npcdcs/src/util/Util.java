package util;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Util {
	 
	 
	public static String changeDateFormat(Date date1)
	{
		String strDate =null;
	    try
	    {
	      System.out.println(date1);
	      SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd");
	      strDate = sdfSource.format(date1);
	    }
	    catch(Exception pe)
	    {
	       pe.printStackTrace();
	    }
	    return strDate;
	}
	public static String changeDateFormatStyle(Date date1)
	{
		String strDate =null;
	    try
	    {
	      System.out.println(date1);
	      SimpleDateFormat sdfSource = new SimpleDateFormat("dd-MMMM-yyyy");
	      strDate = sdfSource.format(date1);
	    }
	    catch(Exception pe)
	    {
	       pe.printStackTrace();
	    }
	    return strDate;
	}
}

 
