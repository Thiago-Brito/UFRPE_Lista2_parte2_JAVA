package parte02;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pane root = FXMLLoader.load(getClass().getResource("FXMLVenda.fxml")) ;
		
		Scene scene = new Scene(root,445.0,252.0);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Venda de produto");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

