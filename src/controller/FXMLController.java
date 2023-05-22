/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXMLController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField usernamefilde;
    @FXML
    private TextField passwordfilde;
    @FXML
    private Label lapelerror;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlerloginButton(ActionEvent event) throws IOException {
      if (usernamefilde.getText().equals("user") && passwordfilde.getText().equals("userpass")) {
    ViewManager.openAdminPage();
} else {
    // Handle the case when the username or password is incorrect
}}

    @FXML
    private void handelusernamefilde(ActionEvent event) {
    }

    @FXML
    private void handelpasswordfilde(ActionEvent event) {
    }
    
}
