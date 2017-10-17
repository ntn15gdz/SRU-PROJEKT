import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Testasruinfo {

	public static void main(String[] args) throws IOException {
		Writer Candidateoutput = null;
		File Candidatefile = new File("info.sru");
		Candidateoutput = new BufferedWriter(new FileWriter(Candidatefile));
	   
	
		SRU_info min = new SRU_info("SRU2013", "2017", "blanketter.sru", "191111111111", "påhittad bolag", "80267", "gävle");
		System.out.print(min.getSruText());
		Candidateoutput.write(min.getSruText());
		Candidateoutput.close();
	}
	

}
