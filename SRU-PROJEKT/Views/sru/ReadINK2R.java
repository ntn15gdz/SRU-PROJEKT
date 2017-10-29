package sru;


import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.apache.commons.io.FileUtils;
import javax.swing.JScrollPane;



public class ReadINK2R extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	@SuppressWarnings("deprecation")
	public ReadINK2R(File text) throws IOException {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 811);
		contentPane = new JPanel();
		
		
		contentPane.setLayout(null);
	
		JTextPane textPane = new JTextPane();
		textPane.setText(FileUtils.readFileToString(text));
		textPane.setBounds(10, 11, 428, 3000);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLocation(10, 11);
		scrollPane.setSize(428, 750);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(textPane);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);
	    
		getContentPane().add(contentPane);
		
	}
}
