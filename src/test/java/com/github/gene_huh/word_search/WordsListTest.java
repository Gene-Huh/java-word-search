package com.github.gene_huh.word_search;

import org.junit.*;

import models.WordList;

public class WordsListTest {

	private String filePath = "words-list.txt";
	@Test
	public void wordList_gets_all_words() {
		WordList testList = new WordList(filePath);
		Assert.assertEquals(62799, testList.getWordList().size());
	}

}
