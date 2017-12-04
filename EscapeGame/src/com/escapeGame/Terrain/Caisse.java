package com.escapeGame.Terrain;

import javafx.scene.image.Image;

public class Caisse {

	private Image image;

	public Caisse() {
		super();
		this.image = new Image(this.getClass().getResourceAsStream("/caisse.png"));
	}

	public Image getImage() {
		return image;
	}
	
	
}
