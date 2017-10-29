package sru;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class INK2R_Controller {
	
	private INK2R ink2r;
	
	public INK2R_Controller(String blankett, String orgnmr,String datFram,String namn) {
		blankett = "INK2R-"+blankett;
		SimpleDateFormat sdfDate = new SimpleDateFormat("HHmmss");
		  Calendar cal = Calendar.getInstance();
		String identitet = orgnmr + " " + datFram + " " + sdfDate.format(cal.getTime() );
		ink2r = new INK2R(blankett,identitet,namn);
	}
	public void addfields( String[] value){
		if(!value[1].isEmpty()) {
			String formattedText = value[0] + " " + value[1];
			ink2r.addUppgift(formattedText);}
	}
	public String toString(){
	return	ink2r.toString();
		
	}
}
