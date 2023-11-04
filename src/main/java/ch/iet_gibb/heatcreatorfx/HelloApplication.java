package ch.iet_gibb.heatcreatorfx;

import ch.iet_gibb.heatcreatorfx.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Heater> models = createModels();
        HeatController heatController = new HeatController(models);
        HeatView heatView = new HeatView(stage, heatController );
        heatController.setView(heatView);
        heatController.startView();

    }

    public static void main(String[] args) {
        launch();
    }

    protected List<Heater> createModels(){
        ArrayList<Heater> labels = new ArrayList<>();
        Heater chip = new ChipCalculator("Chip heater", "beech", 15000.0);
        labels.add(chip);
        Heater pellet = new PelletCalculator("Pellet heater", 10000.0);
        labels.add(pellet);
        Heater wood = new WoodCalculator("Wood heater", "fir", 20000.0);
        labels.add(wood);
        return labels;
    }
}