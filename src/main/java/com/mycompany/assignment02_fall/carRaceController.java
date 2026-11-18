package com.mycompany.assignment02_fall;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.animation.Animation.Status.RUNNING;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class carRaceController implements Initializable {

    @FXML
    private Rectangle arrivalRectangle;

    @FXML
    private Label arrivalText;

    @FXML
    private Circle blueCarBackWheel;

    @FXML
    private Polygon blueCarFrame;

    @FXML
    private Circle blueCarFrontWheel;

    @FXML
    private Label blueCarNumber;

    @FXML
    private Rectangle blueCarNumberRectangle;

    @FXML
    private Line blueCarWindowEdge;

    @FXML
    private Polygon blueCarWindows;

    @FXML
    private Label finalResultsLabel;

    @FXML
    private Circle greenCarBackWheel;

    @FXML
    private Polygon greenCarFrame;

    @FXML
    private Circle greenCarFrontWheel;

    @FXML
    private Label greenCarNumber;

    @FXML
    private Rectangle greenCarNumberRectangle;

    @FXML
    private Line greenCarWindowEdge;

    @FXML
    private Polygon greenCarWindows;

    @FXML
    private Button pauseBtn;

    @FXML
    private Label raceStatusLabel;

    @FXML
    private Label raceWinnerLabel;

    @FXML
    private Circle redCarBackWheel;

    @FXML
    private Polygon redCarFrame;

    @FXML
    private Circle redCarFrontWheel;

    @FXML
    private Label redCarNumber;

    @FXML
    private Rectangle redCarNumberRectangle;

    @FXML
    private Line redCarWindowEdge;

    @FXML
    private Polygon redCarWindows;

    @FXML
    private Button resetBtn;

    @FXML
    private ListView<String> resultsListView;

    @FXML
    private Rectangle roadRectangle;

    @FXML
    private Pane root;

    @FXML
    private Label simulationSpeed;

    @FXML
    private HBox simulationSpeedBox;

    @FXML
    private Label simulationSpeedLabel;

    @FXML
    private Slider simulationSpeedSlider;

    @FXML
    private Button startBtn;

    @FXML
    private Rectangle startingRectangle;

    @FXML
    private Label startingText;

    @FXML
    private Circle yellowCarBackWheel;

    @FXML
    private Polygon yellowCarFrame;

    @FXML
    private Circle yellowCarFrontWheel;

    @FXML
    private Label yellowCarNumber;

    @FXML
    private Rectangle yellowCarNumberRectangle;

    @FXML
    private Line yellowCarWindowEdge;

    @FXML
    private Polygon yellowCarWindows;
    
    @FXML
    private Line blueCarBackWheelRotation;
    
    @FXML
    private Line blueCarFrontWheelRotation;
    
    @FXML
    private Line redCarBackWheelRotation;
    
    @FXML
    private Line redCarFrontWheelRotation;
    
    @FXML
    private Line greenCarBackWheelRotation;
    
    @FXML
    private Line greenCarFrontWheelRotation;
    
    @FXML
    private Line yellowCarBackWheelRotation;
    
    @FXML
    private Line yellowCarFrontWheelRotation;
    
    @FXML
    private Group blueCar;
    
    @FXML
    private Group redCar;
    
    @FXML
    private Group greenCar;
    
    @FXML
    private Group yellowCar;
    
    TranslateTransition blueCarTranslating;
    
    RotateTransition blueCarBackWheelRotating;
    
    RotateTransition blueCarFrontWheelRotating;
    
    TranslateTransition redCarTranslating;
    
    RotateTransition redCarBackWheelRotating;
    
    RotateTransition redCarFrontWheelRotating;
    
    TranslateTransition greenCarTranslating;
    
    RotateTransition greenCarBackWheelRotating;
    
    RotateTransition greenCarFrontWheelRotating;
    
    TranslateTransition yellowCarTranslating;
    
    RotateTransition yellowCarBackWheelRotating;
    
    RotateTransition yellowCarFrontWheelRotating;
    
    ParallelTransition carsRacing;
    
    Duration blueCarDuration;
    
    Duration redCarDuration;
    
    Duration greenCarDuration;
    
    Duration yellowCarDuration;
    
    private carRaceModel carRace = new carRaceModel();
    
    @FXML
    private void OnStartButtonPressed() {
        if (carsRacing.getStatus() == RUNNING) {
            return;
        }
        
        int resultsSize = resultsListView.getItems().size();
        
        for (int i = 0; i < resultsSize; i++) {
            resultsListView.getItems().remove(0);
        }
        
        raceWinnerLabel.setText("");
        raceStatusLabel.setText("Race in progress!");
        
        carRace.setBlueCarSpeed();
        carRace.setRedCarSpeed();
        carRace.setGreenCarSpeed();
        carRace.setYellowCarSpeed();
        
        blueCarDuration = Duration.millis(25200 / (carRace.getBlueCarSpeed() * simulationSpeedSlider.getValue()));
        redCarDuration = Duration.millis(25200 / (carRace.getRedCarSpeed() * simulationSpeedSlider.getValue()));
        greenCarDuration = Duration.millis(25200 / (carRace.getGreenCarSpeed() * simulationSpeedSlider.getValue()));
        yellowCarDuration = Duration.millis(25200 / (carRace.getYellowCarSpeed() * simulationSpeedSlider.getValue()));
        
        blueCarTranslating.setDuration(blueCarDuration);
        blueCarBackWheelRotating.setDuration(blueCarDuration);
        blueCarFrontWheelRotating.setDuration(blueCarDuration);
        
        redCarTranslating.setDuration(redCarDuration);
        redCarBackWheelRotating.setDuration(redCarDuration);
        redCarFrontWheelRotating.setDuration(redCarDuration);
        
        greenCarTranslating.setDuration(greenCarDuration);
        greenCarBackWheelRotating.setDuration(greenCarDuration);
        greenCarFrontWheelRotating.setDuration(greenCarDuration);

        yellowCarTranslating.setDuration(yellowCarDuration);
        yellowCarBackWheelRotating.setDuration(yellowCarDuration);
        yellowCarFrontWheelRotating.setDuration(yellowCarDuration);

        carsRacing.play();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        simulationSpeed.textProperty().bind(simulationSpeedSlider.valueProperty().asString("%.2fx")); 
        simulationSpeedSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            
        });  
        
        blueCar.getChildren().addAll(blueCarFrame, blueCarBackWheel, blueCarFrontWheel, blueCarWindows, blueCarWindowEdge, blueCarNumberRectangle, blueCarNumber, blueCarBackWheelRotation, blueCarFrontWheelRotation);
        blueCarBackWheelRotation.toFront();
        blueCarFrontWheelRotation.toFront();
        
        blueCarTranslating = new TranslateTransition(Duration.ZERO, blueCar);
        blueCarTranslating.setFromX(0);
        blueCarTranslating.setToX(530);
        blueCarTranslating.setInterpolator(Interpolator.LINEAR);
        
        blueCarBackWheelRotating = new RotateTransition(Duration.ZERO, blueCarBackWheelRotation);
        blueCarBackWheelRotating.setFromAngle(0);
        blueCarBackWheelRotating.setByAngle(6073.2);
        blueCarBackWheelRotating.setInterpolator(Interpolator.LINEAR);
        
        blueCarFrontWheelRotating = new RotateTransition(Duration.ZERO, blueCarFrontWheelRotation);
        blueCarFrontWheelRotating.setFromAngle(0);
        blueCarFrontWheelRotating.setByAngle(6073.2);
        blueCarFrontWheelRotating.setInterpolator(Interpolator.LINEAR);
        
        redCar.getChildren().addAll(redCarFrame, redCarBackWheel, redCarFrontWheel, redCarWindows, redCarWindowEdge, redCarNumberRectangle, redCarNumber, redCarBackWheelRotation, redCarFrontWheelRotation);
        redCarBackWheelRotation.toFront();
        redCarFrontWheelRotation.toFront();

        redCarTranslating = new TranslateTransition(Duration.ZERO, redCar);
        redCarTranslating.setFromX(0);
        redCarTranslating.setToX(530);
        redCarTranslating.setInterpolator(Interpolator.LINEAR);

        redCarBackWheelRotating = new RotateTransition(Duration.ZERO, redCarBackWheelRotation);
        redCarBackWheelRotating.setFromAngle(0);
        redCarBackWheelRotating.setByAngle(6073.2);
        redCarBackWheelRotating.setInterpolator(Interpolator.LINEAR);

        redCarFrontWheelRotating = new RotateTransition(Duration.ZERO, redCarFrontWheelRotation);
        redCarFrontWheelRotating.setFromAngle(0);
        redCarFrontWheelRotating.setByAngle(6073.2);
        redCarFrontWheelRotating.setInterpolator(Interpolator.LINEAR);
        
        greenCar.getChildren().addAll(greenCarFrame, greenCarBackWheel, greenCarFrontWheel, greenCarWindows, greenCarWindowEdge, greenCarNumberRectangle, greenCarNumber, greenCarBackWheelRotation, greenCarFrontWheelRotation);
        greenCarBackWheelRotation.toFront();
        greenCarFrontWheelRotation.toFront();

        greenCarTranslating = new TranslateTransition(Duration.ZERO, greenCar);
        greenCarTranslating.setFromX(0);
        greenCarTranslating.setToX(530);
        greenCarTranslating.setInterpolator(Interpolator.LINEAR);

        greenCarBackWheelRotating = new RotateTransition(Duration.ZERO, greenCarBackWheelRotation);
        greenCarBackWheelRotating.setFromAngle(0);
        greenCarBackWheelRotating.setByAngle(6073.2);
        greenCarBackWheelRotating.setInterpolator(Interpolator.LINEAR);

        greenCarFrontWheelRotating = new RotateTransition(Duration.ZERO, greenCarFrontWheelRotation);
        greenCarFrontWheelRotating.setFromAngle(0);
        greenCarFrontWheelRotating.setByAngle(6073.2);
        greenCarFrontWheelRotating.setInterpolator(Interpolator.LINEAR);
        
        yellowCar.getChildren().addAll(yellowCarFrame, yellowCarBackWheel, yellowCarFrontWheel, yellowCarWindows, yellowCarWindowEdge, yellowCarNumberRectangle, yellowCarNumber, yellowCarBackWheelRotation, yellowCarFrontWheelRotation);
        yellowCarBackWheelRotation.toFront();
        yellowCarFrontWheelRotation.toFront();

        yellowCarTranslating = new TranslateTransition(Duration.ZERO, yellowCar);
        yellowCarTranslating.setFromX(0);
        yellowCarTranslating.setToX(530);
        yellowCarTranslating.setInterpolator(Interpolator.LINEAR);

        yellowCarBackWheelRotating = new RotateTransition(Duration.ZERO, yellowCarBackWheelRotation);
        yellowCarBackWheelRotating.setFromAngle(0);
        yellowCarBackWheelRotating.setByAngle(6073.2);
        yellowCarBackWheelRotating.setInterpolator(Interpolator.LINEAR);

        yellowCarFrontWheelRotating = new RotateTransition(Duration.ZERO, yellowCarFrontWheelRotation);
        yellowCarFrontWheelRotating.setFromAngle(0);
        yellowCarFrontWheelRotating.setByAngle(6073.2);
        yellowCarFrontWheelRotating.setInterpolator(Interpolator.LINEAR);
         
        carsRacing = new ParallelTransition(blueCarTranslating, blueCarBackWheelRotating, blueCarFrontWheelRotating, 
                redCarTranslating, redCarBackWheelRotating, redCarFrontWheelRotating, 
                greenCarTranslating, greenCarBackWheelRotating, greenCarFrontWheelRotating, 
                yellowCarTranslating, yellowCarBackWheelRotating, yellowCarFrontWheelRotating);
        
        blueCar.translateXProperty().addListener(cl -> {
            if (blueCarTranslating.getCurrentTime().toString().equals(blueCarDuration.toString())) {
                int placement = resultsListView.getItems().size() + 1;
                
                switch (placement) {
                    case 1: {resultsListView.getItems().add(carRace.getBlueCarType() + " #" + carRace.getBlueCarNumber() + " (" + carRace.getBlueCarColour() + ")                   1st");
                    finalResultsLabel.setText("Final Results:");
                    raceWinnerLabel.setText("Congratulations! " + carRace.getBlueCarType() + " #" + carRace.getBlueCarNumber() + " (" + carRace.getBlueCarColour() + ") is the winner!");    
                    raceStatusLabel.setText("One car finished the race!");} break;
                    case 2: {resultsListView.getItems().add(carRace.getBlueCarType() + " #" + carRace.getBlueCarNumber() + " (" + carRace.getBlueCarColour() + ")                   2nd");
                    raceStatusLabel.setText("Two cars finished the race!");} break;
                    case 3: {resultsListView.getItems().add(carRace.getBlueCarType() + " #" + carRace.getBlueCarNumber() + " (" + carRace.getBlueCarColour() + ")                   3rd");
                    raceStatusLabel.setText("Three cars finished the race!");} break;
                    default: {resultsListView.getItems().add(carRace.getBlueCarType() + " #" + carRace.getBlueCarNumber() + " (" + carRace.getBlueCarColour() + ")                   4th");
                    raceStatusLabel.setText("The race is completed!");}
                }
            }
        });
        
        redCar.translateXProperty().addListener(cl -> {
            if (redCarTranslating.getCurrentTime().toString().equals(redCarDuration.toString())) {
                int placement = resultsListView.getItems().size() + 1;
                
                switch (placement) {
                    case 1: {resultsListView.getItems().add(carRace.getRedCarType() + " #" + carRace.getRedCarNumber() + " (" + carRace.getRedCarColour() + ")         1st");
                    finalResultsLabel.setText("Final Results:");
                    raceWinnerLabel.setText("Congratulations! " + carRace.getRedCarType() + " #" + carRace.getRedCarNumber() + " (" + carRace.getRedCarColour() + ") is the winner!");    
                    raceStatusLabel.setText("One car finished the race!");} break;
                    case 2: {resultsListView.getItems().add(carRace.getRedCarType() + " #" + carRace.getRedCarNumber() + " (" + carRace.getRedCarColour() + ")         2nd");
                    raceStatusLabel.setText("Two cars finished the race!");} break;
                    case 3: {resultsListView.getItems().add(carRace.getRedCarType() + " #" + carRace.getRedCarNumber() + " (" + carRace.getRedCarColour() + ")         3rd");
                    raceStatusLabel.setText("Three cars finished the race!");} break;
                    default: {resultsListView.getItems().add(carRace.getRedCarType() + " #" + carRace.getRedCarNumber() + " (" + carRace.getRedCarColour() + ")         4th");
                    raceStatusLabel.setText("The race is completed!");}
                }
            }
        });
        
        greenCar.translateXProperty().addListener(cl -> {
            if (greenCarTranslating.getCurrentTime().toString().equals(greenCarDuration.toString())) {
                int placement = resultsListView.getItems().size() + 1;
                
                switch (placement) {
                    case 1: {resultsListView.getItems().add(carRace.getGreenCarType() + " #" + carRace.getGreenCarNumber() + " (" + carRace.getGreenCarColour() + ")               1st");
                    finalResultsLabel.setText("Final Results:");
                    raceWinnerLabel.setText("Congratulations! " + carRace.getGreenCarType() + " #" + carRace.getGreenCarNumber() + " (" + carRace.getGreenCarColour() + ") is the winner!");    
                    raceStatusLabel.setText("One car finished the race!");} break;
                    case 2: {resultsListView.getItems().add(carRace.getGreenCarType() + " #" + carRace.getGreenCarNumber() + " (" + carRace.getGreenCarColour() + ")               2nd");
                    raceStatusLabel.setText("Two cars finished the race!");} break;
                    case 3: {resultsListView.getItems().add(carRace.getGreenCarType() + " #" + carRace.getGreenCarNumber() + " (" + carRace.getGreenCarColour() + ")               3rd");
                    raceStatusLabel.setText("Three cars finished the race!");} break;
                    default: {resultsListView.getItems().add(carRace.getGreenCarType() + " #" + carRace.getGreenCarNumber() + " (" + carRace.getGreenCarColour() + ")               4th");
                    raceStatusLabel.setText("The race is completed!");}
                }
            }
        });
        
        yellowCar.translateXProperty().addListener(cl -> {
            if (yellowCarTranslating.getCurrentTime().toString().equals(yellowCarDuration.toString())) {
                int placement = resultsListView.getItems().size() + 1;
                
                switch (placement) {
                    case 1: {resultsListView.getItems().add(carRace.getYellowCarType() + " #" + carRace.getYellowCarNumber() + " (" + carRace.getYellowCarColour() + ")              1st");
                    finalResultsLabel.setText("Final Results:");
                    raceWinnerLabel.setText("Congratulations! " + carRace.getYellowCarType() + " #" + carRace.getYellowCarNumber() + " (" + carRace.getYellowCarColour() + ") is the winner!");    
                    raceStatusLabel.setText("One car finished the race!");} break;
                    case 2: {resultsListView.getItems().add(carRace.getYellowCarType() + " #" + carRace.getYellowCarNumber() + " (" + carRace.getYellowCarColour() + ")              2nd");
                    raceStatusLabel.setText("Two cars finished the race!");} break;
                    case 3: {resultsListView.getItems().add(carRace.getYellowCarType() + " #" + carRace.getYellowCarNumber() + " (" + carRace.getYellowCarColour() + ")              3rd");
                    raceStatusLabel.setText("Three cars finished the race!");} break;
                    default: {resultsListView.getItems().add(carRace.getYellowCarType() + " #" + carRace.getYellowCarNumber() + " (" + carRace.getYellowCarColour() + ")              4th");
                    raceStatusLabel.setText("The race is completed!");}
                }
            }
        });
    }
}
