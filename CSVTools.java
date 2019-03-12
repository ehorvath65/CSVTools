package fromCSV;

import java.io.IOException;
import java.util.ArrayList;

public class CSVTools {
	
	public final ArrayList<ArrayList<String>> SHEET = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		CSVTools csvTools = new CSVTools();
		csvTools.peldanye();
	}
	
	public void peldanye() throws IOException {
		
//		FromCSV olvas = new FromCSV();
//		olvas.fromCSV(SHEET);
		new FromCSV().fromCSV(SHEET);
		new Convert().convert(SHEET);
		WriteOut kiir = new WriteOut();
		kiir.writeOut(SHEET);
		kiir.writeToFile(SHEET);
		//new WriteOut().writeToFile(SHEET);
	}
}
