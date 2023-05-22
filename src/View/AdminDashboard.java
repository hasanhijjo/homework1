/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Yahya
 */
public class AdminDashboard extends Stage {
    
    Scene SystemPageScene;
    
    public AdminDashboard() throws IOException {
        
        FXMLLoader SystemPageLoader = new FXMLLoader(getClass().getResource("/homework1fx/SystemPage.fxml"));
        Parent SystemPageRoot = SystemPageLoader.load();
        SystemPageScene = new Scene(SystemPageRoot);
        this.setScene(SystemPageScene);
        this.setTitle("System Page");
    }
 
    
    public void changeSceneToSystemPageScene() {
        this.setScene(SystemPageScene);
    }
    
}
