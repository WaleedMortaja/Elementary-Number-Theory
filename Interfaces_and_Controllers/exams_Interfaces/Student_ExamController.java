package Interfaces_and_Controllers.exams_Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Pagination;

public class Student_ExamController implements Initializable {

    @FXML
    private Pagination questions;
// questions.setPageCount(0);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questions.currentPageIndexProperty().addListener((Observable observable) -> {
            change_to_other_page();
        });
    }

    private void change_to_other_page() {
    }
}
