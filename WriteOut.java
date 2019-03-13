package fromCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteOut {

	public void writeToFile(ArrayList<ArrayList<String>> SHEET) throws IOException {
		
		File file2 = new File("Oribatida.csv");
		FileWriter fileOut = new FileWriter (file2);
		
		String joined;
		for (ArrayList<String> row : SHEET) {
			
			joined = String.join(";", row);
			System.out.println(joined);
			fileOut.write(joined + "\n");
		}
		fileOut.close();
	}
}
