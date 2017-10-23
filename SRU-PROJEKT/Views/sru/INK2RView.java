package sru;



import javax.swing.JPanel;



import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;




public class INK2RView extends JPanel {
	/**
	 * 
	 */
	private INK2R form;
	
	private static final long serialVersionUID = 1L;
	private UppgiftField textField2_1;
	private UppgiftField textField2_27;
	private UppgiftField textField2_2;
	private UppgiftField textField2_3;
	private UppgiftField textField2_4;
	private UppgiftField textField2_5;
	private UppgiftField textField2_6;
	private UppgiftField textField2_7;
	private UppgiftField textField2_8;
	private UppgiftField textField2_9;
	private UppgiftField textField2_10;
	private UppgiftField textField2_11;
	private UppgiftField textField2_12;
	private UppgiftField textField2_28;
	private UppgiftField textField2_29;
	private UppgiftField textField2_30;
	private UppgiftField textField2_31;
	private UppgiftField textField2_32;
	private UppgiftField textField2_33;
	private UppgiftField textField2_34;
	private UppgiftField textField2_36;
	private UppgiftField textField2_37;
	private UppgiftField textField2_38;
	private UppgiftField textField2_39;
	private UppgiftField textField2_35;
	private UppgiftField textField2_13;
	private UppgiftField textField2_50;
	private UppgiftField textField2_49;
	private UppgiftField textField2_47;
	private UppgiftField textField2_46;
	private UppgiftField textField2_45;
	private UppgiftField textField2_44;
	private UppgiftField textField2_43;
	private UppgiftField textField2_42;
	private UppgiftField textField2_41;
	private UppgiftField textField2_40;
	private UppgiftField textField2_14;
	private UppgiftField textField2_15;
	private UppgiftField textField2_16;
	private UppgiftField textField2_17;
	private UppgiftField textField2_18;
	private UppgiftField textField2_19;
	private UppgiftField textField2_20;
	private UppgiftField textField2_21;
	private UppgiftField textField2_22;
	private UppgiftField textField2_23;
	private UppgiftField textField2_24;
	private UppgiftField textField2_25;
	private UppgiftField textField2_26;
	private JLabel label2_19;
	private JLabel label2_20;
	private JLabel label2_21;
	private JLabel label2_22;
	private JLabel label2_23;
	private JLabel label2_24;
	private JLabel label2_25;
	private JLabel label2_26;
	private JLabel titel3_1_14;
	private JLabel lable3_1;
	private UppgiftField textField3_1;
	private JLabel lable3_2;
	private JLabel lable3_3;
	private JLabel lable3_4;
	private JLabel lable3_5;
	private JLabel lable3_6;
	private JLabel lable3_7;
	private JLabel lable3_8;
	private JLabel lable3_9;
	private JLabel lable3_10;
	private JLabel lable3_11;
	private JLabel lable3_12;
	private JLabel lable3_13;
	private JLabel lable3_14;
	private UppgiftField textField3_14;
	private UppgiftField textField3_13;
	private UppgiftField textField3_12;
	private UppgiftField textField3_11;
	private UppgiftField textField3_10;
	private UppgiftField textField3_9;
	private UppgiftField textField3_8;
	private UppgiftField textField3_7;
	private UppgiftField textField3_6;
	private UppgiftField textField3_5;
	private UppgiftField textField3_4;
	private UppgiftField textField3_3;
	private UppgiftField textField3_2;
	private JLabel titel3_15_28;
	private UppgiftField textField3_15;
	private JLabel lable3_15;
	private JLabel lable3_16;
	private JLabel lable3_17;
	private JLabel lable3_18;
	private JLabel lable3_19;
	private JLabel lable3_20;
	private JLabel lable3_21;
	private JLabel lable3_22;
	private JLabel lable3_23;
	private JLabel lable3_24;
	private JLabel lable3_25;
	private JLabel lable3_26;
	private JLabel lable3_27;
	private JLabel lable3_28;
	private UppgiftField textField3_16;
	private UppgiftField textField3_17;
	private UppgiftField textField3_18;
	private UppgiftField textField3_19;
	private UppgiftField textField3_20;
	private UppgiftField textField3_21;
	private UppgiftField textField3_22;
	private UppgiftField textField3_23;
	private UppgiftField textField3_24;
	private UppgiftField textField3_25;
	private UppgiftField textField3_26;
	private UppgiftField textField3_27;
	private UppgiftField textField3_28;
	private JLabel label2_1_12;
	private JLabel label;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public INK2RView() {
		setPreferredSize(new Dimension(1123, 1160));
		
		JButton btnSpara = new JButton("spara");
		btnSpara.setBounds(6, 6, 59, 23);
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form = new INK2R("ink2r", "46541331", "sdfsdfsdf");
				for (Component c : getComponents()) {
				    if (c instanceof UppgiftField) { 
				    	String temp = ((UppgiftField) c).getUppgift();
				    	form.addUppgift(temp);
				       
				       
				    }
				}
				
				try {
					MainGUI.printToFile("blankett.sru", form.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		setLayout(null);
		add(btnSpara);
		label2_1_12 = new JLabel("Tillg\u00E5ngar/Anl\u00E4ggningstillg\u00E5ngar ");
		label2_1_12.setBounds(6, 60, 204, 15);
		label2_1_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(label2_1_12);
		
		JLabel titel2_27_28 = new JLabel("Egen Kapital");
		titel2_27_28.setBounds(603, 60, 76, 15);
		titel2_27_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_27_28);
		
		JLabel label2_1 = new JLabel("<html>2.1 Immateriella anl\u00E4ggningstillg\u00E5ngar  Koncessioner,<br> patent, licenser, varum\u00E4rken, hyresr\u00E4tter, goodwill och liknande r\u00E4ttigheter</html>");
		label2_1.setBounds(6, 78, 361, 42);
		add(label2_1);
		
		textField2_1 = new UppgiftField("7201");
		textField2_1.setBounds(371, 89, 154, 20);
		add(textField2_1);
		textField2_1.setColumns(10);
		
		JLabel label2_27 = new JLabel("2.27 Bundet eget kapital");
		label2_27.setBounds(603, 92, 118, 14);
		add(label2_27);
		
		textField2_27 = new UppgiftField("7301");
		textField2_27.setBounds(947, 89, 216, 20);
		add(textField2_27);
		textField2_27.setColumns(10);
		
		JLabel label2_2 = new JLabel("2.2 F\u00F6rskott avseende immateriella anl\u00E4ggningstillg\u00E5ngar");
		label2_2.setBounds(6, 126, 272, 14);
		add(label2_2);
		
		textField2_2 = new UppgiftField("7202");
		textField2_2.setBounds(371, 123, 154, 20);
		add(textField2_2);
		textField2_2.setColumns(10);
		
		JLabel label2_28 = new JLabel("2.28 Fritt eget kapital");
		label2_28.setBounds(603, 126, 104, 14);
		add(label2_28);
		
		textField2_28 = new UppgiftField("7302");
		textField2_28.setBounds(947, 123, 216, 20);
		add(textField2_28);
		textField2_28.setColumns(10);
		
		JLabel lablel2_3 = new JLabel("Materiella anl\u00E4ggningstillg\u00E5ngar 2.3 Byggnader och mark");
		lablel2_3.setBounds(6, 149, 270, 14);
		add(lablel2_3);
		
		textField2_3 = new UppgiftField("7214");
		textField2_3.setBounds(371, 146, 154, 20);
		add(textField2_3);
		textField2_3.setColumns(10);
		
		JLabel titel2_29_34 = new JLabel("Obeskattade reserver och avs\u00E4ttningar ");
		titel2_29_34.setBounds(603, 148, 243, 15);
		titel2_29_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_29_34);
		
		JLabel label2_4 = new JLabel("<html>2.4 Maskiner, inventarier och \u00F6vriga        materiella anl\u00E4ggningstillg\u00E5ngar </html>");
		label2_4.setBounds(6, 172, 326, 14);
		add(label2_4);
		
		textField2_4 = new UppgiftField("7215");
		textField2_4.setBounds(371, 169, 154, 20);
		add(textField2_4);
		textField2_4.setColumns(10);
		
		JLabel label2_29 = new JLabel("Obeskattade reserver 2.29 Periodiseringsfonder");
		label2_29.setBounds(603, 172, 232, 14);
		add(label2_29);
		
		textField2_29 = new UppgiftField("7321");
		textField2_29.setBounds(947, 169, 216, 20);
		add(textField2_29);
		textField2_29.setColumns(10);
		
		JLabel label2_5 = new JLabel("2.5 F\u00F6rb\u00E4ttringsutgifter p\u00E5 annans fastighet");
		label2_5.setBounds(6, 195, 213, 14);
		add(label2_5);
		
		textField2_5 = new UppgiftField("7216");
		textField2_5.setBounds(371, 192, 154, 20);
		add(textField2_5);
		textField2_5.setColumns(10);
		
		JLabel label2_30 = new JLabel("2.30 Ackumulerade \u00F6veravskrivninga");
		label2_30.setBounds(603, 195, 177, 14);
		add(label2_30);
		
		textField2_30 = new UppgiftField("7322");
		textField2_30.setBounds(947, 192, 216, 20);
		add(textField2_30);
		textField2_30.setColumns(10);
		
		JLabel label2_6 = new JLabel("<html>2.6 P\u00E5g\u00E5ende nyanl\u00E4ggningar och f\u00F6rskott         avseende materiella anl\u00E4ggningstillg\u00E5nga</html>");
		label2_6.setBounds(6, 215, 361, 28);
		add(label2_6);
		
		textField2_6 = new UppgiftField("7217");
		textField2_6.setBounds(371, 219, 154, 20);
		add(textField2_6);
		textField2_6.setColumns(10);
		
		JLabel label2_31 = new JLabel("2.31 \u00D6vriga obeskattade reserver");
		label2_31.setBounds(603, 222, 164, 14);
		add(label2_31);
		
		textField2_31 = new UppgiftField("7323");
		textField2_31.setBounds(947, 219, 216, 20);
		add(textField2_31);
		textField2_31.setColumns(10);
		
		JLabel label2_7 = new JLabel("Finansiella anl\u00E4ggningstillg\u00E5ngar 2.7 Andelar i koncernf\u00F6retag");
		label2_7.setBounds(6, 253, 294, 14);
		add(label2_7);
		
		textField2_7 = new UppgiftField("7230");
		textField2_7.setBounds(371, 250, 154, 20);
		add(textField2_7);
		textField2_7.setColumns(10);
		
		JLabel label2_32 = new JLabel("<html>Avs\u00E4ttningar 2.32 Avs\u00E4ttningar f\u00F6r pensioner och liknande f\u00F6rpliktelser<br> enligt lag (1967:531) om tryggande av pensionsutf\u00E4stelse m.m.</html>");
		label2_32.setBounds(603, 246, 340, 28);
		add(label2_32);
		
		textField2_32 = new UppgiftField("7331");
		textField2_32.setBounds(947, 250, 216, 20);
		add(textField2_32);
		textField2_32.setColumns(10);
		
		JLabel label2_8 = new JLabel("2.8 Andelar i intressef\u00F6retag");
		label2_8.setBounds(6, 280, 138, 14);
		add(label2_8);
		
		textField2_8 = new UppgiftField("7231");
		textField2_8.setBounds(371, 277, 154, 20);
		add(textField2_8);
		textField2_8.setColumns(10);
		
		JLabel label2_33 = new JLabel("2.33 \u00D6vriga avs\u00E4ttningar f\u00F6r pensioner och liknande f\u00F6rpliktelser");
		label2_33.setBounds(603, 280, 309, 14);
		add(label2_33);
		
		textField2_33 = new UppgiftField("7332");
		textField2_33.setBounds(947, 277, 216, 20);
		add(textField2_33);
		textField2_33.setColumns(10);
		
		JLabel label2_9 = new JLabel("2.9 Fordringar hos koncern- och intressef\u00F6retag");
		label2_9.setBounds(6, 303, 231, 14);
		add(label2_9);
		
		textField2_9 = new UppgiftField("7232");
		textField2_9.setBounds(371, 300, 154, 20);
		add(textField2_9);
		textField2_9.setColumns(10);
		
		JLabel label2_34 = new JLabel("2.34 \u00D6vriga avs\u00E4ttningar");
		label2_34.setBounds(603, 303, 121, 14);
		add(label2_34);
		
		textField2_34 = new UppgiftField("7333");
		textField2_34.setBounds(947, 300, 216, 20);
		add(textField2_34);
		textField2_34.setColumns(10);
		
		JLabel label2_10 = new JLabel("2.10 Andra l\u00E5ngfristiga v\u00E4rde-pappersinnehav");
		label2_10.setBounds(6, 326, 222, 14);
		add(label2_10);
		
		textField2_10 = new UppgiftField("7233");
		textField2_10.setBounds(371, 323, 154, 20);
		add(textField2_10);
		textField2_10.setColumns(10);
		
		JLabel titel2_35_50 = new JLabel("Skulder");
		titel2_35_50.setBounds(603, 325, 46, 15);
		titel2_35_50.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_35_50);
		
