package sru;




import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.io.IOException;

import java.awt.event.ActionEvent;

import net.miginfocom.swing.MigLayout;

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
	private JLabel label;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public INFOSRU() throws IOException {
		setLayout(new MigLayout("", "[12px][145px][212px]", "[20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][20px][23px]"));
		
		JLabel post2 = new JLabel("PRODUKT");
		add(post2, "cell 1 0,alignx left,aligny center");
		
		textF1_2 = new JTextField();
		add(textF1_2, "cell 2 0,growx,aligny top");
		textF1_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MEDIAID (ej obligatorisk)");
		add(lblNewLabel_3, "cell 1 1,alignx left,aligny center");
		
		textF1_4 = new JTextField();
		add(textF1_4, "cell 2 1,growx,aligny top");
		textF1_4.setColumns(10);
		
		JLabel post5 = new JLabel("SKAPAD (ej obligatorisk)");
		add(post5, "cell 1 2,alignx left,aligny center");
		
		textF1_5 = new JTextField();
		add(textF1_5, "cell 2 2,growx,aligny top");
		textF1_5.setColumns(10);
		
		JLabel post6 = new JLabel("PROGRAM (ej obligatorisk)");
		add(post6, "cell 1 3,alignx left,aligny center");
		
		textF1_6 = new JTextField();
		add(textF1_6, "cell 2 3,growx,aligny top");
		textF1_6.setColumns(10);
		
		JLabel post7 = new JLabel("FILNAMN (en post)");
		add(post7, "cell 1 4,alignx left,aligny center");
		
		textF1_7 = new JTextField();
		add(textF1_7, "cell 2 4,growx,aligny top");
		textF1_7.setColumns(10);
		
		JLabel post10 = new JLabel("ORGNR");
		add(post10, "cell 1 5,alignx left,aligny center");
		
		textF1_10 = new JTextField();
		add(textF1_10, "cell 2 5,growx,aligny top");
		textF1_10.setColumns(10);
		
		JLabel post11 = new JLabel("NAMN");
		add(post11, "cell 1 6,alignx left,aligny center");
		
		textF1_11 = new JTextField();
		add(textF1_11, "cell 2 6,growx,aligny top");
		textF1_11.setColumns(10);
		
		JLabel post12 = new JLabel("ADRESS (ej obligatorisk)");
		add(post12, "cell 1 7,alignx left,aligny center");
		
		textF1_12 = new JTextField();
		add(textF1_12, "cell 2 7,growx,aligny top");
		textF1_12.setColumns(10);
		
		JLabel post13 = new JLabel("POSTNR");
		add(post13, "cell 1 8,alignx left,aligny center");
		
		textF1_13 = new JTextField();
		add(textF1_13, "cell 2 8,growx,aligny top");
		textF1_13.setColumns(10);
		
		JLabel post14 = new JLabel("POSTORT");
		add(post14, "cell 1 9,alignx left,aligny center");
		
		textF1_14 = new JTextField();
		add(textF1_14, "cell 2 9,growx,aligny top");
		textF1_14.setColumns(10);
		
		JLabel post15 = new JLabel("AVDELNING (ej obligatorisk)");
		add(post15, "cell 1 10,alignx left,aligny center");
		
		textF1_15 = new JTextField();
		add(textF1_15, "cell 2 10,growx,aligny top");
		textF1_15.setColumns(10);
		
		label = new JLabel("    ");
		add(label, "cell 0 11,alignx left,aligny center");
		
		JLabel post16 = new JLabel("KONTAKT (ej obligatorisk)");
		add(post16, "cell 1 11,alignx left,aligny center");
		
		textF1_16 = new JTextField();
		add(textF1_16, "cell 2 11,growx,aligny top");
		textF1_16.setColumns(10);
		
		JLabel post17 = new JLabel("17.#EMAIL (ej obligatorisk)");
		add(post17, "cell 1 12,alignx left,aligny center");
		
		textF1_17 = new JTextField();
		add(textF1_17, "cell 2 12,growx,aligny top");
		textF1_17.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("18.#TELEFON (ej obligatorisk)");
		add(lblNewLabel_17, "cell 1 13,alignx left,aligny center");
		
		textF1_18 = new JTextField();
		add(textF1_18, "cell 2 13,growx,aligny top");
		textF1_18.setColumns(10);
		
		JLabel post18 = new JLabel("19.#FAX (ej obligatorisk)");
		add(post18, "cell 1 14,alignx left,aligny center");
		
		textF1_19 = new JTextField();
		add(textF1_19, "cell 2 14,growx,aligny top");
		textF1_19.setColumns(10);
		
		btnSkicka = new JButton("spara");
		
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
								MainGUI.printToFile("info.sru",mintext);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				
				
			}
		});
		add(btnSkicka, "cell 1 15,alignx left,aligny top");

	}
	
	
}
