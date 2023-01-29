/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package cadastroanimais;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author wesly
 */
public class CadastroAnimais extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
     try { 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/loginView.fxml")); 
         Parent parent = loader.load(); 
         Scene mainScene = new Scene(parent); 
        primaryStage.setScene(mainScene); 
        primaryStage.setTitle("Cadastro de Animais 1.0"); 
        primaryStage.show(); 
        } catch (IOException e) { 
        e.printStackTrace(); 
 } 
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
