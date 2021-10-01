package com.state.eraser;

public class InjectMolding implements EraserManufactureState {

	Eraser eraser;
	
		
	public InjectMolding(Eraser eraser) {
		super();
		this.eraser = eraser;
	}

	@Override
	public void injectionMolding() {
		// TODO Auto-generated method stub
		 System.out.println("Injection molding in process, to make the rubber as liquids");
		   eraser.setState(eraser.getInjectionMolding());
	}

	@Override
	public void screenPrinting() {
		// TODO Auto-generated method stub
	      System.out.println("Once injection molding done, will continue the screen printing process");
	}

	@Override
	public void Embossing() {
		// TODO Auto-generated method stub
	      System.out.println("Embossing will be done after screen printing");
	}

}
