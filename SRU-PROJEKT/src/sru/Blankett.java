package sru;



import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Blankett extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField1_1;
	private JTextField textField1_2;
	private JTextField textField1_3;
	private JTextField textField1_4;
	private JTextField textField1_5;
	private JTextField textField1_6;
	private JTextField textField1_7;
	private JTextField textField1_8;
	private JTextField textField1_9;
	private JTextField textField1_10;
	private JTextField textField1_11;
	private JTextField textField1_12;
	private JTextField textField1_13;
	private JTextField textField1_14;
	private JTextField textField1_15;

	/**
	 * Create the panel.
	 */
	public Blankett() {
		setLayout(new MigLayout("", "[][grow][][grow]", "[][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel titel1_3 = new JLabel("Underlag f\u00F6r inkomstskatt");
		titel1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(titel1_3, "cell 0 0");
		
		JLabel title4_5 = new JLabel("Underlag f\u00F6r s\u00E4rskild l\u00F6neskatt ");
		title4_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(title4_5, "cell 2 0");
		
		JLabel label1_1 = new JLabel("1.1  \u00D6verskott");
		add(label1_1, "cell 0 1,alignx left");
		
		textField1_1 = new JTextField();
		add(textField1_1, "cell 1 1,growx");
		textField1_1.setColumns(10);
		
		JLabel lable1_4 = new JLabel("1.4 Underlag f\u00F6r s\u00E4rskild l\u00F6ne-       skatt p\u00E5 pensionskostnader");
		add(lable1_4, "cell 2 1,alignx left");
		
		textField1_4 = new JTextField();
		add(textField1_4, "cell 3 1,growx");
		textField1_4.setColumns(10);
		
		JLabel lable1_2 = new JLabel("1.2 Underskott");
		add(lable1_2, "cell 0 2,alignx left");
		
		textField1_2 = new JTextField();
		add(textField1_2, "cell 1 2,growx");
		textField1_2.setColumns(10);
		
		JLabel lable1_5 = new JLabel("1.5 Negativt underlag f\u00F6r s\u00E4rskild        l\u00F6neskatt p\u00E5 pensionskostnader ");
		add(lable1_5, "cell 2 2,alignx left");
		
		textField1_5 = new JTextField();
		add(textField1_5, "cell 3 2,growx");
		textField1_5.setColumns(10);
		
		JLabel lable1_3 = new JLabel("1.3 Koncernbidrags- och fusions-       sp\u00E4rrade underskott (dvs.        underskott som inte ska redo-         visas i p. 1.2)");
		add(lable1_3, "cell 0 3,alignx left");
		
		textField1_3 = new JTextField();
		add(textField1_3, "cell 1 3,growx");
		textField1_3.setColumns(10);
		
		JLabel titel6_7 = new JLabel("Underlag f\u00F6r avkastningsskatt");
		titel6_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(titel6_7, "cell 2 5");
		
		JLabel lable1_6 = new JLabel("1.6 Underlag f\u00F6r avkastningsskatt        15 %. F\u00F6rs\u00E4kringsf\u00F6retag m.fl.        Avsatt till pensioner");
		add(lable1_6, "cell 2 6,alignx left");
		
		textField1_6 = new JTextField();
		add(textField1_6, "cell 3 6,growx");
		textField1_6.setColumns(10);
		
		JLabel lable1_7 = new JLabel("1.7 Underlag f\u00F6r avkastningsskatt          30 %. F\u00F6rs\u00E4kringsf\u00F6retag m.fl.        Utl\u00E4ndska kapitalf\u00F6rs\u00E4kringar");
		add(lable1_7, "cell 2 7,alignx left");
		
		textField1_7 = new JTextField();
		add(textField1_7, "cell 3 7,growx");
		textField1_7.setColumns(10);
		
		JLabel titel8_9 = new JLabel("Underlag f\u00F6r fastighetsavgift");
		titel8_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(titel8_9, "cell 0 9");
		
		JLabel titel10_15 = new JLabel("Underlag f\u00F6r fastighetsskatt");
		titel10_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(titel10_15, "cell 2 9,alignx left,aligny top");
		
		JLabel lable1_8 = new JLabel("1.8 Sm\u00E5hus/       \u00E4garl\u00E4genhet");
		add(lable1_8, "cell 0 10,alignx left");
		
		textField1_8 = new JTextField();
		add(textField1_8, "cell 1 10,growx");
		textField1_8.setColumns(10);
		
		JLabel lable1_10 = new JLabel("1.10 Sm\u00E5hus/\u00E4garl\u00E4genhet:         tomtmark, byggnad         under uppf\u00F6rande");
		add(lable1_10, "cell 2 10,alignx left");
		
		textField1_10 = new JTextField();
		add(textField1_10, "cell 3 10,growx");
		textField1_10.setColumns(10);
		
		JLabel lable1_9 = new JLabel("1.9 Hyreshus,        bost\u00E4der");
		add(lable1_9, "cell 0 11,alignx left");
		
		textField1_9 = new JTextField();
		add(textField1_9, "cell 1 11,growx");
		textField1_9.setColumns(10);
		
		JLabel lable1_11 = new JLabel("1.11 Hyreshus: tomtmark,          bost\u00E4der under          uppf\u00F6rande");
		add(lable1_11, "cell 2 11,alignx left");
		
		textField1_11 = new JTextField();
		add(textField1_11, "cell 3 11,growx");
		textField1_11.setColumns(10);
		
		JLabel lable1_12 = new JLabel("1.12 Hyreshus: lokaler");
		add(lable1_12, "cell 2 12,alignx left");
		
		textField1_12 = new JTextField();
		add(textField1_12, "cell 3 12,growx");
		textField1_12.setColumns(10);
		
		JLabel lable1_13 = new JLabel("1.13 Industri/elproduktions-           enhet, v\u00E4rmekraftverk            (utom vindkraftverk)");
		add(lable1_13, "cell 2 13,alignx left");
		
		textField1_13 = new JTextField();
		add(textField1_13, "cell 3 13,growx");
		textField1_13.setColumns(10);
		
		JLabel lable1_14 = new JLabel("1.14 Elproduktionsenhet,            vattenkraftverk ");
		add(lable1_14, "cell 2 14,alignx left");
		
		textField1_14 = new JTextField();
		add(textField1_14, "cell 3 14,growx");
		textField1_14.setColumns(10);
		
		JLabel lable1_15 = new JLabel("1.15 Elproduktionsenhet,          vindkraftverk");
		add(lable1_15, "cell 2 15,alignx left");
		
		textField1_15 = new JTextField();
		add(textField1_15, "cell 3 15,growx");
		textField1_15.setColumns(10);

	}

}
