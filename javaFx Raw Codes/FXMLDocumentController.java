package javafxtest08;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class FXMLDocumentController implements Initializable {
    
    //useless
    ExistingUserController existingUserController = new ExistingUserController();
            
    @FXML
    private Label accountOFID;
    @FXML
    private Label accounceOFName;
    @FXML
    private BorderPane mainScene;
    @FXML
    private Button registrationPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Parent existing;
        try {
            existing = FXMLLoader.load(getClass().getResource("existingUser.fxml"));
            mainScene.setCenter(existing);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void depositPane(ActionEvent event) throws IOException {
        if (existingUserController.userIdTakenOrNot()) {
            Parent deposit = FXMLLoader.load(getClass().getResource("Deposit.fxml"));
            mainScene.setCenter(deposit);
        }
    }

    @FXML
    private void withdrawPane(ActionEvent event) throws IOException {
        if (existingUserController.userIdTakenOrNot()) {
            Parent withdrawPane = FXMLLoader.load(getClass().getResource("withdraw.fxml"));
            mainScene.setCenter(withdrawPane);
        }
    }

    @FXML
    private void transferPane(ActionEvent event) throws IOException {
        if (existingUserController.userIdTakenOrNot()) {
            Parent transfer = FXMLLoader.load(getClass().getResource("transferPane.fxml"));
            mainScene.setCenter(transfer);
        }
    }

    @FXML
    private void userDetailsPane(ActionEvent event) throws IOException {
        if (existingUserController.userIdTakenOrNot()) {
            Parent userDetails = FXMLLoader.load(getClass().getResource("userDetails.fxml"));
            mainScene.setCenter(userDetails);
        }
    }

    @FXML
    private void aboutPane(ActionEvent event) {
    }

    @FXML
    private void accountofficerPane(ActionEvent event) {
    }

    @FXML
    private void registrationPane(ActionEvent event) throws IOException {
        Parent registration = FXMLLoader.load(getClass().getResource("registrationPane.fxml"));
        mainScene.setCenter(registration);
    }

    @FXML
    private void existingUser(ActionEvent event) throws IOException {
        Parent existingBtn = FXMLLoader.load(getClass().getResource("existingUser.fxml"));
        mainScene.setCenter(existingBtn);
    }

    @FXML
    private void NewUser(ActionEvent event) throws IOException {
        if (existingUserController.userIdTakenOrNot()) {
            Parent existingClear = FXMLLoader.load(getClass().getResource("existingUser.fxml"));
            mainScene.setCenter(existingClear);
        }
    }
}
