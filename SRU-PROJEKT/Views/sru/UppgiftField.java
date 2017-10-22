package sru;

import javax.swing.JTextField;

public class UppgiftField extends JTextField{
/**
	 * 
	 */
	private static final long serialVersionUID = -8162983382276627847L;
private String id ;

public UppgiftField(String id) {
	this.id = id;
}
public String getId() {
	return id;
}
public String getUppgift() {
	String uppgift = id + " " + getText();
	return uppgift;
}
}
