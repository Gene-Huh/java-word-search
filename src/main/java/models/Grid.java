package models;

import java.util.List;

import FileIO.FileReader;
import FileIO.IFileReader;

public class Grid {
	private List<String> gridList;

	public Grid(String filePath) {
		IFileReader reader = new FileReader(filePath);
		gridList = reader.read(filePath);
	}
	
	public List<String> loadGrid() {
		return gridList;
	}
}
