package com.kodnest.oops.constructors;

public class CameraApp {

	public static void main(String[] args) {
		Camera c1 = new Camera ("Black","sony",48000);
		c1.captureImage();
		c1.displayImage();
		Camera c2 = new Camera ("orangw","bony",348000);
		c2.captureImage();
		c2.displayImage();
		
	}

}
