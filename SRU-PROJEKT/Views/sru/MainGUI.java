package sru;


import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JMenuBar;

import javax.swing.JMenu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;


public class MainGUI extends JFrame {
	private static INK2RView blankett; // statisk för att ifall man hade flera av samma då hade det vart inte bra att ha statisk för då hade ändrat alla eftersom nu är det bara en så det gör inget.
	private static INFOSRU info;
	
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
		setBounds(100, 100, 1204, 676);
		JFileChooser fileChooser = new JFileChooser();
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("arkiv");
		menuBar.add(mnNewMenu);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 1180, 600);
		contentPane.add(tabbedPane);
		tabbedPane.add("info",info);
		
		
		
		blankett = new INK2RView();
		//tabbedPane.add("blankett",blankett);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(blankett);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	 
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		JButton btnSparaSom = new JButton("spara som..");
		mnNewMenu.add(btnSparaSom);
		btnSparaSom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnval= fileChooser.showSaveDialog(contentPane);
				if(returnval == JFileChooser.APPROVE_OPTION) {
					path = fileChooser.getSelectedFile().getPath();
				}
			}
		});
		
	}
	public static void printToFile(String filename, String text) throws IOException {
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(path + text), "utf-8"))) {
	   writer.write(text);
	}
		
	}

}
