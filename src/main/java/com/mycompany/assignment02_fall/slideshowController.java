package com.mycompany.assignment02_fall;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class slideshowController implements Initializable {

    @FXML
    private Label carTypeLabel;

    @FXML
    private ImageView carsView;

    @FXML
    private Label label;

    @FXML
    private BorderPane root;
    
    private PauseTransition delay1;
    
    private PauseTransition delay2;
    
    private PauseTransition delay3;
    
    private PauseTransition delay4;
    
    private Image redCar;
    
    private Image greenCar;
    
    private Image yellowCar;
    
    /**
     * switches the scene of the stage
     * @param fxml the fxml file
     */
    private void switchScene(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        redCar = new Image(getClass().getResource("redCar.png").toExternalForm());
        
        greenCar = new Image(getClass().getResource("greenCar.png").toExternalForm());
        
        yellowCar = new Image(getClass().getResource("yellowCar.png").toExternalForm());
        
        delay1 = new PauseTransition(Duration.seconds(6));
        delay2 = new PauseTransition(Duration.seconds(4));
        delay3 = new PauseTransition(Duration.seconds(4));
        delay4 = new PauseTransition(Duration.seconds(4));
        
        delay1.play();
        
        delay1.setOnFinished(e -> {
            carsView.setImage(redCar);
            carTypeLabel.setText("Car Type: Lamborghini");
            delay2.play();
        });     
        
        delay2.setOnFinished(e -> {
            carsView.setImage(greenCar);
            carTypeLabel.setText("Car Type: Ferrari");
            delay3.play();
        });  
        
        delay3.setOnFinished(e -> {
            carsView.setImage(yellowCar);
            carTypeLabel.setText("Car Type: Porsche");
            delay4.play();
        });  
        
        delay4.setOnFinished(e -> {
            switchScene("carRace.fxml");
        }); 
    }
}
