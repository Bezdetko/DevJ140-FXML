/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stages;

import fxml_controllers.FXMLTableStageController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Александр
 */
public class TableStage extends Stage {
    
    public TableStage(){
        Parent root;

            try {
                root = FXMLLoader.load(getClass().getResource("/views/FXMLTableStage.fxml"));
                Scene scene = new Scene(root);
                setMinWidth(250);
                setMinHeight(250);
                setScene(scene);
                show();
            } catch (IOException ex) {
                System.out.println("ERROR:" + ex.getMessage());
            }

    }
}
