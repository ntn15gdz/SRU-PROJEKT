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

import javax.swing.border.LineBorder;

import dao.FileManager;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;




public class INK2RView extends JPanel {
	/**
	 * 
	 */
	private INK2R_Controller form;
	
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
	private JLabel blankettperiod;
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
	private JPanel panel;
	private JPanel panel_5;
	private JSeparator separator_51;
	private JSeparator separator_52;
	private JSeparator separator_53;
	private JSeparator separator_54;
	private JSeparator separator_55;
	private JSeparator separator_56;
	private JSeparator separator_57;
	private JSeparator separator_58;
	private JSeparator separator_59;
	private JSeparator separator_60;
	private JSeparator separator_61;
	private JSeparator separator_62;
	private JSeparator separator_63;
	private JSeparator separator_64;
	private JLabel label_2;
	private JLabel label_3;
	private JSeparator separator_65;
	private JSeparator separator_66;
	private JSeparator separator_67;
	private JSeparator separator_68;
	private JSeparator separator_69;
	private JSeparator separator_70;
	private JSeparator separator_71;
	private JSeparator separator_72;
	private JSeparator separator_73;
	private JSeparator separator_74;
	private JSeparator separator_75;
	private JSeparator separator_76;
	private JSeparator separator_77;
	private JSeparator separator_78;
	private JTextField orgnrField;
	private JTextField datFramstField;
	private JTextField from;
	private JTextField till;
	private JTextField namnField;
	private JTextField blankett;
	public INK2RView() {
		FileManager srudao = new FileManager();
		setPreferredSize(new Dimension(939, 1941));
		
		JButton btnSpara = new JButton("spara");
		btnSpara.setBounds(51, 29, 59, 23);
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				form = new INK2R_Controller(blankett.getText(), orgnrField.getText(), datFramstField.getText(), namnField.getText());
				for (Component c : getComponents()) {
				    if (c instanceof JPanel) { 
				    	for(Component f : ((JPanel) c).getComponents()) {
				    		if(f instanceof UppgiftField) {
				    		String [] temp = ((UppgiftField) f).getUppgift();
					    	form.addfields(temp);
				    		}
				    	}
				       
				       
				    }
				}
				
				try {
					srudao.printToFile("//blanketter.sru", form.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		setLayout(null);
		add(btnSpara);
		label2_1_12 = new JLabel("Tillg\u00E5ngar/Anl\u00E4ggningstillg\u00E5ngar ");
		label2_1_12.setBounds(51, 211, 204, 15);
		label2_1_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(label2_1_12);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(51, 226, 413, 474);
		add(panel);
		panel.setLayout(null);
		
		JLabel label2_1 = new JLabel("<html> <b>Immateriella anl\u00E4ggningstillg\u00E5ngar</b> <br>2.1 Koncessioner, patent, licenser, varum\u00E4rken, hyresr\u00E4tter, goodwill och liknande r\u00E4ttigheter</html>");
		label2_1.setBounds(7, 17, 254, 42);
		panel.add(label2_1);
		blankett = new JTextField();
		blankett.setText("2017P1");
		blankett.setLocation(159, 83);
		blankett.setSize(95, 28);
		add(blankett);
		textField2_1 = new UppgiftField("7201");
		textField2_1.setBounds(261, 24, 138, 28);
		panel.add(textField2_1);
		textField2_1.setColumns(10);
		
		JLabel label2_2 = new JLabel("<html>2.2 F\u00F6rskott avseende immateriella anl\u00E4ggningstillg\u00E5ngar</html>");
		label2_2.setBounds(7, 69, 254, 28);
		panel.add(label2_2);
		
		blankettperiod = new JLabel();
		blankettperiod.setText("period");
		blankettperiod.setLocation(159, 72);
		blankettperiod.setSize(80, 14);
		add(blankettperiod);
		textField2_2 = new UppgiftField("7202");
		textField2_2.setBounds(261, 63, 138, 27);
		panel.add(textField2_2);
		textField2_2.setColumns(10);
		
		JLabel lablel2_3 = new JLabel("<html><b>Materiella anl\u00E4ggningstillg\u00E5ngar</b> <br>2.3 Byggnader och mark</html>");
		lablel2_3.setBounds(7, 107, 182, 28);
		panel.add(lablel2_3);
		
		textField2_3 = new UppgiftField("7214");
		textField2_3.setBounds(261, 101, 138, 28);
		panel.add(textField2_3);
		textField2_3.setColumns(10);
		
		JLabel label2_4 = new JLabel("<html>2.4 Maskiner, inventarier och \u00F6vriga        materiella anl\u00E4ggningstillg\u00E5ngar </html>");
		label2_4.setBounds(7, 144, 254, 28);
		panel.add(label2_4);
		
		textField2_4 = new UppgiftField("7215");
		textField2_4.setBounds(261, 140, 138, 28);
		panel.add(textField2_4);
		textField2_4.setColumns(10);
		
		JLabel label2_5 = new JLabel("2.5 F\u00F6rb\u00E4ttringsutgifter p\u00E5 annans fastighet");
		label2_5.setBounds(7, 188, 213, 14);
		panel.add(label2_5);
		
		textField2_5 = new UppgiftField("7216");
		textField2_5.setBounds(261, 174, 138, 28);
		panel.add(textField2_5);
		textField2_5.setColumns(10);
		
		JLabel label2_6 = new JLabel("<html>2.6 P\u00E5g\u00E5ende nyanl\u00E4ggningar och f\u00F6rskott         avseende materiella anl\u00E4ggningstillg\u00E5nga</html>");
		label2_6.setBounds(7, 212, 254, 28);
		panel.add(label2_6);
		
		textField2_6 = new UppgiftField("7217");
		textField2_6.setBounds(261, 213, 138, 28);
		panel.add(textField2_6);
		textField2_6.setColumns(10);
		
		JLabel label2_7 = new JLabel("<html><b>Finansiella anl\u00E4ggningstillg\u00E5ngar</b><br>2.7 Andelar i koncernf\u00F6retag</html>");
		label2_7.setBounds(7, 250, 184, 28);
		panel.add(label2_7);
		
		textField2_7 = new UppgiftField("7230");
		textField2_7.setBounds(261, 250, 138, 28);
		panel.add(textField2_7);
		textField2_7.setColumns(10);
		
		JLabel label2_8 = new JLabel("2.8 Andelar i intressef\u00F6retag");
		label2_8.setBounds(7, 300, 138, 14);
		panel.add(label2_8);
		
		textField2_8 = new UppgiftField("7231");
		textField2_8.setBounds(261, 286, 138, 28);
		panel.add(textField2_8);
		textField2_8.setColumns(10);
		
		JLabel label2_9 = new JLabel("2.9 Fordringar hos koncern- och intressef\u00F6retag");
		label2_9.setBounds(7, 339, 231, 14);
		panel.add(label2_9);
		
		textField2_9 = new UppgiftField("7232");
		textField2_9.setBounds(261, 325, 138, 28);
		panel.add(textField2_9);
		textField2_9.setColumns(10);
		
		JLabel label2_10 = new JLabel("2.10 Andra l\u00E5ngfristiga v\u00E4rde-pappersinnehav");
		label2_10.setBounds(7, 374, 222, 14);
		panel.add(label2_10);
		
		textField2_10 = new UppgiftField("7233");
		textField2_10.setBounds(261, 360, 138, 28);
		panel.add(textField2_10);
		textField2_10.setColumns(10);
		
		JLabel label2_11 = new JLabel("2.11 L\u00E5n till del\u00E4gare eller n\u00E4rst\u00E5ende");
		label2_11.setBounds(7, 413, 181, 14);
		panel.add(label2_11);
		
		textField2_11 = new UppgiftField("7234");
		textField2_11.setBounds(261, 399, 138, 28);
		panel.add(textField2_11);
		textField2_11.setColumns(10);
		
		JLabel label2_12 = new JLabel("2.12 Andra l\u00E5ngfristiga fordringar");
		label2_12.setBounds(7, 452, 161, 14);
		panel.add(label2_12);
		
		textField2_12 = new UppgiftField("7235");
		textField2_12.setBounds(261, 438, 138, 28);
		panel.add(textField2_12);
		textField2_12.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(247, 0, 1, 474);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 57, 413, 1);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(0, 95, 413, 1);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(0, 133, 413, 1);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(0, 170, 420, 1);
		panel.add(separator_4);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(0, 244, 420, 1);
		panel.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(0, 281, 420, 1);
		panel.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(0, 316, 420, 1);
		panel.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(0, 354, 413, 1);
		panel.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(0, 393, 413, 1);
		panel.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(0, 432, 413, 1);
		panel.add(separator_11);
		
		JLabel titel2_27_28 = new JLabel("Egen Kapital");
		titel2_27_28.setBounds(474, 211, 76, 15);
		titel2_27_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_27_28);
		
		JLabel titel2_29_34 = new JLabel("Obeskattade reserver och avs\u00E4ttningar ");
		titel2_29_34.setBounds(474, 323, 243, 15);
		titel2_29_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_29_34);
		
