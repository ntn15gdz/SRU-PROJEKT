package sru;




import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.io.IOException;

import java.awt.event.ActionEvent;

public class INFOSRU extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textF1_2;
	private JTextField textF1_4;
	private JTextField textF1_5;
	private JTextField textF1_6;
	private JTextField textF1_7;
	private JTextField textF1_10;
	private JTextField textF1_11;
	private JTextField textF1_12;
	private JTextField textF1_13;
	private JTextField textF1_14;
	private JTextField textF1_15;
	private JTextField textF1_16;
	private JTextField textF1_17;
	private JTextField textF1_18;
	private JTextField textF1_19;
	private JButton btnSkicka;
	private static String mintext;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public INFOSRU() throws IOException {
		setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][][][][][][][][][][][][]"));
		
		JLabel post2 = new JLabel("2. #PRODUKT");
		add(post2, "cell 0 2,alignx left");
		
		textF1_2 = new JTextField();
		add(textF1_2, "cell 2 2,growx");
		textF1_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("4. #MEDIAID (ej obligatorisk)");
		add(lblNewLabel_3, "cell 0 3,alignx left");
		
		textF1_4 = new JTextField();
		add(textF1_4, "cell 2 3,growx");
		textF1_4.setColumns(10);
		
		JLabel post5 = new JLabel("5. #SKAPAD (ej obligatorisk)");
		add(post5, "cell 0 4,alignx left");
		
		textF1_5 = new JTextField();
		add(textF1_5, "cell 2 4,growx");
		textF1_5.setColumns(10);
		
		JLabel post6 = new JLabel("6. #PROGRAM (ej obligatorisk)");
		add(post6, "cell 0 5,alignx left");
		
		textF1_6 = new JTextField();
		add(textF1_6, "cell 2 5,growx");
		textF1_6.setColumns(10);
		
		JLabel post7 = new JLabel("7. #FILNAMN (en post)");
		add(post7, "cell 0 6,alignx left");
		
		textF1_7 = new JTextField();
		add(textF1_7, "cell 2 6,growx");
		textF1_7.setColumns(10);
		
		JLabel post10 = new JLabel("10.#ORGNR");
		add(post10, "cell 0 7,alignx left");
		
		textF1_10 = new JTextField();
		add(textF1_10, "cell 2 7,growx");
		textF1_10.setColumns(10);
		
		JLabel post11 = new JLabel("11.#NAMN");
		add(post11, "cell 0 8,alignx left");
		
		textF1_11 = new JTextField();
		add(textF1_11, "cell 2 8,growx");
		textF1_11.setColumns(10);
		
		JLabel post12 = new JLabel("12.#ADRESS (ej obligatorisk)");
		add(post12, "cell 0 9,alignx left");
		
		textF1_12 = new JTextField();
		add(textF1_12, "cell 2 9,growx");
		textF1_12.setColumns(10);
		
		JLabel post13 = new JLabel("13.#POSTNR");
		add(post13, "cell 0 10,alignx left");
		
		textF1_13 = new JTextField();
		add(textF1_13, "cell 2 10,growx");
		textF1_13.setColumns(10);
		
		JLabel post14 = new JLabel("14.#POSTORT");
		add(post14, "cell 0 11,alignx left");
		
		textF1_14 = new JTextField();
		add(textF1_14, "cell 2 11,growx");
		textF1_14.setColumns(10);
		
		JLabel post15 = new JLabel("15.#AVDELNING (ej obligatorisk)");
		add(post15, "cell 0 12,alignx left");
		
		textF1_15 = new JTextField();
		add(textF1_15, "cell 2 12,growx");
		textF1_15.setColumns(10);
		
		JLabel post16 = new JLabel("16.#KONTAKT (ej obligatorisk)");
		add(post16, "cell 0 13,alignx left");
		
		textF1_16 = new JTextField();
		add(textF1_16, "cell 2 13,growx");
		textF1_16.setColumns(10);
		
		JLabel post17 = new JLabel("17.#EMAIL (ej obligatorisk)");
		add(post17, "cell 0 14,alignx left");
		
		textF1_17 = new JTextField();
		add(textF1_17, "cell 2 14,growx");
		textF1_17.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("18.#TELEFON (ej obligatorisk)");
		add(lblNewLabel_17, "cell 0 15,alignx left");
		
		textF1_18 = new JTextField();
		add(textF1_18, "cell 2 15,growx");
		textF1_18.setColumns(10);
		
		JLabel post18 = new JLabel("19.#FAX (ej obligatorisk)");
		add(post18, "cell 0 16,alignx left");
		
		textF1_19 = new JTextField();
		add(textF1_19, "cell 2 16,growx");
		textF1_19.setColumns(10);
		
		btnSkicka = new JButton("Skicka");
		
		btnSkicka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				SRU_info nyinfo = new SRU_info(textF1_2.getText(), textF1_7.getText(),textF1_10.getText(),textF1_11.getText(),textF1_13.getText(),textF1_14.getText());
				nyinfo.setMediaId(textF1_4.getText());
				nyinfo.setSkapad(textF1_5.getText());
				nyinfo.setProgram(textF1_6.getText());
				nyinfo.setAdress(textF1_12.getText());
				nyinfo.setAvdelning(textF1_15.getText());
				nyinfo.setKontakt(textF1_16.getText());
				nyinfo.setEmail(textF1_17.getText());
				nyinfo.setTelefon(textF1_18.getText());
				nyinfo.setFax(textF1_19.getText());
				mintext = nyinfo.getSruText();		
							try {
								MainGUI.printToFile();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				
				
			}
		});
		add(btnSkicka, "cell 0 17");

	}
	public String textt() {
		return mintext;
	}
	
}
