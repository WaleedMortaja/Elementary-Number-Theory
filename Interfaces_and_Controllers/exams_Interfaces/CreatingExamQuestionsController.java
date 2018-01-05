package Interfaces_and_Controllers.exams_Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import runningApplication.NumberTheoryApplication;

public class CreatingExamQuestionsController implements Initializable {

    private static int question_Number = 0;

    private static String[] questionsNames;

    /**
     * @return the question_Number
     */
    public static int getQuestion_Number() {
        return question_Number;
    }

    /**
     * @param aQuestion_Number the question_Number to set
     */
    public static void setQuestion_Number(int aQuestion_Number) {
        question_Number = aQuestion_Number;
    }

    /**
     * @return the questionsNames
     */
    public static String[] getQuestionsNames() {
        return questionsNames;
    }

    /**
     * @param aQuestionsNames the questionsNames to set
     */
    public static void setQuestionsNames(String[] aQuestionsNames) {
        questionsNames = aQuestionsNames;
    }

    @FXML
    private Label lbl_number_of_questions;
    @FXML
    private ToggleButton SC_TB;
    @FXML
    private ToggleButton phi_TB;
    @FXML
    private ToggleButton tau_TB;
    @FXML
    private ToggleButton sigma_TB;
    @FXML
    private ToggleButton NPR_TB;
    @FXML
    private ToggleButton FPR_TB;
    @FXML
    private ToggleButton CO_TB;
    @FXML
    private ToggleButton Mod_TB;
    @FXML
    private ToggleButton IC_TB;
    @FXML
    private ToggleButton SLC_TB;
    @FXML
    private ToggleButton CE_TB;
    @FXML
    private ToggleButton GCDAL_TB;
    @FXML
    private ToggleButton LCM_TB;
    @FXML
    private ToggleButton GCD_TB;
    @FXML
    private ToggleButton IP_TB;
    @FXML
    private ToggleButton IRP_TB;
    @FXML
    private ToggleButton SD_TB;
    @FXML
    private ToggleButton DA_TB;
    @FXML
    private ToggleButton AD_TB;
    @FXML
    private ToggleButton PD_TB;
    @FXML
    private ToggleButton PF_TB;