		JLabel label2_11 = new JLabel("2.11 L\u00E5n till del\u00E4gare eller n\u00E4rst\u00E5ende");
		label2_11.setBounds(6, 349, 181, 14);
		add(label2_11);
		
		textField2_11 = new UppgiftField("7234");
		textField2_11.setBounds(371, 346, 154, 20);
		add(textField2_11);
		textField2_11.setColumns(10);
		
		JLabel label2_35 = new JLabel("L\u00E5ngfristiga skulder 2.35 Obligationsl\u00E5n");
		label2_35.setBounds(603, 349, 188, 14);
		add(label2_35);
		
		textField2_35 = new UppgiftField("7350");
		textField2_35.setBounds(947, 346, 216, 20);
		add(textField2_35);
		textField2_35.setColumns(10);
		
		JLabel label2_12 = new JLabel("2.12 Andra l\u00E5ngfristiga fordringar");
		label2_12.setBounds(6, 372, 161, 14);
		add(label2_12);
		
		textField2_12 = new UppgiftField("7235");
		textField2_12.setBounds(371, 369, 154, 20);
		add(textField2_12);
		textField2_12.setColumns(10);
		
		JLabel label2_36 = new JLabel("2.36 Checkr\u00E4kningskredit");
		label2_36.setBounds(603, 372, 121, 14);
		add(label2_36);
		
