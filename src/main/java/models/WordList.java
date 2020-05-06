package models;

import java.util.List;

import FileIO.*;

public class WordList {
	
	private List<String> wordList;

	public WordList(String filePath) {
		IFileReader reader = new FileReader(filePath);
		wordList = reader.read(filePath);
	}
	
	public List<String> getWordList() {
		return wordList;
	}
}
