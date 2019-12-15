package me.justrandomusr.discordstorage.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import me.justrandomusr.discordstorage.controller.MainController;

public class MainView {
	
	public PaneDownload downloader;
	// public PaneUpload uploader;
	
	@SuppressWarnings("unused")
	private Stage stage;
	private Scene scene;
	private MainController controller;
	
	public MainView(Stage stage) {
		this.stage = stage;
	}
	
	public Scene build() {
		StackPane root;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/MainView.fxml"));
		} catch (IOException e) {
			System.out.println("An error occurred while loading FXML.");
			e.printStackTrace();
			return null;
		}
		
		scene = new Scene(root);
		
		controller = new MainController(this);
		downloader = new PaneDownload(this);
		
		return scene;
	}
	
	public MainController getController() {
		return controller;
	}
}
