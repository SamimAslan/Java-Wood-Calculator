package ch.iet_gibb.heatcreatorfx.model;

import ch.iet_gibb.heatcreatorfx.model.HeatView;
import ch.iet_gibb.heatcreatorfx.model.Heater;
import javafx.event.ActionEvent;

import java.util.List;

public class HeatController implements javafx.event.EventHandler<ActionEvent> {


    protected List<Heater> models;
    protected HeatView view;
    protected int currentLabel=0;

    public HeatController(List<Heater> models) {
        this.models = models;
    }

    public void setView(HeatView view){
        this.view=view;
    }

    public void startView(){
        view.startView(models.get(currentLabel));
    }

    public void showNextLabel(){
        if(currentLabel < models.size()-1) {
            currentLabel++;
        }else{
            currentLabel = 0;
        }
        view.startView(models.get(currentLabel));
    }

    public String getLabel(){
        //greift auf die Liste zu, spricht das Element currentLabel an und ruft auf diesem Objekt die toSTring Mehtode auf
        return models.get(currentLabel).toString();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        showNextLabel();

    }
}