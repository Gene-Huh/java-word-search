package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import wordsearch.Grid;

public class GridReader implements IGridReader {

	private File file;
	
	public GridReader(String string) {
		this.file = string;
	}
	
	@Override
	public Grid read()  {

		List<String> lines = new ArrayList<String>();
		int cnt = 0;
		try (Scanner fileScanner = new Scanner(file)) {
			
			while (fileScanner.hasNext()) {
				String nextLine = fileScanner.nextLine();
				if (cnt > 1) {
					lines.add(nextLine);
				}
				cnt++;
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		return new Grid(lines);
	}
	
}
