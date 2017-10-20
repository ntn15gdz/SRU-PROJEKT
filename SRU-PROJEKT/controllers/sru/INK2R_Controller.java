package sru;

public class INK2R_Controller {
	
	private INK2R ink2r;
	
	public INK2R_Controller(String blankett, String identitet, String namn) {
		ink2r = new INK2R(blankett,identitet,namn);
	}
	public void addfields(String fields, String value){
		ink2r.addUppgift(fields, value);
	}
	public String getINK2R(){
	return	ink2r.toString();
		
	}
}
