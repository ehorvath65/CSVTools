package fromCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FromCSV implements GlobalVariables {
	
	

	public void fromCSV() throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Oribatid.csv");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String row = bufferedReader.readLine();

		while (row != null) {
			ArrayList<String> arrayList = new ArrayList<>(
					Arrays.asList(row.split(";"))	
			);
			SHEET.add(arrayList);
			row = bufferedReader.readLine();
		}
		bufferedReader.close();
	}
		
//		public void writeOut() {
//		for (ArrayList<String> sorok : SHEET) {
//			for (String cella : sorok) {
//				System.out.print(cella + " ");
//			}
//			System.out.println();
//		}
//		
//	}
	

}
