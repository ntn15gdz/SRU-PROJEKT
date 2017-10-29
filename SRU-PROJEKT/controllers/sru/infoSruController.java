package sru;

public class infoSruController {
	
	public infoSruController() {
		
	}
	public String skapaInfoSRU(String produkt, String mediaid, String skapad,String adress, String program, String filnamn, String orgnr,String namn,String postnr,String ort,String avdelning,String kontakt,String email,String telefon,String fax) {
		SRU_info infofil = new SRU_info(produkt, filnamn, orgnr, namn, postnr, ort);
		if(mediaid.length() > 0) {
			infofil.setMediaId(mediaid);
		}
		if(skapad.length() > 0) {
			infofil.setSkapad(skapad);
		}
		if(program.length() > 0 ) {
			infofil.setProgram(program);
		}
		if(adress.length() > 0 ) {
			infofil.setAdress(adress);
		}
		if(avdelning.length() > 0) {
			infofil.setAvdelning(avdelning);
		}
		if(kontakt.length() > 0 ) {
			infofil.setKontakt(kontakt);
		}
		if(email.length() > 0 ) {
			infofil.setEmail(email);
		}
		if(telefon.length() > 0 ) {
			infofil.setTelefon(telefon);
		}
		if(fax.length() >0 ) {
			infofil.setFax(fax);
		}
		return  infofil.getSruText();
	}
	
	
}
