/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest08;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Rakeeb
 */
public class UserDetailsController implements Initializable {

    private String userDetails[];

    @FXML
    public Label name;
    @FXML
    public Label email;
    @FXML
    public Label sex;
    @FXML
    public Label dob;
    public Label accountType;
    @FXML
    public Label age;
    @FXML
    public Label balance;
    @FXML
    public Label profession;
    @FXML
    public Label phone;
    @FXML
    public Label address;
    public Label accType;
    @FXML
    public Label transactionId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showUserDetails(ActionEvent event) {
        
        String[] UserDetails = new String[11]; 
        try{
        UserDetails = fr.fileCopy(transactionId.getText(), 11);
        }
        catch(IOException e){
            
        }
        for(int i=0; i<11; i++){
            switch(i){
                case 0:
                    accountId.setText(UserDetails[i]);
                    break;
                case 1:
                    balance.setText(UserDetails[i]);
                    break;    
                case 2:
                    accountType.setText(UserDetails[i]);
                    break;   
                case 3:
                    name.setText(UserDetails[i]);
                    break;
                case 4:
                    prof.setText(UserDetails[i]);
                    break;
                case 5:
                    dob.setText(UserDetails[i]);
                    break;
                case 6:
                    age.setText(UserDetails[i]);
                    break;
                case 7:
                    addr.setText(UserDetails[i]);
                    break;
                case 8:
                    sex.setText(UserDetails[i]);
                    break;
                case 9:
                    phon.setText(UserDetails[i]);
                    break;
                case 10:
                    email.setText(UserDetails[i]);
                    break;
                default:
                        break;
            }
        }
    }
    
}
