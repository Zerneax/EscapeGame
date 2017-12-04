package com.escapeGame.main;

import com.escapeGame.affichage.AffichageTerrain;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lanceur extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("Escape factory");
		Group root = new Group();
		Scene scene = new Scene(root, 960, 480);
	
		AffichageTerrain affichageTerrain = new AffichageTerrain(root);
		affichageTerrain.initialiserTerrain(30, 60);
		
		stage.setScene(scene);
		stage.show();

	}

}
