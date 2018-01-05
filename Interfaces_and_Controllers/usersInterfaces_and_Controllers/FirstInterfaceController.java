/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.usersInterfaces_and_Controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import runningApplication.NumberTheoryApplication;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FirstInterfaceController implements Initializable {

    public static boolean used_first_interface = true;

    @FXML
    private void handleGotomain(ActionEvent event) throws FileNotFoundException, UnsupportedEncodingException {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
        if (!used_first_interface) {
            File file = new File("src\\data_Files\\No.used_first_interface");
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.close();
        }
    }

    @FXML
    private void toLoginPage(ActionEvent event) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
        if (!used_first_interface) {
            File file = new File("src\\data_Files\\No.used_first_interface");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.append("Line 1");
                writer.newLine();
                writer.append("Line 2");
                writer.newLine();
                writer.close();
            }
        }
    }

    @FXML
    private void abc(ActionEvent event) {
        used_first_interface = false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
