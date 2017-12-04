package com.escapeGame.Terrain;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Terrain {

	private GridPane terrain;
	private int nbCaseX;
	private int nbCaseY;
	
	public Terrain() {
		super();
	}

	public Terrain(int nbCaseX, int nbCaseY) {
		super();
		this.terrain = new GridPane();
		this.terrain.setGridLinesVisible(true);
		this.nbCaseX = nbCaseX;
		this.nbCaseY = nbCaseY;
	}

	public int getNbCaseX() {
		return nbCaseX;
	}

	public void setNbCaseX(int nbCaseX) {
		this.nbCaseX = nbCaseX;
	}

	public int getNbCaseY() {
		return nbCaseY;
	}

	public void setNbCaseY(int nbCaseY) {
		this.nbCaseY = nbCaseY;
	}

	public GridPane getTerrain() {
		return this.terrain;
	}
	
	
	public void ajouterCaseTerrain(int ligne, int colonne, Case c)
	{
		c.ajouterSol(new Sol(Color.rgb(105, 96, 93, 0.4), c.getLongeur(), c.getHauteur()));
		this.terrain.add(c.getZone(), colonne, ligne);
	}
	
}
