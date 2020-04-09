package com.qa.main;

public class BandRelease {

	private CleanSinger clean = new CleanSinger();
	private ScreamoSinger scream = new ScreamoSinger();

	public void harmonise() {
		clean.vocals();
		scream.vocals();
	}

}
