package com.github.gene_huh.word_search;

import org.junit.*;

import models.Grid;

public class GridTest {
	private String filePath = "TestGrid";
	
	@Test
	public void Grid_Loader_Test() {
		Grid testGrid = new Grid(filePath);
		Assert.assertEquals(8, testGrid.getGrid().size());
	}

	@Test
	public void Grid_Slicer_Test() {
		Grid testGrid = new Grid(filePath);
		Assert.assertEquals(84, testGrid.sliceGrid().size());
	}
}
