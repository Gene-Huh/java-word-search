package models;

import java.util.List;

import FileIO.FileReader;
import FileIO.IFileReader;

public class Grid {
	private List<String> gridList;
	private List<String> sliceList;

	public Grid(String filePath) {
		IFileReader reader = new FileReader(filePath);
		gridList = reader.read(filePath);
	}
	
	public List<String> sliceGrid() {
		return sliceList;
	}
	public List<String> loadGrid() {
		return gridList;
	}
}
