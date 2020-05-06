package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import wordsearch.Grid;

public class GridReader implements IGridReader {

	private File file;
	
	public GridReader() {
		this.file = new File("../TestGrid");
	}
	
	@Override
	public Grid read()  {

		List<String[]> lines = new ArrayList<String[]>();
		

		try (Scanner fileScanner = new Scanner(file)) {
			
			while (fileScanner.hasNext()) {
				String nextLine = fileScanner.nextLine();
				if (!nextLine.isEmpty()) {
					lines.add(lineProcessor(nextLine));
					
				}
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		return new Grid();
	}
	
	private String[] lineProcessor (String str) {
		return str.split(" ");
	}
}
