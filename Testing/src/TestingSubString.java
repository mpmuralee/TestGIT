
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestingSubString {

	  public static void main(String args[]) 
	    { 
		  String shpCodeLinked = "";
		  List shpCodeList = new ArrayList();
		  //shpCodeList = Arrays.asList(shpCodeLinked.split("\\s*,\\s*"));
		  System.out.println(shpCodeList.size());
		  
		  String partnerIdActual = "10356";
		  String partnerId = partnerIdActual.substring(partnerIdActual.length() - 5);
		  System.out.println("partnerId : " + partnerId);
	    } 
} 
