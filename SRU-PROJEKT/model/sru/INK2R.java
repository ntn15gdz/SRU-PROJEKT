package sru;

import java.util.ArrayList;

public class INK2R {
	private ArrayList<String> blankettFields;
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

public void addUppgift(String fieldCode, String value) {
	this.blankettFields.add("#UPPGIFT" + " " + fieldCode + " " + value );
}

@Override

public String toString() {
	String formattedString = blankett + "\n" + indentitet + "\n"  + namn + "\n" + systeminfo + "\n" ;
	for(int i = 0; i < blankettFields.size(); i++) {
		formattedString = formattedString + blankettFields.get(i) + "\n";
	}
	formattedString = formattedString + blankettslut + filslut;
	return formattedString;
}
}
