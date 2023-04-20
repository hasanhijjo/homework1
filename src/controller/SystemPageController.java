/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static javax.management.Query.value;


/**
 * FXML Controller class
 *
 * @author HP
 */
public class SystemPageController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button logoutbutton;
    @FXML
    private Button convertbutton;
    @FXML
    private TextField USDField;
    @FXML
    private TextField NISField;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handellogoutbutton(ActionEvent event) throws IOException {
  
    }

    @FXML
    private void handelconvertbutton(ActionEvent event) {

        try {

            if (NISField.getText().length() > 0) {
                double nis = Double.parseDouble(NISField.getText());
                double usdValue = nis / 3.5;

                USDField.setText(Double.toString(usdValue));

            } else if (USDField.getText().length() > 0) {
                double usd = Double.parseDouble(USDField.getText());
                double nisValue = usd * 3.5;

                NISField.setText(Double.toString(nisValue));
            } else {
                label.setText("Invalid input");
            }

        } catch (NumberFormatException e) {
            label.setText("Invalid input");
            System.out.println("Invalid input");
        }
    }
}
