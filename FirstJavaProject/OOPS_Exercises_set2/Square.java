package com.exercises.OOPS_Exercises_set2;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
		// TODO: Initialize side with the passed value
	}

	public int calculateArea() {
		if (side <= 0) {
			return -1;
		}
		return side * side;

	}

	public int calculatePerimeter() {
		if (side <= 0) {
			return -1;
		}
		// TODO: Calculate and return the area of the square
		return 4 * side;
	}

}
