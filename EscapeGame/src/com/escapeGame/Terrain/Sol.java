package com.escapeGame.Terrain;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sol {

	private Rectangle rectangle;
	private Color color;
	
	public Sol(Color color, double longueur, double hauteur) {
		super();
		this.rectangle = new Rectangle();
		this.rectangle.setFill(color);
		this.rectangle.setWidth(longueur);
		this.rectangle.setHeight(hauteur);
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	
	
}
