package parte01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class FXMLControle implements Initializable{
	@FXML
	private Label label;
	
	@FXML
    private TextField txtBarra;
	
	@FXML
	private void clique(ActionEvent event) {
		int quantidadeLetras = 0;
		System.out.println("clicou");
		
		
		for(int i = 0;i<txtBarra.getLength();i++) {
			if(txtBarra.getCharacters().charAt(i) != ' ') {
				quantidadeLetras++;
			}
			
			label.setText("O texto tem "+quantidadeLetras+" caracteres");
		}
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
