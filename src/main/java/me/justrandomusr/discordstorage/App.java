package me.justrandomusr.discordstorage;

import javafx.application.Application;
import javafx.stage.Stage;
import me.justrandomusr.discordstorage.view.MainView;

public class App extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setScene(new MainView(primaryStage).build());
		primaryStage.setTitle("DiscordStorage");
		primaryStage.show();
	}
}
