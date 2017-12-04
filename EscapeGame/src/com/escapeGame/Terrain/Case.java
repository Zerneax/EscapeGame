package com.escapeGame.Terrain;

import javafx.scene.layout.StackPane;

public class Case {

	private int x;
	private int y;
	private double longeur;
	private double hauteur;
	private StackPane zone;
	
	
	public Case() {
		super();
		
	}

	public Case(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.zone = new StackPane();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public StackPane getZone() {
		return zone;
	}

	public void setZone(StackPane zone) {
		this.zone = zone;
	}
	
	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public void ajouterSol(Sol sol)
	{
		this.zone.getChildren().add(sol.getRectangle());
	}
	
}