		textField2_36 = new UppgiftField("7351");
		textField2_36.setBounds(947, 369, 216, 20);
		add(textField2_36);
		textField2_36.setColumns(10);
		
		JLabel tetel2_13_26 = new JLabel("Oms\u00E4ttningstillg\u00E5ngar");
		tetel2_13_26.setBounds(6, 394, 136, 15);
		tetel2_13_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(tetel2_13_26);
		
		JLabel label2_37 = new JLabel("2.37 \u00D6vriga skulder till kreditinstitut");
		label2_37.setBounds(603, 395, 170, 14);
		add(label2_37);
		
		textField2_37 = new UppgiftField("7352");
		textField2_37.setBounds(947, 392, 216, 20);
		add(textField2_37);
		textField2_37.setColumns(10);
		
		JLabel label2_13 = new JLabel("Varulager 2.13 R\u00E5varor och f\u00F6rn\u00F6denheter");
		label2_13.setBounds(6, 418, 206, 14);
		add(label2_13);
		
		textField2_13 = new UppgiftField("7242");
		textField2_13.setBounds(371, 415, 154, 20);
		add(textField2_13);
		textField2_13.setColumns(10);
		
		JLabel label2_38 = new JLabel("2.38 Skulder till koncern- och intressef\u00F6retag");
		label2_38.setBounds(603, 418, 215, 14);
		add(label2_38);
		
