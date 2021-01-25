package parte02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class FXMLControle implements Initializable{
	
	@FXML
    private TextField txtDescricao;
	@FXML
    private TextField txtValor;

    @FXML
    private TextField txtQuantidade;
    @FXML
    private Label label;
	
	@FXML
	private void clique(ActionEvent event) {
		try {
		
		if(txtDescricao.getText().equals("")) {
			Alert cuidado = new Alert(Alert.AlertType.WARNING);
			cuidado.setTitle("Alerta");
			cuidado.setHeaderText("Favor,informar o campo de descri��o");
			cuidado.show();
		}else if(txtValor.getText().equals("")){
			Alert cuidado = new Alert(Alert.AlertType.WARNING);
			cuidado.setTitle("Alerta");
			cuidado.setHeaderText("Favor,informar o campo de Valor");
			cuidado.show();
			
		}else if(txtQuantidade.getText().equals("")){
			Alert cuidado = new Alert(Alert.AlertType.WARNING);
			cuidado.setTitle("Alerta");
			cuidado.setHeaderText("Favor,informar o campo de Quantidade");
			cuidado.show();
			
		}else {
		Produto produto01 = new Produto(Double.parseDouble(txtValor.getText().trim()),Integer.parseInt(txtQuantidade.getText().trim()),txtDescricao.getText());
		
		Alert info = new Alert(Alert.AlertType.INFORMATION);
		info.setTitle("Mensagem");
		info.setHeaderText("O valor calculado para a venda do produto "+produto01.getDescricao()+" � R$"+produto01.calcularTotal());
		info.show();}
		}catch(NumberFormatException nfe) {
			Alert cuidado = new Alert(Alert.AlertType.WARNING);
			cuidado.setTitle("Alerta");
			cuidado.setHeaderText("Favor,informar os campos com o dado certo");
			cuidado.show();
		}
		}
		
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}