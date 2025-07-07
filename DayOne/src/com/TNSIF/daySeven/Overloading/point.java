package com.TNSIF.daySeven.Overloading;
//Constructor overloading
public class point {
	private float x;
	private float y;
	
	public point()
	
	{
		x=0.0f;
		y=0.8f;
	}

	public point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}

}