		textField2_38 = new UppgiftField("7353");
		textField2_38.setBounds(947, 415, 216, 20);
		add(textField2_38);
		textField2_38.setColumns(10);
		
		JLabel label2_14 = new JLabel("2.14 Varor under tillverkning");
		label2_14.setBounds(6, 441, 136, 14);
		add(label2_14);
		
		textField2_14 = new UppgiftField("7242");
		textField2_14.setBounds(371, 438, 154, 20);
		add(textField2_14);
		textField2_14.setColumns(10);
		
		JLabel label2_39 = new JLabel("2.39 \u00D6vriga skulder");
		label2_39.setBounds(603, 441, 94, 14);
		add(label2_39);
		
		textField2_39 = new UppgiftField("7352");
		textField2_39.setBounds(947, 438, 216, 20);
		add(textField2_39);
		textField2_39.setColumns(10);
		
		JLabel label2_15 = new JLabel("2.15 F\u00E4rdiga varor och handelsvaror");
		label2_15.setBounds(6, 464, 176, 14);
		add(label2_15);
		
		textField2_15 = new UppgiftField("7243");
		textField2_15.setBounds(371, 461, 154, 20);
		add(textField2_15);
		textField2_15.setColumns(10);
		
		JLabel label2_40 = new JLabel("Kortfristiga skulder 2.40 Checkr\u00E4kningskredit");
		label2_40.setBounds(603, 464, 214, 14);
		add(label2_40);
		
		textField2_40 = new UppgiftField("7360");
		textField2_40.setBounds(947, 461, 216, 20);
		add(textField2_40);
		textField2_40.setColumns(10);
		
		JLabel label2_16 = new JLabel("2.16 \u00D6vriga lagertillg\u00E5ngar");
		label2_16.setBounds(6, 487, 128, 14);
		add(label2_16);
		
		textField2_16 = new UppgiftField("7244");
		textField2_16.setBounds(371, 484, 154, 20);
		add(textField2_16);
		textField2_16.setColumns(10);
		
		JLabel label2_41 = new JLabel("2.41 \u00D6vriga skulder till kreditinstitut");
		label2_41.setBounds(603, 487, 170, 14);
		add(label2_41);
		
		textField2_41 = new UppgiftField("7361");
		textField2_41.setBounds(947, 484, 216, 20);
		add(textField2_41);
		textField2_41.setColumns(10);
		
