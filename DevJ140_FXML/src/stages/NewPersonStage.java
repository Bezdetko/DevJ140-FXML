/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stages;

import fxml_controllers.FXMLTableStageController;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Александр
 */
public class NewPersonStage extends Stage {

    public NewPersonStage() {
        Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("/views/NewPersonStage.fxml"));
                Scene scene = new Scene(root);
                setScene(scene);
                setResizable(false);
                        if(FXMLTableStageController.isDark){
                        scene.getStylesheets().add("/views/fxmltablestage.css");
                        }
                show();
            } catch (IOException ex) {
                System.out.println("ERROR:" + ex.getMessage());
            }

    }
    
    
}
