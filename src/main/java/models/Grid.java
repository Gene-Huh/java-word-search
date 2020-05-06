package models;

import java.util.ArrayList;
import java.util.List;

import FileIO.FileReader;
import FileIO.IFileReader;

public class Grid {
	private String[][] grid;
	private ArrayList<String> sliceList;

	public Grid(String filePath) {
		IFileReader reader = new FileReader(filePath);
		List<String> gridRaw = reader.read(filePath);
		
		grid = new String[gridRaw.size()][gridRaw.size()];
		for (int i=0;i<grid.length; i++) {
			grid[i]=gridRaw.get(i).split(" ");
		}
	}
	
	public List<String> sliceGrid() {
		xySlicer();
		
		
		return sliceList;
	}
	
	public String[][] getGrid() {		
		return grid;
	}


	private void xySlicer() {
	
		StringBuilder xString = new StringBuilder();
		for (int i=0; i<grid.length; i++) {
			xString.append(grid[i]);
			
			StringBuilder yString = new StringBuilder();
			for (int j=0; i< grid[i].length; j++) {
				yString.append(grid[i][j]);
			}
			sliceList.add(yString.toString());
			
		}
		sliceList.add(xString.toString());
	}
}