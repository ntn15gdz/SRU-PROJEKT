package sru;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JMenuBar;

import javax.swing.JMenu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class MainGUI extends JFrame {
	private static INK2RView blankett; // statisk för att ifall man hade flera av samma då hade det vart inte bra att ha statisk för då hade ändrat alla eftersom nu är det bara en så det gör inget.
	private static INFOSRU info;
	private static JFileChooser fileChooser;
	private static String path;
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		 UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
		
		
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				
			
		
	}

	
	public MainGUI() throws IOException {
		
		JPanel contentPane;
		
		info = new INFOSRU();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 676);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 954, 600);
		contentPane.add(tabbedPane);
		tabbedPane.add("info",info);
		
		
		
		blankett = new INK2RView();
		//tabbedPane.add("blankett",blankett);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(blankett);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	 
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		
		
	}
	public static void printToFile(String filename, String text) throws IOException {
		fileChooser = new JFileChooser();
		fileChooser.setSelectedFile(new File (filename));
		int returnval= fileChooser.showSaveDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		              new FileOutputStream(fileChooser.getSelectedFile()), "utf-8"))) {
		   writer.write(text);
		}
		
	}

}
}