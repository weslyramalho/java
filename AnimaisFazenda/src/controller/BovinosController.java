
package controller;

import animaisfazenda.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import model.Bovino;
import util.Alerts;

/**
 *
 * @author wesly
 */
public class BovinosController implements Initializable {

    @FXML
    private TableView<Bovino> tableBovino;
    
    @FXML
    private TableColumn<Bovino, Long> tableColumnId;
    
     @FXML
    private TableColumn<Bovino, String> tableColumnRaca;
     
      @FXML
    private TableColumn<Bovino, String> tableColumnSexo;
    
    @FXML
    private MenuItem buscar;
    
   @FXML
   public void onNovoAction(){
       loadView("/view/Novo.fxml");
   }
    @FXML
   public void onDeletarAction(){
        System.out.println("asa");
   }
    @FXML
   public void onBuscarAction(){
       loadView("/view/AnimaisList.fxml");
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private synchronized void loadView(String viewNome){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(viewNome));
            VBox newVbox = loader.load();
            
            Scene mainScene = AnimaisFazenda.getMainScene();
            VBox mainVBox = (VBox)((ScrollPane) mainScene.getRoot()).getContent();
            
            Node maiMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(maiMenu);
            mainVBox.getChildren().addAll(newVbox.getChildren());
        }catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view",e.getMessage(), AlertType.ERROR);
        }
    }
}
