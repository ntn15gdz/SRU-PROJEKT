package sru;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class MainGUI extends JFrame {
	private static INK2RView blankett; // statisk för att ifall man hade flera av samma då hade det vart inte bra att ha statisk för då hade ändrat alla eftersom nu är det bara en så det gör inget.
	private static INFOSRU info;
	private static Writer Candidateoutput = null;
	
	private static final long serialVersionUID = 1L;
	private static File candidatefile;

	
	public static void main(String[] args) throws IOException {
		
		candidatefile = new File("info.sru");
		
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				
			
		
	}

	
	public MainGUI() throws IOException {
		
		
		JPanel contentPane;
		info = new INFOSRU();
		JScrollPane scrollablePane = new JScrollPane(blankett, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
		setBounds(100, 100, 977, 726);
=======
		setBounds(100, 100, 1024, 720);
>>>>>>> branch 'master' of https://github.com/ntn15gdz/SRU-projekt.git
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		tabbedPane.add(info);
<<<<<<< HEAD
		tabbedPane.add(scrollablePane);
=======
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		blankett = new INK2RView();
		tabbedPane.add(blankett);
>>>>>>> branch 'master' of https://github.com/ntn15gdz/SRU-projekt.git
		
		
		
	}
	public static void printToFile() throws IOException {
		Candidateoutput.write(info.textt());
		
	}

}
