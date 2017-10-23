package sru;




import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.io.IOException;

import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

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
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("145px"),
				ColumnSpec.decode("33px"),
				ColumnSpec.decode("212px"),},
			new RowSpec[] {
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("23px"),}));
		
		JLabel post2 = new JLabel("PRODUKT");
		add(post2, "4, 2, left, center");
		
		textF1_2 = new JTextField();
		add(textF1_2, "6, 2, fill, top");
		textF1_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MEDIAID (ej obligatorisk)");
		add(lblNewLabel_3, "4, 4, left, center");
		
		textF1_4 = new JTextField();
		add(textF1_4, "6, 4, fill, top");
		textF1_4.setColumns(10);
		
		JLabel post5 = new JLabel("SKAPAD (ej obligatorisk)");
		add(post5, "4, 6, left, center");
		
		textF1_5 = new JTextField();
		add(textF1_5, "6, 6, fill, top");
		textF1_5.setColumns(10);
		
		JLabel post6 = new JLabel("PROGRAM (ej obligatorisk)");
		add(post6, "4, 8, left, center");
		
		textF1_6 = new JTextField();
		add(textF1_6, "6, 8, fill, top");
		textF1_6.setColumns(10);
		
		JLabel post7 = new JLabel("FILNAMN (en post)");
		add(post7, "4, 10, left, center");
		
		textF1_7 = new JTextField();
		add(textF1_7, "6, 10, fill, top");
		textF1_7.setColumns(10);
		
		JLabel post10 = new JLabel("ORGNR");
		add(post10, "4, 12, left, center");
		
		textF1_10 = new JTextField();
		add(textF1_10, "6, 12, fill, top");
		textF1_10.setColumns(10);
		
		JLabel post11 = new JLabel("NAMN");
		add(post11, "4, 14, left, center");
		
		textF1_11 = new JTextField();
		add(textF1_11, "6, 14, fill, top");
		textF1_11.setColumns(10);
		
		JLabel post12 = new JLabel("ADRESS (ej obligatorisk)");
		add(post12, "4, 16, left, center");
		
		textF1_12 = new JTextField();
		add(textF1_12, "6, 16, fill, top");
		textF1_12.setColumns(10);
		
		JLabel post13 = new JLabel("POSTNR");
		add(post13, "4, 18, left, center");
		
		textF1_13 = new JTextField();
		add(textF1_13, "6, 18, fill, top");
		textF1_13.setColumns(10);
		
		JLabel post14 = new JLabel("POSTORT");
		add(post14, "4, 20, left, center");
		
		textF1_14 = new JTextField();
		add(textF1_14, "6, 20, fill, top");
		textF1_14.setColumns(10);
		
		JLabel post15 = new JLabel("AVDELNING (ej obligatorisk)");
		add(post15, "4, 22, left, center");
		
		textF1_15 = new JTextField();
		add(textF1_15, "6, 22, fill, top");
		textF1_15.setColumns(10);
		
		label = new JLabel("    ");
		add(label, "2, 24");
		
		JLabel post16 = new JLabel("KONTAKT (ej obligatorisk)");
		add(post16, "4, 24, left, center");
		
		textF1_16 = new JTextField();
		add(textF1_16, "6, 24, fill, top");
		textF1_16.setColumns(10);
		
		JLabel post17 = new JLabel("17.#EMAIL (ej obligatorisk)");
		add(post17, "4, 26, left, center");
		
		textF1_17 = new JTextField();
		add(textF1_17, "6, 26, fill, top");
		textF1_17.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("18.#TELEFON (ej obligatorisk)");
		add(lblNewLabel_17, "4, 28, left, center");
		
		textF1_18 = new JTextField();
		add(textF1_18, "6, 28, fill, top");
		textF1_18.setColumns(10);
		
		JLabel post18 = new JLabel("19.#FAX (ej obligatorisk)");
		add(post18, "4, 30, left, center");
		
		textF1_19 = new JTextField();
		add(textF1_19, "6, 30, fill, top");
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
		add(btnSkicka, "4, 32, left, top");

	}
	
	
}
