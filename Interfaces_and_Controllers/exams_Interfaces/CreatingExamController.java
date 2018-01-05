package Interfaces_and_Controllers.exams_Interfaces;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import runningApplication.NumberTheoryApplication;

/**
 * FXML Controller class
 *
 * @author khalil2535
 */
public class CreatingExamController implements Initializable {

    /**
     * this method create array of strings for (number of questions)
     *
     * @param aNumber_of_questions
     */
    private static void setNumber_of_questions(int aNumber_of_questions) {
        if (aNumber_of_questions > 0 && aNumber_of_questions < 21) {
            CreatingExamQuestionsController.setQuestionsNames(new String[aNumber_of_questions]);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Question number must be between 1 and 20 ");
            alert.showAndWait();
        }
    }
    @FXML
    private TextField txt_number_of_questions;
    @FXML
    private Slider dificulty;
    @FXML
    private DatePicker times;
    @FXML
    private TextField e_name;

    @FXML
    private void sign_Out(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
    }

    @FXML
    private void to_teacher_profile(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getTeacherInterfaceScene());
    }

    @FXML
    private void save_all(ActionEvent event) {
        LocalDate date = times.getValue();
        Calendar cal_date = Calendar.getInstance();
        cal_date.setTime(Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));

        setNumber_of_questions(Integer.parseInt(txt_number_of_questions.getText()));
        String exam_name = e_name.getText();

        //// save every thing here
        int difficulty = dificulty.getMinorTickCount();

        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getCreatingExamQuestionsScene());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
