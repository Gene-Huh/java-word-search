package models;

import java.util.ArrayList;
import java.util.List;

import FileIO.FileReader;
import FileIO.IFileReader;

public class Grid {
	private String[][] grid;
	private ArrayList<String> sliceList;

	public Grid(String filePath) {
		FileReader reader = new FileReader(filePath);
		ArrayList<String> gridRaw = reader.read();
		
		grid = new String[gridRaw.size()][gridRaw.size()];
		for (int i=0;i<grid.length; i++) {
			grid[i]=gridRaw.get(i).split(" ");
		}
		sliceList = new ArrayList<String>();
	}
	
	public ArrayList<String> sliceGrid() {
		//sliceList.addAll(xySlicer());
		sliceList.addAll(diagonalSlicer());
		
		return sliceList;
	}
	
	public String[][] getGrid() {		
		return grid;
	}

	private ArrayList<String> xySlicer() {
		ArrayList<String> result = new ArrayList<>();
		StringBuilder[] yStrings = new StringBuilder[grid.length];
		for (int i=0; i<yStrings.length; i++) {
			yStrings[i] = new StringBuilder();
		}
		
		for (int i=0; i<grid.length; i++) {
			StringBuilder xString = new StringBuilder();
			for (int j=0; j< grid.length; j++) {
				yStrings[j].append(grid[i][j]);
				xString.append(grid[i][j]);
			} // end of inner loop
			result.add(xString.toString());
			result.add(xString.reverse().toString());
		}  //end of outer loop
		
		for (StringBuilder line : yStrings) {
			result.add(line.toString());
			result.add(line.reverse().toString());
		}
		
		return result;
	}
	
	private ArrayList<String> diagonalSlicer() {
		
		for( int k = 0 ; k < grid.length * 2 ; k++ ) {
	        for( int j = 0 ; j <= k ; j++ ) {
	            int i = k - j;
	            if( i < grid.length && j < grid.length ) {
	                System.out.print( grid[i][j] + " " );
	            }
	        } System.out.println();
		}
		
		return new ArrayList<String>();
	}
}