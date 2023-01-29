/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package animaisfazenda;

import dao.AnimalDao;
import dao.DaoFactory;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class AnimaisFazenda extends Application {
    private static Scene mainScene;
    
     @Override
    public void start(Stage primaryStage) throws Exception {
     try { 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Inicial.fxml")); 
         ScrollPane scrollPane = loader.load(); 
         scrollPane.setFitToHeight(true);
         scrollPane.setFitToWidth(true);
        mainScene = new Scene(scrollPane); 
        primaryStage.setScene(mainScene); 
        primaryStage.setTitle("Cadastro de Animais 1.0"); 
        primaryStage.show(); 
        } catch (IOException e) { 
        e.printStackTrace(); 
 } 
    }
    
    public static Scene getMainScene(){
        return mainScene;
    }
    public static void main(String[] args) {
        
        launch(args);
        AnimalDao animalDao = DaoFactory.createAnimalDao();
    }
    
}
