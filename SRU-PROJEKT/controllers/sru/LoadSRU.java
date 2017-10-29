package sru;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class LoadSRU {
	private String text;
	@SuppressWarnings("deprecation")
	public LoadSRU(File infoFile) throws IOException {
		this.text = FileUtils.readFileToString(infoFile);
	
	}
	public void LoadInfo() {
		text = text.replaceAll("[^#\\s]*#\\s*", "");
		System.out.print(text);
	}
}
