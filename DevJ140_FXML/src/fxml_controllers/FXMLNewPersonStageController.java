/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml_controllers;

import controller.DbManager;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Person;

/**
 * FXML Controller class
 *
 * @author Александр
 */
public class FXMLNewPersonStageController implements Initializable {

    @FXML
    private Label infoLabel;
    @FXML
    private TextField fistNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private DatePicker birthDateField;
    
    
    @FXML
    private void addPerson(ActionEvent event){
            if(fistNameField.getText().trim().isEmpty() ||
               lastNameField.getText().trim().isEmpty() ||
               birthDateField.getValue() == null){
               infoLabel.setText("All filed must be filled");                
            }
                        else {
                Person person = new Person();
                person.setFirst_name(fistNameField.getText());
                person.setLast_name(lastNameField.getText().trim());
                person.setBirth_date(Date.valueOf(birthDateField.getValue()));
                DbManager.addPerson(person);
                close();                
            }
    }
    
    @FXML
    private Button cancelButton;

    @FXML
    private void close(){
    Stage stage = (Stage) cancelButton.getScene().getWindow();
    stage.close();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    


}
