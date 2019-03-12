package fromCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteOut {

	public void writeOut(ArrayList<ArrayList<String>> SHEET) {
		for (ArrayList<String> sorok : SHEET) {
			for (String cella : sorok) {
				System.out.print(cella + " ");
			}
			System.out.println();
		}

	}

	public void writeToFile(ArrayList<ArrayList<String>> SHEET) throws IOException {
		File file2 = new File("Oribatida.csv");
		FileWriter fileOut = new FileWriter (file2);
		
		for (ArrayList<String> row : SHEET) {
			String sor = "";
			for (int i = 0; i < row.size(); i++) {
				sor += row.get(i);
				if (i < row.size() - 1) {
					sor += ";";
				}
				
			}
			fileOut.write(sor + "\n");
		}
		fileOut.close();
		
	}

}
