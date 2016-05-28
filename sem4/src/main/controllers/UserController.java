package main.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import main.entities.FlightEntity;

/**
 * Created by zamkovoyilya on 29/05/16.
 */

public class UserController extends AbstractController{


    public TableColumn<FlightEntity, String> firstColumn;
    public TableColumn<FlightEntity, String> secondColumn;
    public TableColumn<FlightEntity, String> thirdColumn;
    public TableColumn<FlightEntity, String> fourthColumn;
    public TableColumn<FlightEntity, String> fifthColumn;
    public TableView <FlightEntity> table;
    public Button flightButton;


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






}
