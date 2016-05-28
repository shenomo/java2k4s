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
import main.entities.PlaneEntity;

/**
 * Created by zamkovoyilya on 28/05/16.
 */


public class AdminPlaneController extends AbstractController{

    public Button planesPage;
    public Button flightPage;
    public Button staffPage;

    public TableView<PlaneEntity> table;

    public TableColumn<PlaneEntity, String> firstColumn;
    public TableColumn<PlaneEntity, String> secondColumn;
    public TableColumn<PlaneEntity, String> thirdColumn;


    public Button logout;


    public TextField planeName;
    public TextField planeSerialNumber;
    public TextField planeStatus;



    @FXML
   private void initialize(){


        firstColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        secondColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSerialNumber()));
        thirdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStatus()));

        ObservableList<PlaneEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getPlanes());
        table.setItems(list);

    }




    public void addPlane(ActionEvent event) {

        PlaneEntity planeEnt = new PlaneEntity();

        planeEnt.setName(planeName.getText());
        planeEnt.setSerialNumber(planeSerialNumber.getText());
        planeEnt.setStatus(planeStatus.getText());

        server.doPost("new_plane", planeEnt);
        adminPlane(event);
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
