package com.state.eraser;

public class ManufactureEraser {
	
	
	public static void main(String[] args) {

	//State Pattern to manufacture Eraser	
		Eraser eraser = new Eraser();
		eraser.InjectMoldProcess();
		eraser.screenPrintProcess();
		eraser.embossingProcess();
		
		
	}

}
