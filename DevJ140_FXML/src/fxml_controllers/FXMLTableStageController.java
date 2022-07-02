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
import javafx.scene.Scene;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Person;
import stages.NewPersonStage;
import stages.TableStage;

/**
 * FXML Controller class
 *
 * @author Александр
 */
public class FXMLTableStageController implements Initializable {
    
    public static boolean isDark = false;
    
    @FXML
    TableView <Person> table;
    
    @FXML
    TableColumn<Person, Integer> idCol;
    
    @FXML
    TableColumn<Person, String> firstNameCol;
    
    @FXML
    TableColumn<Person, String> lastNameCol;
    
    @FXML
    TableColumn<Person, Date> birthDateCol;
    
    @FXML
    RadioMenuItem standartTheme;
    
    @FXML
    RadioMenuItem darkTheme;
    
    @FXML
    private void updateTableByButton(){
        updateTable();
    }
    
    @FXML
    private void addPerson(){
        NewPersonStage nps = new NewPersonStage();
    }
    
    @FXML
    private void setStandartCss(){
        if(!darkTheme.isSelected()){
        Scene scene = (Scene) table.getScene();
        scene.getStylesheets().clear();
        }
       
    }
    
    @FXML
    private void setCustomCss(){
        if(darkTheme.isSelected()){
        isDark = true;     
        Scene scene = (Scene) table.getScene();
        scene.getStylesheets().add("/views/fxmltablestage.css");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateTable();
    }    
    
    private void updateTable(){
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        birthDateCol.setCellValueFactory(new PropertyValueFactory<>("birth_date"));

        table.setItems(DbManager.getPersonList());
    }
    
    
    
    
}
