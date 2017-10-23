package sru;

import java.util.ArrayList;

public class INK2R {
	private ArrayList<String> blankettFields = new ArrayList<String>();
	String blankett = "#BLANKETT ";
	String indentitet = "#IDENTITET ";
	String namn = "#NAMN ";
	String systeminfo = "#SYSTEMINFO ";
	String blankettslut = "#BLANKETTSLUT\n";
	String filslut = "#FIL_SLUT";

public INK2R(String blankett, String identitet, String namn	) {
	this.blankett = this.blankett + blankett;
	this.indentitet = this.indentitet + identitet;
	this.namn = this.namn + namn;
	}

public void addUppgift(String value) {
	String temp = "#UPPGIFT" + " " + value ;
	this.blankettFields.add(temp);
}

@Override

public String toString() {
	String formattedString = blankett + "\n" + indentitet + "\n"  + namn + "\n" + systeminfo + "\n" ;
	for(int i = 0; i < blankettFields.size(); i++) {
		formattedString = formattedString + blankettFields.get(i) + "\n";
		System.out.println(blankettFields.get(i));
	}
	formattedString = formattedString + blankettslut + filslut;
	return formattedString;
}
}
