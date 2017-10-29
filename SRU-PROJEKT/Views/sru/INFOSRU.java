package sru;




import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.io.IOException;

import java.awt.event.ActionEvent;

import net.miginfocom.swing.MigLayout;
import javax.swing.AbstractAction;
import javax.swing.Action;

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

	private JLabel label;
	private JButton btnVisaFil;
	
	private JButton btnLaddaFil;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public INFOSRU() throws IOException {
		setLayout(null);
		
		JLabel post2 = new JLabel("PRODUKT");
		post2.setBounds(23, 10, 47, 14);
		add(post2);
		
		textF1_2 = new JTextField();
		textF1_2.setBounds(172, 7, 212, 20);
		add(textF1_2);
		textF1_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MEDIAID (ej obligatorisk)");
		lblNewLabel_3.setBounds(23, 34, 120, 14);
		add(lblNewLabel_3);
		
		textF1_4 = new JTextField();
		textF1_4.setBounds(172, 31, 212, 20);
		add(textF1_4);
		textF1_4.setColumns(10);
		
		JLabel post5 = new JLabel("SKAPAD (ej obligatorisk)");
		post5.setBounds(23, 58, 116, 14);
		add(post5);
		
		textF1_5 = new JTextField();
		textF1_5.setBounds(172, 55, 212, 20);
		add(textF1_5);
		textF1_5.setColumns(10);
		
		JLabel post6 = new JLabel("PROGRAM (ej obligatorisk)");
		post6.setBounds(23, 82, 127, 14);
		add(post6);
		
		textF1_6 = new JTextField();
		textF1_6.setBounds(172, 79, 212, 20);
		add(textF1_6);
		textF1_6.setColumns(10);
		
		JLabel post7 = new JLabel("FILNAMN (en post)");
		post7.setBounds(23, 106, 91, 14);
		add(post7);
		
		textF1_7 = new JTextField();
		textF1_7.setBounds(172, 103, 212, 20);
		add(textF1_7);
		textF1_7.setColumns(10);
		
		JLabel post10 = new JLabel("ORGNR");
		post10.setBounds(23, 130, 36, 14);
		add(post10);
		
		textF1_10 = new JTextField();
		textF1_10.setBounds(172, 127, 212, 20);
		add(textF1_10);
		textF1_10.setColumns(10);
		
		JLabel post11 = new JLabel("NAMN");
		post11.setBounds(23, 154, 29, 14);
		add(post11);
		
		textF1_11 = new JTextField();
		textF1_11.setBounds(172, 151, 212, 20);
		add(textF1_11);
		textF1_11.setColumns(10);
		
		JLabel post12 = new JLabel("ADRESS (ej obligatorisk)");
		post12.setBounds(23, 178, 116, 14);
		add(post12);
		
		textF1_12 = new JTextField();
		textF1_12.setBounds(172, 175, 212, 20);
		add(textF1_12);
		textF1_12.setColumns(10);
		
		JLabel post13 = new JLabel("POSTNR");
		post13.setBounds(23, 202, 40, 14);
		add(post13);
		
		textF1_13 = new JTextField();
		textF1_13.setBounds(172, 199, 212, 20);
		add(textF1_13);
		textF1_13.setColumns(10);
		
		JLabel post14 = new JLabel("POSTORT");
		post14.setBounds(23, 226, 47, 14);
		add(post14);
		
		textF1_14 = new JTextField();
		textF1_14.setBounds(172, 223, 212, 20);
		add(textF1_14);
		textF1_14.setColumns(10);
		
		JLabel post15 = new JLabel("AVDELNING (ej obligatorisk)");
		post15.setBounds(23, 250, 133, 14);
		add(post15);
		
		textF1_15 = new JTextField();
		textF1_15.setBounds(172, 247, 212, 20);
		add(textF1_15);
		textF1_15.setColumns(10);
		
		label = new JLabel("    ");
		label.setBounds(7, 274, 12, 14);
		add(label);
		
		JLabel post16 = new JLabel("KONTAKT (ej obligatorisk)");
		post16.setBounds(23, 274, 123, 14);
		add(post16);
		
		textF1_16 = new JTextField();
		textF1_16.setBounds(172, 271, 212, 20);
		add(textF1_16);
		textF1_16.setColumns(10);
		
		JLabel post17 = new JLabel("EMAIL (ej obligatorisk)");
		post17.setBounds(23, 298, 131, 14);
		add(post17);
		
		textF1_17 = new JTextField();
		textF1_17.setBounds(172, 295, 212, 20);
		add(textF1_17);
		textF1_17.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("TELEFON (ej obligatorisk)");
		lblNewLabel_17.setBounds(23, 322, 145, 14);
		add(lblNewLabel_17);
		
		textF1_18 = new JTextField();
		textF1_18.setBounds(172, 319, 212, 20);
		add(textF1_18);
		textF1_18.setColumns(10);
		
		JLabel post18 = new JLabel("FAX (ej obligatorisk)");
		post18.setBounds(23, 346, 120, 14);
		add(post18);
		
		textF1_19 = new JTextField();
		textF1_19.setBounds(172, 343, 212, 20);
		add(textF1_19);
		textF1_19.setColumns(10);
		
		btnSkicka = new JButton("spara");
		btnSkicka.setBounds(431, 6, 116, 42);
		
		btnSkicka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				infoSruController nyinfo = new infoSruController();
				String text = nyinfo.skapaInfoSRU(textF1_2.getText(), textF1_4.getText(), textF1_5.getText(), textF1_12.getText()
						, textF1_6.getText(), textF1_7.getText(), textF1_10.getText(), textF1_11.getText()
						, textF1_13.getText(), textF1_14.getText(), textF1_15.getText(), textF1_16.getText(),
						textF1_17.getText(), textF1_18.getText(), textF1_19.getText());
						
							try {
								MainGUI.printToFile("info.sru",text);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				
				
			}
		});
		add(btnSkicka);
		
		btnVisaFil = new JButton("visa fil");
		btnVisaFil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainGUI.ShowSRUFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnVisaFil.setBounds(431, 73, 116, 47);
		add(btnVisaFil);
		
		btnLaddaFil = new JButton("ladda fil");
		btnLaddaFil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainGUI.LoadSRUFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLaddaFil.setBounds(431, 150, 116, 42);
		add(btnLaddaFil);

	}
	
	
	
	
}