    @FXML
    private void back_to_create_exam(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getCreatingExamScene());
    }

    @FXML
    private void sign_Out(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
    }

    @FXML
    private void to_teacher_profile(ActionEvent event) {
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getTeacherInterfaceScene());
    }

    private void add_pressed_toggle(ToggleButton pressed) {
        if (Integer.parseInt(lbl_number_of_questions.getText()) > 0) {
            try {
                getQuestionsNames()[question_Number++] = pressed.getText();
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText(aiobe.getMessage());
                alert.showAndWait();
                pressed.setSelected(false);
            }
            lbl_number_of_questions.setText("" + (Integer.parseInt(lbl_number_of_questions.getText()) - 1));
        } else if (Integer.parseInt(lbl_number_of_questions.getText()) == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("You can't make questions more than " + getQuestionsNames().length);
            alert.showAndWait();
            pressed.setSelected(false);
        } else {
            NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getLoginPageScene());
        }
    }

    private void remove_unpressed_toggle(ToggleButton pressed) {
        if (Integer.parseInt(lbl_number_of_questions.getText()) >= getQuestionsNames().length) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error : number of questions you can choose is more than you could choose .");
            alert.showAndWait();
        } else if (Integer.parseInt(lbl_number_of_questions.getText()) < getQuestionsNames().length && Integer.parseInt(lbl_number_of_questions.getText()) >= 0) {
            for (int i = 0; i < getQuestionsNames().length; i++) {
                if (pressed.getText().equals(getQuestionsNames()[i])) {
                    getQuestionsNames()[i] = null;
                    setQuestion_Number(getQuestion_Number() - 1);
                    break;
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Error This question is not chosen .");
                    alert.showAndWait();
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error : number of questions you can choose is more than you could choose .");
            alert.showAndWait();
        }
    }

    @FXML
    private void pressed_toggle_btn_SC(ActionEvent event) {
        if (SC_TB.isSelected()) {
            add_pressed_toggle(SC_TB);
        } else {
            remove_unpressed_toggle(SC_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_phi(ActionEvent event) {
        if (phi_TB.isSelected()) {
            add_pressed_toggle(phi_TB);
        } else {
            remove_unpressed_toggle(phi_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_tau(ActionEvent event) {
        if (tau_TB.isSelected()) {
            add_pressed_toggle(tau_TB);
        } else {
            remove_unpressed_toggle(tau_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_sigma(ActionEvent event) {
        if (sigma_TB.isSelected()) {
            add_pressed_toggle(sigma_TB);
        } else {
            remove_unpressed_toggle(sigma_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_NPR(ActionEvent event) {
        if (NPR_TB.isSelected()) {
            add_pressed_toggle(NPR_TB);
        } else {
            remove_unpressed_toggle(NPR_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_FPR(ActionEvent event) {
        if (FPR_TB.isSelected()) {
            add_pressed_toggle(FPR_TB);
        } else {
            remove_unpressed_toggle(FPR_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_CO(ActionEvent event) {
        if (CO_TB.isSelected()) {
            add_pressed_toggle(CO_TB);
        } else {
            remove_unpressed_toggle(CO_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_Mod(ActionEvent event) {
        if (Mod_TB.isSelected()) {
            add_pressed_toggle(Mod_TB);
        } else {
            remove_unpressed_toggle(Mod_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_IC(ActionEvent event) {
        if (IC_TB.isSelected()) {
            add_pressed_toggle(IC_TB);
        } else {
            remove_unpressed_toggle(IC_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_SLC(ActionEvent event) {
        if (SLC_TB.isSelected()) {
            add_pressed_toggle(SLC_TB);
        } else {
            remove_unpressed_toggle(SLC_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_CE(ActionEvent event) {
        if (CE_TB.isSelected()) {
            add_pressed_toggle(CE_TB);
        } else {
            remove_unpressed_toggle(CE_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_GCDAL(ActionEvent event) {
        if (GCDAL_TB.isSelected()) {
            add_pressed_toggle(GCDAL_TB);
        } else {
            remove_unpressed_toggle(GCDAL_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_LCM(ActionEvent event) {
        if (LCM_TB.isSelected()) {
            add_pressed_toggle(LCM_TB);
        } else {
            remove_unpressed_toggle(LCM_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_GCD(ActionEvent event) {
        if (GCD_TB.isSelected()) {
            add_pressed_toggle(GCD_TB);
        } else {
            remove_unpressed_toggle(GCD_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_IP(ActionEvent event) {
        if (IP_TB.isSelected()) {
            add_pressed_toggle(IP_TB);
        } else {
            remove_unpressed_toggle(IP_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_IRP(ActionEvent event) {
        if (IRP_TB.isSelected()) {
            add_pressed_toggle(IRP_TB);
        } else {
            remove_unpressed_toggle(IRP_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_SD(ActionEvent event) {
        if (SD_TB.isSelected()) {
            add_pressed_toggle(SD_TB);
        } else {
            remove_unpressed_toggle(SD_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_DA(ActionEvent event) {
        if (DA_TB.isSelected()) {
            add_pressed_toggle(DA_TB);
        } else {
            remove_unpressed_toggle(DA_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_AD(ActionEvent event) {
        if (AD_TB.isSelected()) {
            add_pressed_toggle(AD_TB);
        } else {
            remove_unpressed_toggle(AD_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_PD(ActionEvent event) {
        if (PD_TB.isSelected()) {
            add_pressed_toggle(PD_TB);
        } else {
            remove_unpressed_toggle(PD_TB);
        }
    }

    @FXML
    private void pressed_toggle_btn_PF(ActionEvent event) {
        if (PF_TB.isSelected()) {
            add_pressed_toggle(PF_TB);
        } else {
            remove_unpressed_toggle(PF_TB);
        }
    }

    @FXML
    private void finish_and_back(ActionEvent event) {
        // do to data base
        NumberTheoryApplication.getStage().setScene(NumberTheoryApplication.getTeacherInterfaceScene());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
