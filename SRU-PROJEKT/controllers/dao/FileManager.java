package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JFileChooser;
import javax.swing.WindowConstants;

import sru.LoadSRU;
import sru.ReadINK2R;

public class FileManager {
	JFileChooser fileChooser;
	public FileManager() {
		fileChooser = new JFileChooser();
	}
	public void printToFile(String filename, String text) throws IOException {
		
		fileChooser.setSelectedFile(new File (filename));
		int returnval= fileChooser.showSaveDialog(null);
		if(returnval == JFileChooser.APPROVE_OPTION) {
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		              new FileOutputStream(fileChooser.getSelectedFile()), "utf-8"))) {
		   writer.write(text);
		}
			}
	

}
	public void ShowSRUFile() throws IOException {
		fileChooser = new JFileChooser();
		int val= fileChooser.showOpenDialog(null);
		if(val == JFileChooser.APPROVE_OPTION) {
			ReadINK2R readtextpanel = new ReadINK2R(fileChooser.getSelectedFile());
			readtextpanel.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			readtextpanel.setVisible(true);
		
	}}
public void LoadSRUFile() throws IOException {
	JFileChooser fileChooser1 = new JFileChooser();
	int val= fileChooser1.showOpenDialog(null);
	if(val == JFileChooser.APPROVE_OPTION) {
		LoadSRU readtextpanel = new LoadSRU(fileChooser1.getSelectedFile());
		readtextpanel.LoadInfo();
	}
	
		
	}
}
