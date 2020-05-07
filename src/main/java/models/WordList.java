package models;

import java.util.List;

import FileIO.*;

public class WordList {
	
	private List<String> wordList;

	public WordList(String filePath) {
		FileReader reader = new FileReader(filePath);
		wordList = reader.read();
	}
	
	public List<String> getWordList() {
		return wordList;
	}
}
