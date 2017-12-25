/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_and_Controllers.main_Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import runningApplication.NumberTheoryApplication;

public class NumTheoryFXMLController implements Initializable {

    @FXML
    private TitledPane tp_Divisors;
    @FXML
    private TitledPane tp_GCD;
    @FXML
    private TitledPane tp_Primes;
    @FXML
    private TitledPane tp_Dioph;
    @FXML
    private TitledPane tp_Mod;
    @FXML
    private TitledPane tp_Encrypt;
    @FXML
    private TitledPane tp_Chinese;
    @FXML
    private TitledPane tp_τ_σ_𝜙;
    @FXML
    private TitledPane tp_PrimitiveR;
    @FXML
    private Label label;
    @FXML
    private Button AllDivisorsbtn;

    @FXML
    private void handleAboutAction(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.aboutScene);
    }

    @FXML
    private void openAllDivisors(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.allDivisorsScene);
    }

    @FXML
    private void openPrimeDivisors(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.primeDivisorsScene);
    }

    @FXML
    private void openPrimeFactorizations(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.primeFactorizationScene);
    }

    @FXML
    private void openGcd(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.gcdScene);
    }

    @FXML
    private void openLcm(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.lcmScene);
    }

    @FXML
    private void openGcdAsLinearCombination(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.GcdAsLinearCombinationScene);
    }

    @FXML
    private void openSolveDiophantine(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.SolveDiophantineScene);
    }

    @FXML
    private void openDivisionAlgorithm(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.DivisionAlgorithmScene);
    }

    @FXML
    private void openIsPrime(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.IsPrimeScene);
    }

    @FXML
    private void openIsRelativePrime(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.IsRelativePrimeScene);
    }

    @FXML
    private void openIsCongurent(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.IsCongurentScene);
    }

    @FXML
    private void openSolveLinearCongurent(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.SolveLinearCongurentScene);
    }

    @FXML
    private void openModulo(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.ModuloScene);
    }

    @FXML
    private void openSolveChinese(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.SolveChineseScene);
    }

    @FXML
    private void openGetPhi(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.GetPhiScene);
    }

    @FXML
    private void openGetTau(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.GetTauScene);
    }

    @FXML
    private void openGetSigma(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.GetSigmaScene);
    }

    @FXML
    private void openNumOfPrimitiveRoots(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.numOfPrimitiveRootsScene);
    }

    @FXML
    private void openPrimitiveroots(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.primitiveRootsScene);
    }

    @FXML
    private void Computetheorder(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.orderScene);
    }

    @FXML
    private void openCaesar(ActionEvent event) {
        NumberTheoryApplication.stage.setScene(NumberTheoryApplication.CaesarScene);
    }

    @FXML
    private void do_Animation(ActionEvent event) {
        System.out.println("here");
//        boolean isAnimated = tp_PrimitiveR.isExpanded() && tp_τ_σ_𝜙.isExpanded() && tp_Chinese.isExpanded() && tp_Encrypt.isExpanded() && tp_Mod.isExpanded() && tp_Dioph.isExpanded() && tp_Divisors.isExpanded() && tp_GCD.isExpanded() && tp_Primes.isExpanded();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