		JLabel titel2_35_50 = new JLabel("Skulder");
		titel2_35_50.setBounds(475, 644, 46, 15);
		titel2_35_50.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel2_35_50);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(474, 658, 413, 549);
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label2_35 = new JLabel("<html><b>L\u00E5ngfristiga skulder</b><br> 2.35 Obligationsl\u00E5n");
		label2_35.setBounds(10, 12, 132, 26);
		panel_5.add(label2_35);
		
		textField2_35 = new UppgiftField("7350");
		textField2_35.setBounds(265, 11, 138, 28);
		panel_5.add(textField2_35);
		textField2_35.setColumns(10);
		
		JLabel label2_36 = new JLabel("2.36 Checkr\u00E4kningskredit");
		label2_36.setBounds(10, 58, 121, 14);
		panel_5.add(label2_36);
		
		textField2_36 = new UppgiftField("7351");
		textField2_36.setBounds(265, 43, 138, 28);
		panel_5.add(textField2_36);
		textField2_36.setColumns(10);
		
		JLabel label2_37 = new JLabel("2.37 \u00D6vriga skulder till kreditinstitut");
		label2_37.setBounds(10, 92, 170, 14);
		panel_5.add(label2_37);
		
		textField2_37 = new UppgiftField("7352");
		textField2_37.setBounds(265, 77, 138, 28);
		panel_5.add(textField2_37);
		textField2_37.setColumns(10);
		
		JLabel label2_38 = new JLabel("2.38 Skulder till koncern- och intressef\u00F6retag");
		label2_38.setBounds(10, 123, 215, 14);
		panel_5.add(label2_38);
		
		textField2_38 = new UppgiftField("7353");
		textField2_38.setBounds(265, 111, 138, 28);
		panel_5.add(textField2_38);
		textField2_38.setColumns(10);
		
		JLabel label2_39 = new JLabel("2.39 \u00D6vriga skulder");
		label2_39.setBounds(10, 159, 94, 14);
		panel_5.add(label2_39);
		
		textField2_39 = new UppgiftField("7352");
		textField2_39.setBounds(265, 145, 138, 28);
		panel_5.add(textField2_39);
		textField2_39.setColumns(10);
		
		JLabel label2_40 = new JLabel("<html><b>Kortfristiga skulder</b><br> 2.40 Checkr\u00E4kningskredit");
		label2_40.setBounds(10, 180, 145, 28);
		panel_5.add(label2_40);
		
		JLabel label2_41 = new JLabel("2.41 \u00D6vriga skulder till kreditinstitut");
		label2_41.setBounds(10, 229, 170, 14);
		panel_5.add(label2_41);
		
		JLabel label2_42 = new JLabel("2.42 F\u00F6rskott fr\u00E5n kunder");
		label2_42.setBounds(10, 262, 124, 14);
		panel_5.add(label2_42);
		
		JLabel label2_43 = new JLabel("2.43 P\u00E5g\u00E5ende arbeten f\u00F6r annans r\u00E4kning");
		label2_43.setBounds(10, 295, 207, 14);
		panel_5.add(label2_43);
		
		JLabel label2_44 = new JLabel("2.44 Fakturerad men ej upparbetad int\u00E4kt");
		label2_44.setBounds(10, 329, 202, 14);
		panel_5.add(label2_44);
		
		JLabel label2_45 = new JLabel("2.45 Leverant\u00F6rsskulder");
		label2_45.setBounds(10, 362, 117, 14);
		panel_5.add(label2_45);
		
		JLabel label2_46 = new JLabel("2.46 V\u00E4xelskulder");
		label2_46.setBounds(10, 394, 85, 14);
		panel_5.add(label2_46);
		
		JLabel label2_47 = new JLabel("2.47 Skulder till koncern- och intressef\u00F6reta");
		label2_47.setBounds(10, 428, 209, 14);
		panel_5.add(label2_47);
		
		JLabel label2_48 = new JLabel("2.48 Skatteskulder");
		label2_48.setBounds(10, 464, 90, 14);
		panel_5.add(label2_48);
		
		JLabel label2_49 = new JLabel("2.49 \u00D6vriga skulder");
		label2_49.setBounds(10, 498, 94, 14);
		panel_5.add(label2_49);
		
		JLabel label2_50 = new JLabel("2.50 Upplupna kostnader och f\u00F6rutbetalda int\u00E4kter");
		label2_50.setBounds(10, 530, 244, 14);
		panel_5.add(label2_50);
		
		textField2_50 = new UppgiftField("7370");
		textField2_50.setBounds(265, 516, 138, 28);
		panel_5.add(textField2_50);
		textField2_50.setColumns(10);
		
		JSeparator separator_34 = new JSeparator();
		separator_34.setOrientation(SwingConstants.VERTICAL);
		separator_34.setForeground(Color.BLACK);
		separator_34.setBounds(260, 0, 1, 619);
		panel_5.add(separator_34);
		
		JSeparator separator_35 = new JSeparator();
		separator_35.setForeground(Color.BLACK);
		separator_35.setBounds(0, 40, 413, 1);
		panel_5.add(separator_35);
		
		JSeparator separator_36 = new JSeparator();
		separator_36.setForeground(Color.BLACK);
		separator_36.setBounds(0, 73, 413, 1);
		panel_5.add(separator_36);
		
		JSeparator separator_37 = new JSeparator();
		separator_37.setForeground(Color.BLACK);
		separator_37.setBounds(0, 107, 413, 1);
		panel_5.add(separator_37);
		
		JSeparator separator_38 = new JSeparator();
		separator_38.setForeground(Color.BLACK);
		separator_38.setBounds(-3, 141, 413, 1);
		panel_5.add(separator_38);
		
		JSeparator separator_39 = new JSeparator();
		separator_39.setForeground(Color.BLACK);
		separator_39.setBounds(0, 176, 413, 1);
		panel_5.add(separator_39);
		
		textField2_40 = new UppgiftField("7360");
		textField2_40.setBounds(265, 180, 138, 28);
		panel_5.add(textField2_40);
		textField2_40.setColumns(10);
		
		JSeparator separator_40 = new JSeparator();
		separator_40.setForeground(Color.BLACK);
		separator_40.setBounds(0, 210, 413, 1);
		panel_5.add(separator_40);
		
		textField2_41 = new UppgiftField("7361");
		textField2_41.setBounds(265, 215, 138, 28);
		panel_5.add(textField2_41);
		textField2_41.setColumns(10);
		
		JSeparator separator_41 = new JSeparator();
		separator_41.setForeground(Color.BLACK);
		separator_41.setBounds(0, 246, 413, 1);
		panel_5.add(separator_41);
		
		textField2_42 = new UppgiftField("7362");
		textField2_42.setBounds(265, 249, 138, 28);
		panel_5.add(textField2_42);
		textField2_42.setColumns(10);
		
		JSeparator separator_42 = new JSeparator();
		separator_42.setForeground(Color.BLACK);
		separator_42.setBounds(1, 280, 413, 1);
		panel_5.add(separator_42);
		
		textField2_43 = new UppgiftField("7363");
		textField2_43.setBounds(265, 283, 138, 28);
		panel_5.add(textField2_43);
		textField2_43.setColumns(10);
		
		JSeparator separator_43 = new JSeparator();
		separator_43.setForeground(Color.BLACK);
		separator_43.setBounds(0, 314, 413, 1);
		panel_5.add(separator_43);
		
		textField2_44 = new UppgiftField("7364");
		textField2_44.setBounds(265, 317, 138, 28);
		panel_5.add(textField2_44);
		textField2_44.setColumns(10);
		
		JSeparator separator_44 = new JSeparator();
		separator_44.setForeground(Color.BLACK);
		separator_44.setBounds(-1, 347, 413, 1);
		panel_5.add(separator_44);
		
		JSeparator separator_45 = new JSeparator();
		separator_45.setForeground(Color.BLACK);
		separator_45.setBounds(-1, 378, 413, 1);
		panel_5.add(separator_45);
		
		JSeparator separator_46 = new JSeparator();
		separator_46.setForeground(Color.BLACK);
		separator_46.setBounds(-1, 410, 413, 1);
		panel_5.add(separator_46);
		
		textField2_45 = new UppgiftField("7365");
		textField2_45.setBounds(265, 349, 138, 28);
		panel_5.add(textField2_45);
		textField2_45.setColumns(10);
		
		textField2_46 = new UppgiftField("7366");
		textField2_46.setBounds(265, 380, 138, 28);
		panel_5.add(textField2_46);
		textField2_46.setColumns(10);
		
		textField2_47 = new UppgiftField("7367");
		textField2_47.setBounds(265, 414, 138, 28);
		panel_5.add(textField2_47);
		textField2_47.setColumns(10);
		
		JSeparator separator_47 = new JSeparator();
		separator_47.setForeground(Color.BLACK);
		separator_47.setBounds(0, 444, 413, 1);
		panel_5.add(separator_47);
		
		UppgiftField textField2_48 = new UppgiftField("7368");
		textField2_48.setBounds(265, 449, 138, 28);
		panel_5.add(textField2_48);
		textField2_48.setColumns(10);
		
		JSeparator separator_48 = new JSeparator();
		separator_48.setForeground(Color.BLACK);
		separator_48.setBounds(0, 480, 413, 1);
		panel_5.add(separator_48);
		
		textField2_49 = new UppgiftField("7369");
		textField2_49.setBounds(265, 483, 138, 28);
		panel_5.add(textField2_49);
		textField2_49.setColumns(10);
		
		JSeparator separator_49 = new JSeparator();
		separator_49.setForeground(Color.BLACK);
		separator_49.setBounds(-1, 513, 413, 1);
		panel_5.add(separator_49);
		
		JLabel tetel2_13_26 = new JLabel("Oms\u00E4ttningstillg\u00E5ngar");
		tetel2_13_26.setBounds(51, 716, 136, 15);
		tetel2_13_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(tetel2_13_26);
		
		label = new JLabel("                      .");
		label.setBounds(529, 763, 70, 14);
		add(label);
		
		titel3_1_14 = new JLabel("Resultatr\u00E4kning");
		titel3_1_14.setBounds(51, 1373, 98, 15);
		titel3_1_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(titel3_1_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(474, 1389, 413, 514);
		add(panel_4);
		panel_4.setLayout(null);
		
		lable3_15 = new JLabel("<html>3.15 \u00D6vriga r\u00E4nteint\u00E4kter och liknande resultatposter</html>");
		lable3_15.setBounds(10, 1, 243, 39);
		panel_4.add(lable3_15);
		
		textField3_15 = new UppgiftField("7417");
		textField3_15.setBounds(265, 7, 138, 28);
		panel_4.add(textField3_15);
		textField3_15.setColumns(10);
		
		lable3_16 = new JLabel("<html>3.16 Nedskrivningar av finansiella anl\u00E4ggnings-tillg\u00E5ngar och kortfristiga placeringar</html>");
		lable3_16.setBounds(10, 44, 233, 42);
		panel_4.add(lable3_16);
		
		textField3_16 = new UppgiftField("7521");
		textField3_16.setBounds(265, 48, 138, 28);
		panel_4.add(textField3_16);
		textField3_16.setColumns(10);
		
		textField3_17 = new UppgiftField("7522");
		textField3_17.setBounds(265, 89, 138, 28);
		panel_4.add(textField3_17);
		textField3_17.setColumns(10);
		
		lable3_17 = new JLabel("3.17 R\u00E4ntekostnader och liknande resultatposter");
		lable3_17.setBounds(10, 90, 242, 28);
		panel_4.add(lable3_17);
		
		label_2 = new JLabel("");
		label_2.setBounds(265, 118, 138, 28);
		panel_4.add(label_2);
		
		lable3_18 = new JLabel("3.18 Extraordin\u00E4ra int\u00E4kter");
		lable3_18.setBounds(10, 130, 138, 28);
		panel_4.add(lable3_18);
		
		textField3_18 = new UppgiftField("7418");
		textField3_18.setBounds(265, 125, 138, 28);
		panel_4.add(textField3_18);
		textField3_18.setColumns(10);
		
		lable3_19 = new JLabel("3.19 Extraordin\u00E4ra kostnader");
		lable3_19.setBounds(10, 161, 212, 28);
		panel_4.add(lable3_19);
		
		textField3_19 = new UppgiftField("7523");
		textField3_19.setBounds(265, 162, 138, 28);
		panel_4.add(textField3_19);
		textField3_19.setColumns(10);
		
		lable3_20 = new JLabel("3.20 L\u00E4mnade koncernbidrag");
		lable3_20.setBounds(10, 204, 212, 22);
		panel_4.add(lable3_20);
		
		textField3_20 = new UppgiftField("7524");
		textField3_20.setBounds(265, 198, 138, 28);
		panel_4.add(textField3_20);
		textField3_20.setColumns(10);
		
		lable3_21 = new JLabel("3.21 Mottagna koncernbidrag");
		lable3_21.setBounds(10, 231, 201, 28);
		panel_4.add(lable3_21);
		
		textField3_21 = new UppgiftField("7419");
		textField3_21.setBounds(265, 232, 138, 28);
		panel_4.add(textField3_21);
		textField3_21.setColumns(10);
		
		lable3_22 = new JLabel("3.22 \u00C5terf\u00F6ring av periodiseringsfond");
		lable3_22.setBounds(10, 272, 234, 28);
		panel_4.add(lable3_22);
		
		textField3_22 = new UppgiftField("7420");
		textField3_22.setBounds(265, 268, 138, 28);
		panel_4.add(textField3_22);
		textField3_22.setColumns(10);
		
		lable3_23 = new JLabel("3.23 Avs\u00E4ttning till periodiseringsfond");
		lable3_23.setBounds(10, 309, 225, 28);
		panel_4.add(lable3_23);
		
		textField3_23 = new UppgiftField("7525");
		textField3_23.setBounds(265, 304, 138, 28);
		panel_4.add(textField3_23);
		textField3_23.setColumns(10);
		
		lable3_24 = new JLabel("3.24 F\u00F6r\u00E4ndring av \u00F6veravskrivninga");
		lable3_24.setBounds(10, 343, 242, 28);
		panel_4.add(lable3_24);
		
		textField3_24 = new UppgiftField("7526");
		textField3_24.setBounds(265, 337, 138, 28);
		panel_4.add(textField3_24);
		textField3_24.setColumns(10);
		
		label_3 = new JLabel("");
		label_3.setBounds(1, 414, 138, 28);
		panel_4.add(label_3);
		
		textField3_25 = new UppgiftField("7422");
		textField3_25.setBounds(265, 372, 138, 28);
		panel_4.add(textField3_25);
		textField3_25.setColumns(10);
		
		lable3_25 = new JLabel("3.25 \u00D6vriga bokslutsdispositioner");
		lable3_25.setBounds(10, 373, 211, 28);
		panel_4.add(lable3_25);
		
		lable3_26 = new JLabel("3.26 Skatt p\u00E5 \u00E5rets resultat");
		lable3_26.setBounds(10, 411, 138, 28);
		panel_4.add(lable3_26);
		
		textField3_26 = new UppgiftField("7528");
		textField3_26.setBounds(265, 408, 138, 28);
		panel_4.add(textField3_26);
		textField3_26.setColumns(10);
		
		lable3_27 = new JLabel("3.27 \u00C5rets resultat, vinst  (flyttas till p. 4.1) (+)");
		lable3_27.setBounds(10, 444, 232, 28);
		panel_4.add(lable3_27);
		
		textField3_27 = new UppgiftField("7450");
		textField3_27.setBounds(265, 445, 138, 28);
		panel_4.add(textField3_27);
		textField3_27.setColumns(10);
		
		lable3_28 = new JLabel("3.28 \u00C5rets resultat, f\u00F6rlust (flyttas till p. 4.2) (-)");
		lable3_28.setBounds(10, 486, 240, 28);
		panel_4.add(lable3_28);
		
		textField3_28 = new UppgiftField("7550");
		textField3_28.setBounds(265, 483, 138, 28);
		panel_4.add(textField3_28);
		textField3_28.setColumns(10);
		
		separator_65 = new JSeparator();
		separator_65.setOrientation(SwingConstants.VERTICAL);
		separator_65.setForeground(Color.BLACK);
		separator_65.setBounds(254, 0, 1, 619);
		panel_4.add(separator_65);
		
		separator_66 = new JSeparator();
		separator_66.setForeground(Color.BLACK);
		separator_66.setBounds(-1, 38, 413, 1);
		panel_4.add(separator_66);
		
		separator_67 = new JSeparator();
		separator_67.setForeground(Color.BLACK);
		separator_67.setBounds(1, 85, 413, 1);
		panel_4.add(separator_67);
		
		separator_68 = new JSeparator();
		separator_68.setForeground(Color.BLACK);
		separator_68.setBounds(-1, 120, 413, 1);
		panel_4.add(separator_68);
		
		separator_69 = new JSeparator();
		separator_69.setForeground(Color.BLACK);
		separator_69.setBounds(1, 157, 413, 1);
		panel_4.add(separator_69);
		
		separator_70 = new JSeparator();
		separator_70.setForeground(Color.BLACK);
		separator_70.setBounds(0, 194, 413, 1);
		panel_4.add(separator_70);
		
		separator_71 = new JSeparator();
		separator_71.setForeground(Color.BLACK);
		separator_71.setBounds(1, 229, 413, 1);
		panel_4.add(separator_71);
		
		separator_72 = new JSeparator();
		separator_72.setForeground(Color.BLACK);
		separator_72.setBounds(1, 263, 413, 1);
		panel_4.add(separator_72);
		
		separator_73 = new JSeparator();
		separator_73.setForeground(Color.BLACK);
		separator_73.setBounds(1, 300, 413, 1);
		panel_4.add(separator_73);
		
		separator_74 = new JSeparator();
		separator_74.setForeground(Color.BLACK);
		separator_74.setBounds(0, 335, 413, 1);
		panel_4.add(separator_74);
		
		separator_75 = new JSeparator();
		separator_75.setForeground(Color.BLACK);
		separator_75.setBounds(-1, 369, 413, 1);
		panel_4.add(separator_75);
		
		separator_76 = new JSeparator();
		separator_76.setForeground(Color.BLACK);
		separator_76.setBounds(0, 403, 413, 1);
		panel_4.add(separator_76);
		
		separator_77 = new JSeparator();
		separator_77.setForeground(Color.BLACK);
		separator_77.setBounds(-1, 442, 413, 1);
		panel_4.add(separator_77);
		
		separator_78 = new JSeparator();
		separator_78.setForeground(Color.BLACK);
		separator_78.setBounds(1, 478, 413, 1);
		panel_4.add(separator_78);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(51, 1388, 413, 522);
		add(panel_6);
		panel_6.setLayout(null);
		
		lable3_1 = new JLabel("3.1 Nettooms\u00E4ttning");
		lable3_1.setBounds(10, 19, 99, 14);
		panel_6.add(lable3_1);
		
		textField3_1 = new UppgiftField("7410");
		textField3_1.setBounds(265, 3, 138, 28);
		panel_6.add(textField3_1);
		textField3_1.setColumns(10);
		
		lable3_2 = new JLabel("<html>3.2 F\u00F6r\u00E4ndring av lager av produkter i arbete,<br> f\u00E4rdiga varor och p\u00E5g\u00E5ende arbete f\u00F6r annans r\u00E4kning</html>");
		lable3_2.setBounds(7, 38, 222, 40);
		panel_6.add(lable3_2);
		
		textField3_2 = new UppgiftField("7510");
		textField3_2.setBounds(265, 42, 138, 28);
		panel_6.add(textField3_2);
		textField3_2.setColumns(10);
		
		lable3_3 = new JLabel("3.3 Aktiverat arbete f\u00F6r egen r\u00E4kning");
		lable3_3.setBounds(10, 95, 180, 14);
		panel_6.add(lable3_3);
		
		textField3_3 = new UppgiftField("7412");
		textField3_3.setBounds(265, 81, 138, 28);
		panel_6.add(textField3_3);
		textField3_3.setColumns(10);
		
		lable3_4 = new JLabel("3.4 \u00D6vriga r\u00F6relseint\u00E4kter");
		lable3_4.setBounds(10, 133, 124, 14);
		panel_6.add(lable3_4);
		
		textField3_4 = new UppgiftField("7413");
		textField3_4.setBounds(265, 119, 138, 28);
		panel_6.add(textField3_4);
		textField3_4.setColumns(10);
		
		lable3_5 = new JLabel("3.5 R\u00E5varor och f\u00F6rn\u00F6denheter");
		lable3_5.setBounds(10, 167, 151, 14);
		panel_6.add(lable3_5);
		
		textField3_5 = new UppgiftField("7511");
		textField3_5.setBounds(265, 153, 138, 28);
		panel_6.add(textField3_5);
		textField3_5.setColumns(10);
		
		lable3_6 = new JLabel("3.6 Handelsvaror");
		lable3_6.setBounds(10, 265, 83, 14);
		panel_6.add(lable3_6);
		
		textField3_6 = new UppgiftField("7512");
		textField3_6.setBounds(265, 192, 138, 28);
		panel_6.add(textField3_6);
		textField3_6.setColumns(10);
		
		lable3_7 = new JLabel("3.7 \u00D6vriga externa kostnader");
		lable3_7.setBounds(9, 250, 143, 14);
		panel_6.add(lable3_7);
		
		textField3_7 = new UppgiftField("7513");
		textField3_7.setBounds(265, 231, 138, 28);
		panel_6.add(textField3_7);
		textField3_7.setColumns(10);
		
		lable3_8 = new JLabel("3.8 Personalkostnader");
		lable3_8.setBounds(9, 287, 108, 14);
		panel_6.add(lable3_8);
		
		textField3_8 = new UppgiftField("7514");
		textField3_8.setBounds(265, 270, 138, 28);
		panel_6.add(textField3_8);
		textField3_8.setColumns(10);
		
		lable3_9 = new JLabel("<html>3.9 Av- och nedskrivningar av materiella       och immateriella anl\u00E4ggningstillg\u00E5nga</html>");
		lable3_9.setBounds(7, 310, 222, 28);
		panel_6.add(lable3_9);
		
		textField3_9 = new UppgiftField("7515");
		textField3_9.setBounds(265, 307, 138, 28);
		panel_6.add(textField3_9);
		textField3_9.setColumns(10);
		
		lable3_10 = new JLabel("<html>3.10 Nedskrivningar av oms\u00E4ttningstill-         g\u00E5ngar ut\u00F6ver normala nedskrivningar</html>");
		lable3_10.setBounds(10, 349, 222, 28);
		panel_6.add(lable3_10);
		
		textField3_10 = new UppgiftField("7516");
		textField3_10.setBounds(265, 345, 138, 28);
		panel_6.add(textField3_10);
		textField3_10.setColumns(10);
		
		lable3_11 = new JLabel("3.11 \u00D6vriga r\u00F6relsekostnader");
		lable3_11.setBounds(10, 397, 141, 14);
		panel_6.add(lable3_11);
		
		textField3_11 = new UppgiftField("7517");
		textField3_11.setBounds(265, 382, 138, 28);
		panel_6.add(textField3_11);
		textField3_11.setColumns(10);
		
		lable3_12 = new JLabel("3.12 Resultat fr\u00E5n andelar i koncernf\u00F6retag");
		lable3_12.setBounds(7, 437, 209, 14);
		panel_6.add(lable3_12);
		
		textField3_12 = new UppgiftField("7518");
		textField3_12.setBounds(265, 420, 138, 28);
		panel_6.add(textField3_12);
		textField3_12.setColumns(10);
		
		lable3_13 = new JLabel("3.13 Resultat fr\u00E5n andelar i intressef\u00F6retag");
		lable3_13.setBounds(7, 461, 209, 14);
		panel_6.add(lable3_13);
		
		textField3_13 = new UppgiftField("7519");
		textField3_13.setBounds(265, 455, 138, 28);
		panel_6.add(textField3_13);
		textField3_13.setColumns(10);
		
		lable3_14 = new JLabel("<html>3.14 Resultat fr\u00E5n \u00F6vriga finansiella  anl\u00E4ggningstillg\u00E5ngar</html>");
		lable3_14.setBounds(10, 487, 222, 40);
		panel_6.add(lable3_14);
		
		textField3_14 = new UppgiftField("7520");
		textField3_14.setBounds(265, 488, 138, 28);
		panel_6.add(textField3_14);
		textField3_14.setColumns(10);
		
		separator_51 = new JSeparator();
		separator_51.setOrientation(SwingConstants.VERTICAL);
		separator_51.setForeground(Color.BLACK);
		separator_51.setBounds(254, 0, 1, 547);
		panel_6.add(separator_51);
		
		separator_52 = new JSeparator();
		separator_52.setForeground(Color.BLACK);
		separator_52.setBounds(0, 34, 413, 1);
		panel_6.add(separator_52);
		
		separator_53 = new JSeparator();
		separator_53.setForeground(Color.BLACK);
		separator_53.setBounds(0, 77, 413, 1);
		panel_6.add(separator_53);
		
		separator_54 = new JSeparator();
		separator_54.setForeground(Color.BLACK);
		separator_54.setBounds(0, 114, 413, 1);
		panel_6.add(separator_54);
		
		separator_55 = new JSeparator();
		separator_55.setForeground(Color.BLACK);
		separator_55.setBounds(0, 150, 413, 1);
		panel_6.add(separator_55);
		
		separator_56 = new JSeparator();
		separator_56.setForeground(Color.BLACK);
		separator_56.setBounds(-1, 185, 413, 1);
		panel_6.add(separator_56);
		
		separator_57 = new JSeparator();
		separator_57.setForeground(Color.BLACK);
		separator_57.setBounds(0, 226, 413, 1);
		panel_6.add(separator_57);
		
		separator_58 = new JSeparator();
		separator_58.setForeground(Color.BLACK);
		separator_58.setBounds(0, 263, 413, 1);
		panel_6.add(separator_58);
		
		separator_59 = new JSeparator();
		separator_59.setForeground(Color.BLACK);
		separator_59.setBounds(1, 304, 413, 1);
		panel_6.add(separator_59);
		
		separator_60 = new JSeparator();
		separator_60.setForeground(Color.BLACK);
		separator_60.setBounds(0, 339, 413, 1);
		panel_6.add(separator_60);
		
		separator_61 = new JSeparator();
		separator_61.setForeground(Color.BLACK);
		separator_61.setBounds(0, 376, 413, 1);
		panel_6.add(separator_61);
		
		separator_62 = new JSeparator();
		separator_62.setForeground(Color.BLACK);
		separator_62.setBounds(0, 414, 413, 1);
		panel_6.add(separator_62);
		
		separator_63 = new JSeparator();
		separator_63.setForeground(Color.BLACK);
		separator_63.setBounds(1, 452, 413, 1);
		panel_6.add(separator_63);
		
		separator_64 = new JSeparator();
		separator_64.setForeground(Color.BLACK);
		separator_64.setBounds(-1, 484, 413, 1);
		panel_6.add(separator_64);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(474, 226, 413, 86);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label2_27 = new JLabel("2.27 Bundet eget kapital");
		label2_27.setBounds(7, 25, 118, 14);
		panel_1.add(label2_27);
		
		textField2_27 = new UppgiftField("7301");
		textField2_27.setBounds(265, 11, 138, 28);
		panel_1.add(textField2_27);
		textField2_27.setColumns(10);
		
		JLabel label2_28 = new JLabel("2.28 Fritt eget kapital");
		label2_28.setBounds(7, 64, 118, 14);
		panel_1.add(label2_28);
		
		textField2_28 = new UppgiftField("7302");
		textField2_28.setBounds(265, 50, 138, 28);
		panel_1.add(textField2_28);
		textField2_28.setColumns(10);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(Color.BLACK);
		separator_12.setBounds(0, 43, 413, 1);
		panel_1.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setForeground(Color.BLACK);
		separator_13.setBounds(253, 0, 2, 86);
		panel_1.add(separator_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(474, 338, 413, 295);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label2_29 = new JLabel("<html><b>Obeskattade reserver</b><br> 2.29 Periodiseringsfonder</html>");
		label2_29.setBounds(5, 11, 151, 28);
		panel_2.add(label2_29);
		
		textField2_29 = new UppgiftField("7321");
		textField2_29.setBounds(265, 11, 138, 28);
		panel_2.add(textField2_29);
		textField2_29.setColumns(10);
		
		JLabel label2_30 = new JLabel("2.30 Ackumulerade \u00F6veravskrivninga");
		label2_30.setBounds(5, 76, 177, 14);
		panel_2.add(label2_30);
		
		textField2_30 = new UppgiftField("7322");
		textField2_30.setBounds(265, 58, 138, 28);
		panel_2.add(textField2_30);
		textField2_30.setColumns(10);
		
		JLabel label2_31 = new JLabel("2.31 \u00D6vriga obeskattade reserver");
		label2_31.setBounds(5, 111, 164, 14);
		panel_2.add(label2_31);
		
		textField2_31 = new UppgiftField("7323");
		textField2_31.setBounds(265, 97, 138, 28);
		panel_2.add(textField2_31);
		textField2_31.setColumns(10);
		
		JLabel label2_32 = new JLabel("<html><b>Avs\u00E4ttningar</b> <br>2.32 Avs\u00E4ttningar f\u00F6r pensioner och liknande f\u00F6rpliktelser enligt lag (1967:531) om tryggande av pensionsutf\u00E4stelse m.m.</html>");
		label2_32.setBounds(5, 136, 232, 61);
		panel_2.add(label2_32);
		
		textField2_32 = new UppgiftField("7331");
		textField2_32.setBounds(265, 169, 138, 28);
		panel_2.add(textField2_32);
		textField2_32.setColumns(10);
		
		JLabel label2_33 = new JLabel("2.33 \u00D6vriga avs\u00E4ttningar f\u00F6r pensioner och liknande f\u00F6rpliktelser");
		label2_33.setBounds(5, 222, 232, 14);
		panel_2.add(label2_33);
		
		textField2_33 = new UppgiftField("7332");
		textField2_33.setBounds(265, 208, 138, 28);
		panel_2.add(textField2_33);
		textField2_33.setColumns(10);
		
		JLabel label2_34 = new JLabel("2.34 \u00D6vriga avs\u00E4ttningar");
		label2_34.setBounds(5, 273, 232, 14);
		panel_2.add(label2_34);
		
		textField2_34 = new UppgiftField("7333");
		textField2_34.setBounds(265, 259, 138, 28);
		panel_2.add(textField2_34);
		textField2_34.setColumns(10);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setForeground(Color.BLACK);
		separator_14.setBounds(0, 50, 413, 1);
		panel_2.add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setForeground(Color.BLACK);
		separator_15.setBounds(0, 89, 413, 1);
		panel_2.add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setForeground(Color.BLACK);
		separator_16.setBounds(0, 130, 413, 1);
		panel_2.add(separator_16);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setForeground(Color.BLACK);
		separator_17.setBounds(0, 200, 413, 1);
		panel_2.add(separator_17);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setForeground(Color.BLACK);
		separator_18.setBounds(0, 247, 413, 1);
		panel_2.add(separator_18);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setOrientation(SwingConstants.VERTICAL);
		separator_19.setForeground(Color.BLACK);
		separator_19.setBounds(253, 0, 2, 295);
		panel_2.add(separator_19);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(51, 730, 413, 547);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label2_13 = new JLabel("<html><b>Varulager</b><br> 2.13 R\u00E5varor och f\u00F6rn\u00F6denheter");
		label2_13.setBounds(7, 7, 175, 25);
		panel_3.add(label2_13);
		
		textField2_13 = new UppgiftField("7242");
		textField2_13.setBounds(265, 7, 138, 28);
		panel_3.add(textField2_13);
		textField2_13.setColumns(10);
		
		JLabel label2_14 = new JLabel("2.14 Varor under tillverkning");
		label2_14.setBounds(7, 53, 143, 14);
		panel_3.add(label2_14);
		
		textField2_14 = new UppgiftField("7242");
		textField2_14.setBounds(265, 46, 138, 28);
		panel_3.add(textField2_14);
		textField2_14.setColumns(10);
		
		JLabel label2_15 = new JLabel("2.15 F\u00E4rdiga varor och handelsvaror");
		label2_15.setBounds(7, 99, 186, 14);
		panel_3.add(label2_15);
		
		textField2_15 = new UppgiftField("7243");
		textField2_15.setBounds(265, 85, 138, 28);
		panel_3.add(textField2_15);
		textField2_15.setColumns(10);
		
		JLabel label2_16 = new JLabel("2.16 \u00D6vriga lagertillg\u00E5ngar");
		label2_16.setBounds(7, 140, 271, 14);
		panel_3.add(label2_16);
		
		textField2_16 = new UppgiftField("7244");
		textField2_16.setBounds(265, 126, 138, 28);
		panel_3.add(textField2_16);
		textField2_16.setColumns(10);
		
		JLabel label2_17 = new JLabel("2.17 P\u00E5g\u00E5ende arbeten f\u00F6r annans r\u00E4kning");
		label2_17.setBounds(7, 179, 207, 14);
		panel_3.add(label2_17);
		
		textField2_17 = new UppgiftField("7245");
		textField2_17.setBounds(265, 165, 138, 28);
		panel_3.add(textField2_17);
		textField2_17.setColumns(10);
		
		JLabel label2_18 = new JLabel("2.18 F\u00F6rskott till leverant\u00F6rer");
		label2_18.setBounds(7, 218, 143, 14);
		panel_3.add(label2_18);
		
		textField2_18 = new UppgiftField("7246");
		textField2_18.setBounds(265, 204, 138, 28);
		panel_3.add(textField2_18);
		textField2_18.setColumns(10);
		
		label2_19 = new JLabel("<html><b>Kortfristiga fordringar</b><br> 2.19 Kundfordringar");
		label2_19.setBounds(7, 243, 131, 25);
		panel_3.add(label2_19);
		
		textField2_19 = new UppgiftField("7251");
		textField2_19.setBounds(265, 236, 138, 28);
		panel_3.add(textField2_19);
		textField2_19.setColumns(10);
		
		label2_20 = new JLabel("2.20 Fordringar hos koncern- och intressef\u00F6retag");
		label2_20.setBounds(7, 291, 237, 14);
		panel_3.add(label2_20);
		
		textField2_20 = new UppgiftField("7252");
		textField2_20.setBounds(265, 277, 138, 28);
		panel_3.add(textField2_20);
		textField2_20.setColumns(10);
		
		label2_21 = new JLabel("2.21 \u00D6vriga fordringar");
		label2_21.setBounds(7, 330, 121, 14);
		panel_3.add(label2_21);
		
		textField2_21 = new UppgiftField("7261");
		textField2_21.setBounds(265, 316, 138, 28);
		panel_3.add(textField2_21);
		textField2_21.setColumns(10);
		
		label2_22 = new JLabel("2.22 Upparbetad men ej fakturerad int\u00E4kt");
		label2_22.setBounds(7, 369, 207, 14);
		panel_3.add(label2_22);
		
		textField2_22 = new UppgiftField("7262");
		textField2_22.setBounds(265, 355, 138, 28);
		panel_3.add(textField2_22);
		textField2_22.setColumns(10);
		
		label2_23 = new JLabel("2.23 F\u00F6rutbetalda kostnader och upplupna int\u00E4kter");
		label2_23.setBounds(7, 408, 245, 14);
		panel_3.add(label2_23);
		
		textField2_23 = new UppgiftField("7263");
		textField2_23.setBounds(265, 394, 138, 28);
		panel_3.add(textField2_23);
		textField2_23.setColumns(10);
		
		label2_24 = new JLabel("<html><b>Kortfristiga placeringar</b><br> 2.24 Andelar i koncernf\u00F6retag");
		label2_24.setBounds(7, 433, 149, 25);
		panel_3.add(label2_24);
		
		textField2_24 = new UppgiftField("7270");
		textField2_24.setBounds(265, 434, 138, 28);
		panel_3.add(textField2_24);
		textField2_24.setColumns(10);
		
		label2_25 = new JLabel("2.25 \u00D6vriga kortfristiga placeringar");
		label2_25.setBounds(7, 487, 175, 14);
		panel_3.add(label2_25);
		
		textField2_25 = new UppgiftField("7271");
		textField2_25.setBounds(265, 473, 138, 28);
		panel_3.add(textField2_25);
		textField2_25.setColumns(10);
		
		label2_26 = new JLabel("<html><b>Kassa och bank</b><br> 2.26 Kassa, bank och redovisningsmedel");
		label2_26.setBounds(7, 512, 207, 25);
		panel_3.add(label2_26);
		
		textField2_26 = new UppgiftField("7281");
		textField2_26.setBounds(265, 512, 138, 28);
		panel_3.add(textField2_26);
		textField2_26.setColumns(10);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setForeground(Color.BLACK);
		separator_20.setBounds(0, 41, 413, 1);
		panel_3.add(separator_20);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setForeground(Color.BLACK);
		separator_21.setBounds(0, 78, 413, 1);
		panel_3.add(separator_21);
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setForeground(Color.BLACK);
		separator_22.setBounds(0, 115, 413, 1);
		panel_3.add(separator_22);
		
		JSeparator separator_23 = new JSeparator();
		separator_23.setForeground(Color.BLACK);
		separator_23.setBounds(0, 155, 413, 1);
		panel_3.add(separator_23);
		
		JSeparator separator_24 = new JSeparator();
		separator_24.setForeground(Color.BLACK);
		separator_24.setBounds(0, 195, 413, 1);
		panel_3.add(separator_24);
		
		JSeparator separator_25 = new JSeparator();
		separator_25.setForeground(Color.BLACK);
		separator_25.setBounds(0, 233, 413, 1);
		panel_3.add(separator_25);
		
		JSeparator separator_26 = new JSeparator();
		separator_26.setForeground(Color.BLACK);
		separator_26.setBounds(0, 267, 413, 1);
		panel_3.add(separator_26);
		
		JSeparator separator_27 = new JSeparator();
		separator_27.setForeground(Color.BLACK);
		separator_27.setBounds(0, 310, 413, 1);
		panel_3.add(separator_27);
		
		JSeparator separator_28 = new JSeparator();
		separator_28.setForeground(Color.BLACK);
		separator_28.setBounds(0, 348, 413, 1);
		panel_3.add(separator_28);
		
		JSeparator separator_29 = new JSeparator();
		separator_29.setForeground(Color.BLACK);
		separator_29.setBounds(0, 388, 413, 1);
		panel_3.add(separator_29);
		
		JSeparator separator_30 = new JSeparator();
		separator_30.setForeground(Color.BLACK);
		separator_30.setBounds(0, 428, 413, 1);
		panel_3.add(separator_30);
		
		JSeparator separator_31 = new JSeparator();
		separator_31.setForeground(Color.BLACK);
		separator_31.setBounds(0, 469, 413, 1);
		panel_3.add(separator_31);
		
		JSeparator separator_32 = new JSeparator();
		separator_32.setForeground(Color.BLACK);
		separator_32.setBounds(0, 505, 413, 1);
		panel_3.add(separator_32);
		
		JSeparator separator_33 = new JSeparator();
		separator_33.setOrientation(SwingConstants.VERTICAL);
		separator_33.setForeground(Color.BLACK);
		separator_33.setBounds(254, 0, 1, 547);
		panel_3.add(separator_33);
		
		JSeparator separator_50 = new JSeparator();
		separator_50.setForeground(Color.GRAY);
		separator_50.setBounds(51, 1332, 836, 2);
		add(separator_50);
		
		titel3_15_28 = new JLabel("Resultatr\u00E4kning(forts.)");
		titel3_15_28.setBounds(474, 1373, 142, 15);
		add(titel3_15_28);
		titel3_15_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblInkr = new JLabel("INK2R");
		lblInkr.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInkr.setBounds(807, 38, 80, 38);
		add(lblInkr);
		
		JLabel lblRkenskapschema = new JLabel("<html><h2><b>R\u00E4kenskapsschema</h2><b>Inkomstdeklaration 2</b></html>");
		lblRkenskapschema.setBounds(474, 68, 215, 67);
		add(lblRkenskapschema);
		
		JSeparator separator_79 = new JSeparator();
		separator_79.setForeground(Color.BLACK);
		separator_79.setBounds(474, 199, 413, 1);
		add(separator_79);
		
		JSeparator separator_80 = new JSeparator();
		separator_80.setForeground(Color.BLACK);
		separator_80.setBounds(474, 157, 413, 1);
		add(separator_80);
		
		JSeparator separator_81 = new JSeparator();
		separator_81.setOrientation(SwingConstants.VERTICAL);
		separator_81.setForeground(Color.BLACK);
		separator_81.setBounds(688, 159, 2, 38);
		add(separator_81);
		
		JSeparator separator_82 = new JSeparator();
		separator_82.setOrientation(SwingConstants.VERTICAL);
		separator_82.setForeground(Color.BLACK);
		separator_82.setBounds(885, 157, 2, 43);
		add(separator_82);
		
		JSeparator separator_83 = new JSeparator();
		separator_83.setOrientation(SwingConstants.VERTICAL);
		separator_83.setForeground(Color.BLACK);
		separator_83.setBounds(474, 157, 2, 44);
		add(separator_83);
		
		orgnrField = new JTextField();
		orgnrField.setBounds(484, 164, 194, 28);
		add(orgnrField);
		orgnrField.setColumns(10);
		
		datFramstField = new JTextField();
		datFramstField.setColumns(10);
		datFramstField.setBounds(697, 165, 186, 28);
		add(datFramstField);
		
		JLabel lblOrganisationsnummer = new JLabel("Organisationsnummer");
		lblOrganisationsnummer.setBounds(474, 140, 142, 14);
		add(lblOrganisationsnummer);
		
		JLabel lblDatumDBlanketten = new JLabel("Datum d\u00E5 blanketten fylls i");
		lblDatumDBlanketten.setBounds(692, 140, 187, 14);
		add(lblDatumDBlanketten);
		
		JSeparator separator_84 = new JSeparator();
		separator_84.setForeground(Color.BLACK);
		separator_84.setBounds(50, 157, 414, 1);
		add(separator_84);
		
		JSeparator separator_85 = new JSeparator();
		separator_85.setOrientation(SwingConstants.VERTICAL);
		separator_85.setForeground(Color.BLACK);
		separator_85.setBounds(50, 156, 2, 42);
		add(separator_85);
		
		JSeparator separator_86 = new JSeparator();
		separator_86.setForeground(Color.BLACK);
		separator_86.setBounds(50, 198, 413, 1);
		add(separator_86);
		
		JSeparator separator_88 = new JSeparator();
		separator_88.setOrientation(SwingConstants.VERTICAL);
		separator_88.setForeground(Color.BLACK);
		separator_88.setBounds(465, 155, 2, 43);
		add(separator_88);
		
		JSeparator separator_89 = new JSeparator();
		separator_89.setOrientation(SwingConstants.VERTICAL);
		separator_89.setForeground(Color.BLACK);
		separator_89.setBounds(176, 156, 2, 42);
		add(separator_89);
		
		JSeparator separator_90 = new JSeparator();
		separator_90.setOrientation(SwingConstants.VERTICAL);
		separator_90.setForeground(Color.BLACK);
		separator_90.setBounds(322, 157, 2, 42);
		add(separator_90);
		
		JLabel lblRkenskapsr = new JLabel("R\u00E4kenskaps\u00E5r");
		lblRkenskapsr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRkenskapsr.setBounds(55, 175, 92, 24);
		add(lblRkenskapsr);
		
		from = new JTextField();
		from.setBounds(179, 166, 136, 28);
		add(from);
		from.setColumns(10);
		
		till = new JTextField();
		till.setColumns(10);
		till.setBounds(326, 166, 136, 28);
		add(till);
		
		JLabel lblFrom = new JLabel("Fr.o.m");
		lblFrom.setBounds(178, 140, 46, 14);
		add(lblFrom);
		
		JLabel lblTom = new JLabel("T.o.m");
		lblTom.setBounds(326, 140, 46, 14);
		add(lblTom);
		
		namnField = new JTextField();
		namnField.setBounds(49, 83, 100, 28);
		add(namnField);
		namnField.setColumns(10);
		
		JLabel lblNamn = new JLabel("namn");
		lblNamn.setBounds(51, 72, 46, 14);
		add(lblNamn);
		
		JButton btnVisa = new JButton("visa Filen");
		btnVisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					srudao.ShowSRUFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnVisa.setBounds(135, 29, 59, 23);
		add(btnVisa);
		
		
		
	
	
				
	}
}
