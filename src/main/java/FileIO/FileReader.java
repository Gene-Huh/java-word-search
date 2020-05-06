package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Grid;

public class FileReader implements IFileReader {

	private File file;
	
	public FileReader(String filePath) {
		this.file = new File(filePath);
	}
	
	@Override
	public List<String> read(String filePath)  {

		List<String> dataList = new ArrayList<>();
		try (Scanner fileScanner = new Scanner(file)) {
			
			while (fileScanner.hasNext()) {
				String nextLine = fileScanner.nextLine();
				if (!nextLine.isEmpty()) {
					dataList.add(nextLine);
				}
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		return dataList;
	}
}
