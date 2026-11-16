package com.mycompany.assignment02_fall;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

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
    private ListView<?> resultsListView;

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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        simulationSpeed.textProperty().bind(simulationSpeedSlider.valueProperty().asString("%.1f x")); 
        simulationSpeedSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            
        });
    }
}