		JLabel label2_17 = new JLabel("2.17 P\u00E5g\u00E5ende arbeten f\u00F6r annans r\u00E4kning");
		label2_17.setBounds(6, 510, 207, 14);
		add(label2_17);
		
		textField2_17 = new UppgiftField("7245");
		textField2_17.setBounds(371, 507, 154, 20);
		add(textField2_17);
		textField2_17.setColumns(10);
		
		JLabel label2_42 = new JLabel("2.42 F\u00F6rskott fr\u00E5n kunder");
		label2_42.setBounds(603, 510, 124, 14);
		add(label2_42);
		
		textField2_42 = new UppgiftField("7362");
		textField2_42.setBounds(947, 507, 216, 20);
		add(textField2_42);
		textField2_42.setColumns(10);
		
		JLabel label2_18 = new JLabel("2.18 F\u00F6rskott till leverant\u00F6rer");
		label2_18.setBounds(6, 533, 141, 14);
		add(label2_18);
		
		textField2_18 = new UppgiftField("7246");
		textField2_18.setBounds(371, 530, 154, 20);
		add(textField2_18);
		textField2_18.setColumns(10);
		
		JLabel label2_43 = new JLabel("2.43 P\u00E5g\u00E5ende arbeten f\u00F6r annans r\u00E4kning");
		label2_43.setBounds(603, 533, 207, 14);
		add(label2_43);
		
		textField2_43 = new UppgiftField("7363");
		textField2_43.setBounds(947, 530, 216, 20);
		add(textField2_43);
		textField2_43.setColumns(10);
		
		label2_19 = new JLabel("Kortfristiga fordringar 2.19 Kundfordringar");
		label2_19.setBounds(6, 556, 204, 14);
		add(label2_19);
		
		textField2_19 = new UppgiftField("7251");
		textField2_19.setBounds(371, 553, 154, 20);
		add(textField2_19);
		textField2_19.setColumns(10);
		
		JLabel label2_44 = new JLabel("2.44 Fakturerad men ej upparbetad int\u00E4kt");
		label2_44.setBounds(603, 556, 202, 14);
		add(label2_44);
		
		textField2_44 = new UppgiftField("7364");
		textField2_44.setBounds(947, 553, 216, 20);
		add(textField2_44);
		textField2_44.setColumns(10);
		
		label2_20 = new JLabel("2.20 Fordringar hos koncern- och intressef\u00F6retag");
		label2_20.setBounds(6, 579, 237, 14);
		add(label2_20);
		
		textField2_20 = new UppgiftField("7252");
		textField2_20.setBounds(371, 576, 154, 20);
		add(textField2_20);
		textField2_20.setColumns(10);
		
		label = new JLabel("                      .");
		label.setBounds(529, 579, 70, 14);
		add(label);
		
		JLabel label2_45 = new JLabel("2.45 Leverant\u00F6rsskulder");
		label2_45.setBounds(603, 579, 117, 14);
		add(label2_45);
		
		textField2_45 = new UppgiftField("7365");
		textField2_45.setBounds(947, 576, 216, 20);
		add(textField2_45);
		textField2_45.setColumns(10);
		
		label2_21 = new JLabel("2.21 \u00D6vriga fordringar");
		label2_21.setBounds(6, 602, 108, 14);
		add(label2_21);
		
		textField2_21 = new UppgiftField("7261");
		textField2_21.setBounds(371, 599, 154, 20);
		add(textField2_21);
		textField2_21.setColumns(10);
		
		JLabel label2_46 = new JLabel("2.46 V\u00E4xelskulder");
		label2_46.setBounds(603, 602, 85, 14);
		add(label2_46);
		
		textField2_46 = new UppgiftField("7366");
		textField2_46.setBounds(947, 599, 216, 20);
		add(textField2_46);
		textField2_46.setColumns(10);
		
		label2_22 = new JLabel("2.22 Upparbetad men ej fakturerad int\u00E4kt");
		label2_22.setBounds(6, 625, 201, 14);
		add(label2_22);
		
		textField2_22 = new UppgiftField("7262");
		textField2_22.setBounds(371, 622, 154, 20);
		add(textField2_22);
		textField2_22.setColumns(10);
		
		JLabel label2_47 = new JLabel("2.47 Skulder till koncern- och intressef\u00F6reta");
		label2_47.setBounds(603, 625, 209, 14);
		add(label2_47);
		
		textField2_47 = new UppgiftField("7367");
		textField2_47.setBounds(947, 622, 216, 20);
		add(textField2_47);
		textField2_47.setColumns(10);
		
		label2_23 = new JLabel("2.23 F\u00F6rutbetalda kostnader och upplupna int\u00E4kter");
		label2_23.setBounds(6, 648, 245, 14);
		add(label2_23);
		
