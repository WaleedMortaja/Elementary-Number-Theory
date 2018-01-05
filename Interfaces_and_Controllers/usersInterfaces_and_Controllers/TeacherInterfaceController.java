package Interfaces_and_Controllers.usersInterfaces_and_Controllers;

import static Interfaces_and_Controllers.usersInterfaces_and_Controllers.LoginPageController.getUser_name;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javax.swing.table.TableColumn;
import runningApplication.NumberTheoryApplication;

public class TeacherInterfaceController implements Initializable {

    @FXML
    private Label Hello_Mr_username;
    @FXML
    private MenuButton user_name_menu;
    private boolean named = false;
    @FXML
    private TableView<TableRow<TableColumn>> exams_Table;

    @FXML
    private void sign_Out(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
    }

    @FXML
    private void add_Exam(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getCreatingExamScene());
    }

    @FXML
    private void remove_Exam(ActionEvent event) {
        List<String> choices = new ArrayList<>(5);
        for (int i = 0; i < exams_Table.getColumns().size(); i++) {
            choices.add(i, exams_Table.getColumns().get(i).toString());
        }

        ChoiceDialog<String> dialog = new ChoiceDialog<>("none", choices);
        dialog.setTitle("Deleting Exam");
        dialog.setHeaderText("You are deleting exam !");
        dialog.setContentText("Choose Exam to delete : ");
    }

    @FXML
    private void user_name_named(MouseEvent event) {
        if (!named) {
            named = true;
            Hello_Mr_username.setText(Hello_Mr_username.getText() + getUser_name());
            user_name_menu.setText(getUser_name());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
