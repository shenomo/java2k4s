package main.controllers;

import javafx.event.ActionEvent;
import main.Client;
import main.connection.ServerConnection;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class AbstractController {

    public void setApp(Client app) {
        this.app = app;
    }

    protected Client app;
    protected ServerConnection server = new ServerConnection();

    public void adminFlight(ActionEvent actionEvent) {
        app.showPage("AdminFlight");
    }

    public void adminPlane(ActionEvent actionEvent) {
        app.showPage("adminPlane");
    }

    public void staffPage(ActionEvent actionEvent) {
        app.showPage("staff");
    }

    public void staffReg(ActionEvent actionEvent) {
        app.showPage("staffReg");
    }

    public void user(ActionEvent actionEvent) {
        app.showPage("User");
    }

    public void userReg(ActionEvent actionEvent) {
        app.showPage("userReg");
    }




}
