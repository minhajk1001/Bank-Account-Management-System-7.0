/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest08;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rakeeb
 */
public class RegistrationPaneController implements Initializable {
    
    static int totalUser = 1910;
    public String[] userDetailsInput = new String[11];
    private String accType;
    private String sex;
    private int balance = 0 ;
    @FXML
    private Label newID;
    @FXML
    private TextField name;
    @FXML
    private TextField profession;
    @FXML
    private TextField address;
    @FXML
    private TextField email;
    @FXML
    private TextField dob;
    @FXML
    private TextField age;
    @FXML
    private TextField phone;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newUserRegisteres(ActionEvent event) {
        totalUser ++;
        
        userDetailsInput[0] = totalUser + "";
        userDetailsInput[1] = "100";
        userDetailsInput[2] = accType;
        userDetailsInput[3] = name.getText();
        userDetailsInput[4] = profession.getText();
        userDetailsInput[5] = sex;
        userDetailsInput[6] = age.getText();
        userDetailsInput[7] = dob.getText();
        userDetailsInput[8] = address.getText();
        userDetailsInput[9] = phone.getText();
        userDetailsInput[10] = email.getText();
        
//        for(int i=0; i<11; i++)
//            System.out.println(userDetailsInput[i]);
    }

    @FXML
    private void accSav(ActionEvent event) {
        accType = "Saving Acc";
    }

    @FXML
    private void accCheck(ActionEvent event) {
        accType = "Checking Acc";
    }

    @FXML
    private void sexMale(ActionEvent event) {
        sex = "Male";
    }

    @FXML
    private void sexFemale(ActionEvent event) {
        sex = "Female";
    }
 
    
}
