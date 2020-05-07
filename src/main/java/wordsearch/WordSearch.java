package wordsearch;

import java.util.ArrayList;
import java.util.Scanner;

import FileIO.FileReader;
import FileIO.IFileReader;
import models.Grid;

public class WordSearch {

	//private Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Grid gridTester = new Grid("TestGrid");
		gridTester.getGrid();
		
		@SuppressWarnings("unused")
		ArrayList<String> testSlicer = gridTester.sliceGrid();
	}

	//private File getGridFromUser()
}