		textField2_23 = new UppgiftField("7263");
		textField2_23.setBounds(371, 645, 154, 20);
		add(textField2_23);
		textField2_23.setColumns(10);
		
		JLabel label2_48 = new JLabel("2.48 Skatteskulder");
		label2_48.setBounds(603, 648, 90, 14);
		add(label2_48);
		
		UppgiftField textField2_48 = new UppgiftField("7368");
		textField2_48.setBounds(947, 645, 216, 20);
		add(textField2_48);
		textField2_48.setColumns(10);
		
		label2_24 = new JLabel("Kortfristiga placeringar 2.24 Andelar i koncernf\u00F6retag");
		label2_24.setBounds(6, 671, 256, 14);
		add(label2_24);
		
		textField2_24 = new UppgiftField("7270");
		textField2_24.setBounds(371, 668, 154, 20);
		add(textField2_24);
		textField2_24.setColumns(10);
		
		JLabel label2_49 = new JLabel("2.49 \u00D6vriga skulder");
		label2_49.setBounds(603, 671, 94, 14);
		add(label2_49);
		
		textField2_49 = new UppgiftField("7369");
		textField2_49.setBounds(947, 668, 216, 20);
		add(textField2_49);
		textField2_49.setColumns(10);
		
		label2_25 = new JLabel("2.25 \u00D6vriga kortfristiga placeringar");
		label2_25.setBounds(6, 694, 168, 14);
		add(label2_25);
		
		textField2_25 = new UppgiftField("7271");
		textField2_25.setBounds(371, 691, 154, 20);
		add(textField2_25);
		textField2_25.setColumns(10);
		
		JLabel label2_50 = new JLabel("2.50 Upplupna kostnader och f\u00F6rutbetalda int\u00E4kter");
		label2_50.setBounds(603, 694, 244, 14);
		add(label2_50);
		
		textField2_50 = new UppgiftField("7370");
		textField2_50.setBounds(947, 691, 216, 20);
		add(textField2_50);
		textField2_50.setColumns(10);
		
		label2_26 = new JLabel("Kassa och bank 2.26 Kassa, bank och redovisningsmedel");
		label2_26.setBounds(6, 717, 271, 14);
		add(label2_26);
		
		textField2_26 = new UppgiftField("7281");
		textField2_26.setBounds(371, 714, 154, 20);
		add(textField2_26);
		textField2_26.setColumns(10);
		
