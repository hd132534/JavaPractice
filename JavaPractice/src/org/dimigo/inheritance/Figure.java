package org.dimigo.inheritance;

public class Figure {
	
	private int centerX = 0;
	private int centerY = 0;
	
	public Figure() {
		
	}
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}

	protected double calcArea() {
		return 0.0;
	}
	
}