package fiap.com.br;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML private TextField textFieldMarca;
    @FXML private TextField textFieldModelo;
    @FXML private TextField textFieldPreco;
    @FXML private TextField textFieldAno;
    @FXML private TextField textFieldPlaca;
    @FXML private ListView<veiculo> listView;

private List<veiculo> lista = new ArrayList<>();

public void salvar(){
    String marca = textFieldMarca.getText();
    String modelo = textFieldModelo.getText();
    //TODO tratar erro de conversão
    int ano = Integer.valueOf(textFieldAno.getText());
    double preco = Double.valueOf(textFieldPreco.getText());
    String placa = textFieldPlaca.getText();
    
    veiculo Veiculo = new veiculo (marca, modelo, ano, preco, placa);
    System.out.println("SALVAR VEICULO");
    lista.add(Veiculo);

    Alert alerta = new Alert(AlertType.INFORMATION);
    alerta.setContentText("Veículo cadastrado com sucesso")
    alerta.show();

    textFieldMarca.setText("");
    textFieldModelo.setText("");
    textFieldPreco.setText("");
    textFieldAno.setText("");
    textFieldPlaca.setText("");
    
    listView.getItems().addAll(lista);

}
}
   


