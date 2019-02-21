package fromCSV;

import java.io.IOException;

public class CSVTools {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FromCSV olvas = new FromCSV();
		olvas.fromCSV();
		new Convert().convert();
		new WriteOut().writeToFile();
		
		
	}

}
