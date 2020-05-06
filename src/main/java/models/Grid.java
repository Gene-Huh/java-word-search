package models;

import java.util.ArrayList;
import java.util.List;

import FileIO.FileReader;
import FileIO.IFileReader;

public class Grid {
	private ArrayList<String[]> grid;
	private ArrayList<String> sliceList;

	public Grid(String filePath) {
		IFileReader reader = new FileReader(filePath);
		List<String> gridRaw = reader.read(filePath);
		for (String rowRaw : gridRaw) {
			grid.add(rowRaw.split(" "));
		}
	}
	
	public List<String> sliceGrid() {
		xySlicer();
		
		
		return sliceList;
	}
	
	public List<String[]> getGrid() {		
		return grid;
	}


	private void xySlicer() {
	
		StringBuilder xString = new StringBuilder();
		for (int i=0; i<grid.size(); i++) {
			xString.append(grid.get(i));
			
			StringBuilder yString = new StringBuilder();
			for (int j=0; i< grid.get(i).length; j++) {
				yString.append(grid.get(i)[j]);
			}
			sliceList.add(yString.toString());
			
		}
		sliceList.add(xString.toString());
	}
}