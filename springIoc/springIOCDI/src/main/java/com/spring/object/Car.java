package com.spring.object;

public class Car {
	
	MusicPlayear musicPlayear;

	public void setMusicPlayear(MusicPlayear musicPlayear) {
		this.musicPlayear = musicPlayear;
	}
	
	public void test()
	{
		musicPlayear.run();
	}
}
