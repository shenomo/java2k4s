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
import main.entities.StaffEntity;

/**
 * Created by zamkovoyilya on 28/05/16.
 */
public class AdminStaffController extends AbstractController{


    public Button planesPage;
    public Button flightPage;
    public Button staffPage;
    public Button logout;

    public TableView<StaffEntity> table;

    public TableColumn<StaffEntity, String> firstColumn;
    public TableColumn<StaffEntity, String > secondColumn;
    public TableColumn<StaffEntity, String > thirdColumn;
    public TextField staffIdentity;
    public TextField staffLogin;
    public TextField staffPassw;


    @FXML
    public void initialize(){

        firstColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentity()));
        secondColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLogin()));
        thirdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPassw()));


        ObservableList<StaffEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getStaffs());
        table.setItems(list);
    }



    public void addStaff(ActionEvent event){

        StaffEntity staff = new StaffEntity();

        staff.setIdentity(staffIdentity.getText());
        staff.setLogin(staffLogin.getText());
        staff.setPassw(staffPassw.getText());


        server.doPost("new_staff", staff);
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
