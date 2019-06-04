package com.tom.i;
import javafx.stage.Stage;
import java.awt.Button;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.FlowPane;

public class MyGame extends Application {
	public void start(Stage primaryStage) throws Exception{
		FlowPane flow = new FlowPane();
		Button ok = new Button("OK");
		flow.getChildren().add(ok);
		Scene main = new Scene (flow);
		primaryStage.setScene(main);
		
	}
	
	
	
}
