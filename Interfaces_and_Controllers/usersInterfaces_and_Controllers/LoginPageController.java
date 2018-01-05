package Interfaces_and_Controllers.usersInterfaces_and_Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import runningApplication.NumberTheoryApplication;

public class LoginPageController implements Initializable {

    private static String user_name;

    /**
     * @return the user_name
     */
    public static String getUser_name() {
        return user_name;
    }

    /**
     * @param aUser_name the user_name to set
     */
    public static void setUser_name(String aUser_name) {
        user_name = aUser_name;
    }
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    private void Login(ActionEvent event) throws FileNotFoundException {
        String user = username.getText();
        String pass = password.getText();
        boolean found = false;
        File file = new File("src\\data_Files\\All_Data.mydata");

        try (Scanner in = new Scanner(file)) {
            in.useDelimiter("::");
            while (in.hasNext()) {
                String user_check = in.next();
                String pass_check = in.next();

                if (user.equals(user_check)) {
                    if (pass.equals(pass_check)) {
                        found = true;
                        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getTeacherInterfaceScene());
                    }
                }
            }
        }
        if (!found) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("The username or password you've entered is incorrect");
            alert.showAndWait();
        } else {
            setUser_name(user);
        }

    }

    @FXML
    private void handlebacktomain(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getMainScene());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
