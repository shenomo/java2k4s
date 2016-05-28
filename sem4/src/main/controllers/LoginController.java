package main.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.connection.ServerAuth;

/**
 * Created by zamkovoyilya on 27/05/16.
 */


public class LoginController extends AbstractController{
    public TextField loginTextField;
    public PasswordField passwordField;

    public void handleSubmitAction(ActionEvent actionEvent) {
        ServerAuth auth = new ServerAuth();
        if (auth.tryAuth(loginTextField.getText(), passwordField.getText())) {
            switch (ServerAuth.getRole()) {

                case ROLE_ADMIN:
                    app.showPage("AdminFlight");

                    break;
                case ROLE_STAFF:
                    app.showPage("staff");
                    break;
                case ROLE_CLIENT:
                    app.showPage("User");
                    break;
            }

        }
    }

}