		titel3_1_14 = new JLabel("Resultatr\u00E4kning");
		titel3_1_14.setBounds(6, 787, 98, 15);
		titel3_1_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel3_1_14);
		
		titel3_15_28 = new JLabel("Resultatr\u00E4kning(forts.)");
		titel3_15_28.setBounds(603, 787, 142, 15);
		titel3_15_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel3_15_28);
		
		lable3_1 = new JLabel("3.1 Nettooms\u00E4ttning");
		lable3_1.setBounds(6, 808, 99, 14);
		add(lable3_1);
		
		textField3_1 = new UppgiftField("7410");
		textField3_1.setBounds(371, 805, 154, 20);
		add(textField3_1);
		textField3_1.setColumns(10);
		
		lable3_15 = new JLabel("3.15 \u00D6vriga r\u00E4nteint\u00E4kter och liknande resultatposter");
		lable3_15.setBounds(603, 808, 256, 14);
		add(lable3_15);
		
		textField3_15 = new UppgiftField("7417");
		textField3_15.setBounds(947, 805, 216, 20);
		add(textField3_15);
		textField3_15.setColumns(10);
		
		lable3_2 = new JLabel("<html>3.2 F\u00F6r\u00E4ndring av lager av produkter i arbete,<br> f\u00E4rdiga varor och p\u00E5g\u00E5ende arbete f\u00F6r annans r\u00E4kning</html>");
		lable3_2.setBounds(6, 828, 262, 28);
		add(lable3_2);
		
		textField3_2 = new UppgiftField("7510");
		textField3_2.setBounds(371, 832, 154, 20);
		add(textField3_2);
		textField3_2.setColumns(10);
		
		lable3_16 = new JLabel("<html>3.16 Nedskrivningar av finansiella anl\u00E4ggnings-<br> tillg\u00E5ngar och kortfristiga placeringar</html>");
		lable3_16.setBounds(603, 828, 225, 28);
		add(lable3_16);
		
		textField3_16 = new UppgiftField("7521");
		textField3_16.setBounds(947, 832, 216, 20);
		add(textField3_16);
		textField3_16.setColumns(10);
		
		lable3_3 = new JLabel("3.3 Aktiverat arbete f\u00F6r egen r\u00E4kning");
		lable3_3.setBounds(6, 862, 180, 14);
		add(lable3_3);
		
		textField3_3 = new UppgiftField("7412");
		textField3_3.setBounds(371, 859, 154, 20);
		add(textField3_3);
		textField3_3.setColumns(10);
		
		lable3_17 = new JLabel("3.17 R\u00E4ntekostnader och liknande resultatposter");
		lable3_17.setBounds(603, 862, 235, 14);
		add(lable3_17);
		
		textField3_17 = new UppgiftField("7522");
		textField3_17.setBounds(947, 859, 216, 20);
		add(textField3_17);
		textField3_17.setColumns(10);
		
		lable3_4 = new JLabel("3.4 \u00D6vriga r\u00F6relseint\u00E4kter");
		lable3_4.setBounds(6, 885, 124, 14);
		add(lable3_4);
		
		textField3_4 = new UppgiftField("7413");
		textField3_4.setBounds(371, 882, 154, 20);
		add(textField3_4);
		textField3_4.setColumns(10);
		
		lable3_18 = new JLabel("3.18 Extraordin\u00E4ra int\u00E4kter");
		lable3_18.setBounds(603, 885, 131, 14);
		add(lable3_18);
		
		textField3_18 = new UppgiftField("7418");
		textField3_18.setBounds(947, 882, 216, 20);
		add(textField3_18);
		textField3_18.setColumns(10);
		
		lable3_5 = new JLabel("3.5 R\u00E5varor och f\u00F6rn\u00F6denheter");
		lable3_5.setBounds(6, 908, 151, 14);
		add(lable3_5);
		
		textField3_5 = new UppgiftField("7511");
		textField3_5.setBounds(371, 905, 154, 20);
		add(textField3_5);
		textField3_5.setColumns(10);
		
		lable3_19 = new JLabel("3.19 Extraordin\u00E4ra kostnader");
		lable3_19.setBounds(603, 908, 142, 14);
		add(lable3_19);
		
		textField3_19 = new UppgiftField("7523");
		textField3_19.setBounds(947, 905, 216, 20);
		add(textField3_19);
		textField3_19.setColumns(10);
		
		lable3_6 = new JLabel("3.6 Handelsvaror");
		lable3_6.setBounds(6, 931, 83, 14);
		add(lable3_6);
		
		textField3_6 = new UppgiftField("7512");
		textField3_6.setBounds(371, 928, 154, 20);
		add(textField3_6);
		textField3_6.setColumns(10);
		
		lable3_20 = new JLabel("3.20 L\u00E4mnade koncernbidrag");
		lable3_20.setBounds(603, 931, 139, 14);
		add(lable3_20);
		
		textField3_20 = new UppgiftField("7524");
		textField3_20.setBounds(947, 928, 216, 20);
		add(textField3_20);
		textField3_20.setColumns(10);
		
		lable3_7 = new JLabel("3.7 \u00D6vriga externa kostnader");
		lable3_7.setBounds(6, 954, 143, 14);
		add(lable3_7);
		
		textField3_7 = new UppgiftField("7513");
		textField3_7.setBounds(371, 951, 154, 20);
		add(textField3_7);
		textField3_7.setColumns(10);
		
		lable3_21 = new JLabel("3.21 Mottagna koncernbidrag");
		lable3_21.setBounds(603, 954, 142, 14);
		add(lable3_21);
		
		textField3_21 = new UppgiftField("7419");
		textField3_21.setBounds(947, 951, 216, 20);
		add(textField3_21);
		textField3_21.setColumns(10);
		
		lable3_8 = new JLabel("3.8 Personalkostnader");
		lable3_8.setBounds(6, 977, 108, 14);
		add(lable3_8);
		
		textField3_8 = new UppgiftField("7514");
		textField3_8.setBounds(371, 974, 154, 20);
		add(textField3_8);
		textField3_8.setColumns(10);
		
		lable3_22 = new JLabel("3.22 \u00C5terf\u00F6ring av periodiseringsfond");
		lable3_22.setBounds(603, 977, 180, 14);
		add(lable3_22);
		
		textField3_22 = new UppgiftField("7420");
		textField3_22.setBounds(947, 974, 216, 20);
		add(textField3_22);
		textField3_22.setColumns(10);
		
		lable3_9 = new JLabel("<html>3.9 Av- och nedskrivningar av materiella       och immateriella anl\u00E4ggningstillg\u00E5nga</html>");
		lable3_9.setBounds(6, 997, 361, 28);
		add(lable3_9);
		
		textField3_9 = new UppgiftField("7515");
		textField3_9.setBounds(371, 1001, 154, 20);
		add(textField3_9);
		textField3_9.setColumns(10);
		
		lable3_23 = new JLabel("3.23 Avs\u00E4ttning till periodiseringsfond");
		lable3_23.setBounds(603, 1004, 181, 14);
		add(lable3_23);
		
		textField3_23 = new UppgiftField("7525");
		textField3_23.setBounds(947, 1001, 216, 20);
		add(textField3_23);
		textField3_23.setColumns(10);
		
		lable3_10 = new JLabel("<html>3.10 Nedskrivningar av oms\u00E4ttningstill-         g\u00E5ngar ut\u00F6ver normala nedskrivningar</html>");
		lable3_10.setBounds(6, 1028, 361, 28);
		add(lable3_10);
		
		textField3_10 = new UppgiftField("7516");
		textField3_10.setBounds(371, 1032, 154, 20);
		add(textField3_10);
		textField3_10.setColumns(10);
		
		lable3_24 = new JLabel("3.24 F\u00F6r\u00E4ndring av \u00F6veravskrivninga");
		lable3_24.setBounds(603, 1035, 177, 14);
		add(lable3_24);
		
		textField3_24 = new UppgiftField("7526");
		textField3_24.setBounds(947, 1032, 216, 20);
		add(textField3_24);
		textField3_24.setColumns(10);
		
		lable3_11 = new JLabel("3.11 \u00D6vriga r\u00F6relsekostnader");
		lable3_11.setBounds(6, 1062, 141, 14);
		add(lable3_11);
		
		textField3_11 = new UppgiftField("7517");
		textField3_11.setBounds(371, 1059, 154, 20);
		add(textField3_11);
		textField3_11.setColumns(10);
		
		lable3_25 = new JLabel("3.25 \u00D6vriga bokslutsdispositioner");
		lable3_25.setBounds(603, 1062, 159, 14);
		add(lable3_25);
		
		textField3_25 = new UppgiftField("7422");
		textField3_25.setBounds(947, 1059, 216, 20);
		add(textField3_25);
		textField3_25.setColumns(10);
		
		lable3_12 = new JLabel("3.12 Resultat fr\u00E5n andelar i koncernf\u00F6retag");
		lable3_12.setBounds(6, 1085, 209, 14);
		add(lable3_12);
		
		textField3_12 = new UppgiftField("7518");
		textField3_12.setBounds(371, 1082, 154, 20);
		add(textField3_12);
		textField3_12.setColumns(10);
		
		lable3_26 = new JLabel("3.26 Skatt p\u00E5 \u00E5rets resultat");
		lable3_26.setBounds(603, 1085, 133, 14);
		add(lable3_26);
		
		textField3_26 = new UppgiftField("7528");
		textField3_26.setBounds(947, 1082, 216, 20);
		add(textField3_26);
		textField3_26.setColumns(10);
		
		lable3_13 = new JLabel("3.13 Resultat fr\u00E5n andelar i intressef\u00F6retag");
		lable3_13.setBounds(6, 1108, 209, 14);
		add(lable3_13);
		
		textField3_13 = new UppgiftField("7519");
		textField3_13.setBounds(371, 1105, 154, 20);
		add(textField3_13);
		textField3_13.setColumns(10);
		
		lable3_27 = new JLabel("3.27 \u00C5rets resultat, vinst  (flyttas till          p. 4.1) (+)");
		lable3_27.setBounds(603, 1108, 257, 14);
		add(lable3_27);
		
		textField3_27 = new UppgiftField("7450");
		textField3_27.setBounds(947, 1105, 216, 20);
		add(textField3_27);
		textField3_27.setColumns(10);
		
		lable3_14 = new JLabel("3.14 Resultat fr\u00E5n \u00F6vriga finansiella  anl\u00E4ggningstillg\u00E5ngar");
		lable3_14.setBounds(6, 1131, 278, 14);
		add(lable3_14);
		
		textField3_14 = new UppgiftField("7520");
		textField3_14.setBounds(371, 1128, 154, 20);
		add(textField3_14);
		textField3_14.setColumns(10);
		
		lable3_28 = new JLabel("3.28 \u00C5rets resultat, f\u00F6rlust (flyttas till         p. 4.2) (-)");
		lable3_28.setBounds(603, 1131, 255, 14);
		add(lable3_28);
		
		textField3_28 = new UppgiftField("7550");
		textField3_28.setBounds(947, 1128, 216, 20);
		add(textField3_28);
		textField3_28.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(6, 766, 1157, 1);
		add(textField);
		textField.setColumns(10);
		
		
		
	
	
				
	}
}
