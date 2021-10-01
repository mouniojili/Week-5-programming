package com.state.eraser;

public class Eraser {
	
	EraserManufactureState injectionMolding;
	
	EraserManufactureState screenPrinting;
	
	EraserManufactureState embossing;
	
	EraserManufactureState state;
	
	public Eraser() {
		
		injectionMolding = new InjectMolding(this);
		screenPrinting  = new ScreenPrinting(this);
		embossing = new Embossing(this);
		
		state=injectionMolding;		
		
	}

	//getters & setters
	public EraserManufactureState getInjectionMolding() {
		return injectionMolding;
	}

	public void setInjectionMolding(EraserManufactureState injectionMolding) {
		this.injectionMolding = injectionMolding;
	}

	public EraserManufactureState getScreenPrinting() {
		return screenPrinting;
	}

	public void setScreenPrinting(EraserManufactureState screenPrinting) {
		this.screenPrinting = screenPrinting;
	}

	public EraserManufactureState getEmbossing() {
		return embossing;
	}

	public void setEmbossing(EraserManufactureState embossing) {
		this.embossing = embossing;
	}

	public EraserManufactureState getState() {
		return state;
	}

	public void setState(EraserManufactureState state) {
		this.state = state;
	}
	

	//Methods 
	public void InjectMoldProcess() {
		state.injectionMolding();
	}
	
	public void screenPrintProcess() {
		state.screenPrinting();
	}
	
	public void embossingProcess() {
		state.Embossing();
	}

}
