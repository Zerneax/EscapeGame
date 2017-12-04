package com.escapeGame.affichage;

import com.escapeGame.Terrain.Caisse;
import com.escapeGame.Terrain.Case;
import com.escapeGame.Terrain.Terrain;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class AffichageTerrain {

	private Group root;
	private Terrain terrain;
	
	public AffichageTerrain(Group root) {
		super();
		this.root = root;
	}
	
	public void initialiserTerrain(int nbLigne, int nbColonne)
	{
		this.terrain = new Terrain(nbLigne, nbColonne);
		this.root.getChildren().add(this.terrain.getTerrain());
		for(int i=0; i < nbLigne; i ++)
		{
			for(int j=0; j < nbColonne; j ++)
			{
				Case c = new Case(i, j);
				c.setLongeur(root.getScene().getWidth() / nbColonne);
				c.setHauteur(root.getScene().getHeight() / nbLigne);
				this.terrain.ajouterCaseTerrain(i, j, c);
			}
		}
		
		ajouterCaisses(nbLigne, nbColonne);
	}
	
	private void ajouterCaisses(int nbLignes, int nbColonnes)
	{
		for(int i = 0; i < ((nbLignes * nbColonnes) / 3); i ++)
		{
			Rectangle sol = getRectangle(nbLignes, nbColonnes);

			sol.setFill(new ImagePattern(new Caisse().getImage()));
		}
	}
	
	private Rectangle getRectangle(int ligne, int colonne) 
	{
		GridPane paneTmp = this.terrain.getTerrain();
		StackPane stackPane = null;
		
		stackPane = (StackPane) paneTmp.getChildren().get(nombreAleatoire(ligne*colonne));
		
		return (Rectangle) stackPane.getChildren().get(0);
	}

	private int nombreAleatoire(int max)
	{
		return (int) (1 + (Math.random() * ((max - 1) +1)));
	}
	
	public Group getRoot() {
		return root;
	}

	public void setRoot(Group root) {
		this.root = root;
	}
	
	
}
