package sru;



//ghjklsd
public class SRU_info {

	private String[] dataBeskrivning = new String[20];

	public SRU_info(String produkt, String filnamn, String orgnr, String namn, String postnr,
			String postort) {
		dataBeskrivning[0] = "#DATABESKRIVNING_START";
		dataBeskrivning[1] = "#PRODUKT " + produkt;
		dataBeskrivning[2] = "";
		dataBeskrivning[3] = "";
		dataBeskrivning[4] = "";
		dataBeskrivning[5] = "";
		dataBeskrivning[11] = "";
		dataBeskrivning[14] = "";
		dataBeskrivning[15] = "";
		dataBeskrivning[16] = "";
		dataBeskrivning[17] = "";
		dataBeskrivning[18] = "";
		dataBeskrivning[6] = "#FILNAMN " + filnamn;
		dataBeskrivning[7] = "#DATABESKRIVNING_SLUT";
		dataBeskrivning[8] = "#MEDIELEV_START";
		dataBeskrivning[9] = "#ORGNR " + orgnr;
		dataBeskrivning[10] = "#NAMN " + namn;
		dataBeskrivning[12] = "#POSTNR " + postnr;
		dataBeskrivning[13] = "#POSTORT " + postort;
		dataBeskrivning[19] = "#MEDIELEV_SLUT";
	}
	
	//setters
	public void setProdukt(String s) {
		dataBeskrivning[1] = "#PRODUKT " + s;
	
	}
	public void setPeriod(String s) {
		dataBeskrivning[2] = "#PERIOD " + s;
		
		
	}
	public void setFilnamm(String s) {
		dataBeskrivning[6] = "#FILNAMN " + s;
		
		
	}
	public void setOrgnr(String s) {
		dataBeskrivning[9] = "#ORGNR " + s;
		
		
	}
	public void setNamn(String s) {
		dataBeskrivning[10] = "#NAMN " + s;
		
		
	}
	public void setPostnr(String s) {
		dataBeskrivning[12] = "#POSTNR " + s;
		
		
	}
	public void setPostort(String s) {
		dataBeskrivning[13] = "#POSTORT " + s;
		
		
	}
	public void setMediaId(String s) {
		dataBeskrivning[3] = "#MEDIAID " + s;
		
		
	}

	public void setSkapad(String s) {
		dataBeskrivning[4] = "#SKAPAD " + s;
		
		
	}

	public void setProgram(String s) {
		dataBeskrivning[5] = "#PROGRAM " + s;
		
		
	}

	public void setAdress(String s) {
		dataBeskrivning[11] = "#ADRESS " + s;
		
		
	}

	public void setAvdelning(String s) {
		dataBeskrivning[14] = "#AVDELNING " + s;
		
		
	}

	public void setKontakt(String s) {
		dataBeskrivning[15] = "#KONTAKT " + s;
		
		
	}

	public void setEmail(String s) {
		dataBeskrivning[16] = "#EMAIL " + s;
		
		
	}

	public void setTelefon(String s) {
		dataBeskrivning[17] = "#TELEFON " + s;
		
		
	}

	public void setFax(String s) {
		dataBeskrivning[18] = "#FAX " + s;
		
		
	}
	//getters
	public String getSruText() {
		String sruText = "";
		for (int i = 0; i < dataBeskrivning.length; i++) {
			
			if(dataBeskrivning[i].length() > 0) {	
			 sruText =  sruText + dataBeskrivning[i] + "\n";
			}
		}
		return sruText;
	}
}
