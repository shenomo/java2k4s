package main.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.entities.FlightEntity;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class AdminContoller extends AbstractController{


    public Button planesPage;
    public Button flightPage;
    public Button staffPage;
    public Button logout;

    public TextField departureTime;
    public TextField arrivingTime;
    public TextField toDirection;
    public TextField fromDirection;
    public TextField identity;

    public TableColumn<FlightEntity, String> firstColumn;
    public TableColumn<FlightEntity, String> secondColumn;
    public TableColumn<FlightEntity, String> thirdColumn;
    public TableColumn<FlightEntity, String> fourthColumn;
    public TableColumn<FlightEntity, String> fifthColumn;
    public TableView <FlightEntity> table;


    @FXML
    private void initialize(ActionEvent event){

        firstColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFromDirection()));
        secondColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getToDirection()));
        thirdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getArrivingTime()));
        fourthColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDepartureTime()));
        fifthColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentity()));

        ObservableList<FlightEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getFlights());
        table.setItems(list);

    }



    public void addFlight(ActionEvent actionEvent){


            FlightEntity entity = new FlightEntity();
            entity.setFromDirection(fromDirection.getText());
            entity.setToDirection(toDirection.getText());
            entity.setArrivingTime(arrivingTime.getText());
            entity.setDepartureTime(departureTime.getText());
            entity.setIdentity(identity.getText());

            server.doPost("new_flight", entity);
            adminFlight(actionEvent);

    }


    public void planePage(ActionEvent event){

        if(event.getSource() == planesPage){
            app.showPage("adminPlane");

        }

    }


    public void staffPage(ActionEvent event){

        if(event.getSource() == staffPage){
            app.showPage("adminStaffPage");
        }

    }


    public void flightPage(ActionEvent event){

        if(event.getSource() == flightPage){

            app.showPage("AdminFlight");
        }

    }

}
