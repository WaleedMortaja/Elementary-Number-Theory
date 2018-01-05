/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.usersInterfaces_and_Controllers;

import static Interfaces_and_Controllers.usersInterfaces_and_Controllers.LoginPageController.getUser_name;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import runningApplication.NumberTheoryApplication;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class StudentInterfaceController implements Initializable {

    @FXML
    private MenuButton user_name_menu;
    @FXML
    private MenuButton HelloUsername;
    private boolean named = false;

    @FXML
    private void start_exam(ActionEvent event) {

        List<String> choices = new ArrayList<>(10);
        choices.add("a");
        choices.add("b");
        choices.add("c");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
        dialog.setTitle("Choice Dialog");
        dialog.setHeaderText("Look, a Choice Dialog");
        dialog.setContentText("Choose your letter:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(letter -> System.out.println("Your choice: " + letter));
        if (true) // put conditions
        {
            NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
        }
    }

    @FXML
    private void sign_Out(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
    }

    @FXML
    private void user_name_named(MouseEvent event) {
        if (!named) {
            named = true;
            HelloUsername.setText(HelloUsername.getText() + getUser_name());
            user_name_menu.setText(getUser_name());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
