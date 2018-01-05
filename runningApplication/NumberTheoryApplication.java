package runningApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberTheoryApplication extends Application {

    private static Stage stage;

    private static Scene mainScene;
    private static Scene CaesarScene;
    private static Scene aboutScene;
    private static Scene allDivisorsScene;
    private static Scene primeDivisorsScene;
    private static Scene primeFactorizationScene;
    private static Scene gcdScene;
    private static Scene lcmScene;
    private static Scene GcdAsLinearCombinationScene;
    private static Scene SolveDiophantineScene;
    private static Scene DivisionAlgorithmScene;
    private static Scene IsPrimeScene;
    private static Scene IsRelativePrimeScene;
    private static Scene IsCongurentScene;
    private static Scene SolveLinearCongurentScene;
    private static Scene ModuloScene;
    private static Scene SolveChineseScene;
    private static Scene phiScene;
    private static Scene tauScene;
    private static Scene sigmaScene;
    private static Scene numOfPrimitiveRootsScene;
    private static Scene primitiveRootsScene;
    private static Scene orderScene;
    private static Scene firstInterfaceScene;
    private static Scene LoginPageScene;
    private static Scene TeacherInterfaceScene;
    private static Scene creatingExamScene;
    private static Scene CreatingExamQuestionsScene;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @return the stage
     */
    public static Stage getStage() {
        return stage;
    }

    /**
     * @param aStage the stage to set
     */
    public static void setStage(Stage aStage) {
        stage = aStage;
    }

    /**
     * @return the mainScene
     */
    public static Scene getMainScene() {
        return mainScene;
    }

    /**
     * @param aMainScene the mainScene to set
     */
    public static void setMainScene(Scene aMainScene) {
        mainScene = aMainScene;
    }

    /**
     * @return the CaesarScene
     */
    public static Scene getCaesarScene() {
        return CaesarScene;
    }

    /**
     * @param aCaesarScene the CaesarScene to set
     */
    public static void setCaesarScene(Scene aCaesarScene) {
        CaesarScene = aCaesarScene;
    }

    /**
     * @return the aboutScene
     */
    public static Scene getAboutScene() {
        return aboutScene;
    }

    /**
     * @param aAboutScene the aboutScene to set
     */
    public static void setAboutScene(Scene aAboutScene) {
        aboutScene = aAboutScene;
    }

    /**
     * @return the allDivisorsScene
     */
    public static Scene getAllDivisorsScene() {
        return allDivisorsScene;
    }

    /**
     * @param aAllDivisorsScene the allDivisorsScene to set
     */
    public static void setAllDivisorsScene(Scene aAllDivisorsScene) {
        allDivisorsScene = aAllDivisorsScene;
    }

    /**
     * @return the primeDivisorsScene
     */
    public static Scene getPrimeDivisorsScene() {
        return primeDivisorsScene;
    }

    /**
     * @param aPrimeDivisorsScene the primeDivisorsScene to set
     */
    public static void setPrimeDivisorsScene(Scene aPrimeDivisorsScene) {
        primeDivisorsScene = aPrimeDivisorsScene;
    }

    /**
     * @return the primeFactorizationScene
     */
    public static Scene getPrimeFactorizationScene() {
        return primeFactorizationScene;
    }

    /**
     * @param aPrimeFactorizationScene the primeFactorizationScene to set
     */
    public static void setPrimeFactorizationScene(Scene aPrimeFactorizationScene) {
        primeFactorizationScene = aPrimeFactorizationScene;
    }

    /**
     * @return the gcdScene
     */
    public static Scene getGcdScene() {
        return gcdScene;
    }

    /**
     * @param aGcdScene the gcdScene to set
     */
    public static void setGcdScene(Scene aGcdScene) {
        gcdScene = aGcdScene;
    }

    /**
     * @return the lcmScene
     */
    public static Scene getLcmScene() {
        return lcmScene;
    }

    /**
     * @param aLcmScene the lcmScene to set
     */
    public static void setLcmScene(Scene aLcmScene) {
        lcmScene = aLcmScene;
    }

    /**
     * @return the GcdAsLinearCombinationScene
     */
    public static Scene getGcdAsLinearCombinationScene() {
        return GcdAsLinearCombinationScene;
    }

    /**
     * @param aGcdAsLinearCombinationScene the GcdAsLinearCombinationScene to
     * set
     */
    public static void setGcdAsLinearCombinationScene(Scene aGcdAsLinearCombinationScene) {
        GcdAsLinearCombinationScene = aGcdAsLinearCombinationScene;
    }

    /**
     * @return the SolveDiophantineScene
     */
    public static Scene getSolveDiophantineScene() {
        return SolveDiophantineScene;
    }

    /**
     * @param aSolveDiophantineScene the SolveDiophantineScene to set
     */
    public static void setSolveDiophantineScene(Scene aSolveDiophantineScene) {
        SolveDiophantineScene = aSolveDiophantineScene;
    }

    /**
     * @return the DivisionAlgorithmScene
     */
    public static Scene getDivisionAlgorithmScene() {
        return DivisionAlgorithmScene;
    }

    /**
     * @param aDivisionAlgorithmScene the DivisionAlgorithmScene to set
     */
    public static void setDivisionAlgorithmScene(Scene aDivisionAlgorithmScene) {
        DivisionAlgorithmScene = aDivisionAlgorithmScene;
    }

    /**
     * @return the IsPrimeScene
     */
    public static Scene getIsPrimeScene() {
        return IsPrimeScene;
    }

    /**
     * @param aIsPrimeScene the IsPrimeScene to set
     */
    public static void setIsPrimeScene(Scene aIsPrimeScene) {
        IsPrimeScene = aIsPrimeScene;
    }

    /**
     * @return the IsRelativePrimeScene
     */
    public static Scene getIsRelativePrimeScene() {
        return IsRelativePrimeScene;
    }

    /**
     * @param aIsRelativePrimeScene the IsRelativePrimeScene to set
     */
    public static void setIsRelativePrimeScene(Scene aIsRelativePrimeScene) {
        IsRelativePrimeScene = aIsRelativePrimeScene;
    }

    /**
     * @return the IsCongurentScene
     */
    public static Scene getIsCongurentScene() {
        return IsCongurentScene;
    }

    /**
     * @param aIsCongurentScene the IsCongurentScene to set
     */
    public static void setIsCongurentScene(Scene aIsCongurentScene) {
        IsCongurentScene = aIsCongurentScene;
    }

    /**
     * @return the SolveLinearCongurentScene
     */
    public static Scene getSolveLinearCongurentScene() {
        return SolveLinearCongurentScene;
    }

    /**
     * @param aSolveLinearCongurentScene the SolveLinearCongurentScene to set
     */
    public static void setSolveLinearCongurentScene(Scene aSolveLinearCongurentScene) {
        SolveLinearCongurentScene = aSolveLinearCongurentScene;
    }

    /**
     * @return the ModuloScene
     */
    public static Scene getModuloScene() {
        return ModuloScene;
    }

    /**
     * @param aModuloScene the ModuloScene to set
     */
    public static void setModuloScene(Scene aModuloScene) {
        ModuloScene = aModuloScene;
    }

    /**
     * @return the SolveChineseScene
     */
    public static Scene getSolveChineseScene() {
        return SolveChineseScene;
    }

    /**
     * @param aSolveChineseScene the SolveChineseScene to set
     */
    public static void setSolveChineseScene(Scene aSolveChineseScene) {
        SolveChineseScene = aSolveChineseScene;
    }

    /**
     * @return the phiScene
     */
    public static Scene getPhiScene() {
        return phiScene;
    }

    /**
     * @param aGetPhiScene the phiScene to set
     */
    public static void setPhiScene(Scene aGetPhiScene) {
        phiScene = aGetPhiScene;
    }

    /**
     * @return the tauScene
     */
    public static Scene getTauScene() {
        return tauScene;
    }

    /**
     * @param aGetTauScene the tauScene to set
     */
    public static void setTauScene(Scene aGetTauScene) {
        tauScene = aGetTauScene;
    }

    /**
     * @return the numOfPrimitiveRootsScene
     */
    public static Scene getNumOfPrimitiveRootsScene() {
        return numOfPrimitiveRootsScene;
    }

    /**
     * @param aNumOfPrimitiveRootsScene the numOfPrimitiveRootsScene to set
     */
    public static void setNumOfPrimitiveRootsScene(Scene aNumOfPrimitiveRootsScene) {
        numOfPrimitiveRootsScene = aNumOfPrimitiveRootsScene;
    }

    /**
     * @return the primitiveRootsScene
     */
    public static Scene getPrimitiveRootsScene() {
        return primitiveRootsScene;
    }

    /**
     * @param aPrimitiveRootsScene the primitiveRootsScene to set
     */
    public static void setPrimitiveRootsScene(Scene aPrimitiveRootsScene) {
        primitiveRootsScene = aPrimitiveRootsScene;
    }

    /**
     * @return the orderScene
     */
    public static Scene getOrderScene() {
        return orderScene;
    }

    /**
     * @param aOrderScene the orderScene to set
     */
    public static void setOrderScene(Scene aOrderScene) {
        orderScene = aOrderScene;
    }

    /**
     * @return the firstInterfaceScene
     */
    public static Scene getFirstInterfaceScene() {
        return firstInterfaceScene;
    }

    /**
     * @param aFirstInterfaceScene the firstInterfaceScene to set
     */
    public static void setFirstInterfaceScene(Scene aFirstInterfaceScene) {
        firstInterfaceScene = aFirstInterfaceScene;
    }

    /**
     * @return the LoginPageScene
     */
    public static Scene getLoginPageScene() {
        return LoginPageScene;
    }

    /**
     * @param aLoginPageScene the LoginPageScene to set
     */
    public static void setLoginPageScene(Scene aLoginPageScene) {
        LoginPageScene = aLoginPageScene;
    }

    /**
     * @return the TeacherInterfaceScene
     */
    public static Scene getTeacherInterfaceScene() {
        return TeacherInterfaceScene;
    }

    /**
     * @param aTeacherInterfaceScene the TeacherInterfaceScene to set
     */
    public static void setTeacherInterfaceScene(Scene aTeacherInterfaceScene) {
        TeacherInterfaceScene = aTeacherInterfaceScene;
    }

    /**
     * @return the creatingExamScene
     */
    public static Scene getCreatingExamScene() {
        return creatingExamScene;
    }

    /**
     * @param aCreatingExamScene the creatingExamScene to set
     */
    public static void setCreatingExamScene(Scene aCreatingExamScene) {
        creatingExamScene = aCreatingExamScene;
    }

    /**
     * @return the CreatingExamQuestionsScene
     */
    public static Scene getCreatingExamQuestionsScene() {
        return CreatingExamQuestionsScene;
    }

    /**
     * @param aCreatingExamQuestionsScene the CreatingExamQuestionsScene to set
     */
    public static void setCreatingExamQuestionsScene(Scene aCreatingExamQuestionsScene) {
        CreatingExamQuestionsScene = aCreatingExamQuestionsScene;
    }

    /**
     * @return the sigmaScene
     */
    public static Scene getSigmaScene() {
        return sigmaScene;
    }

    /**
     * @param aGetSigmaScene the sigmaScene to set
     */
    public static void setSigmaScene(Scene aGetSigmaScene) {
        sigmaScene = aGetSigmaScene;
    }

    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Those Fxml's for Login & first Scene Interface
         */
        Parent firstInterfaceParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/usersInterfaces_and_Controllers/FirstInterface.fxml"));
        Parent LoginPageParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/usersInterfaces_and_Controllers/LoginPage.fxml"));
        Parent TeacherInterfaceParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/usersInterfaces_and_Controllers/TeacherInterface.fxml"));
        setFirstInterfaceScene(new Scene(firstInterfaceParent, 300, 160));
        setLoginPageScene(new Scene(LoginPageParent, 340, 250));
        setTeacherInterfaceScene(new Scene(TeacherInterfaceParent, 500, 370));

        /**
         * Those Fxml's for Exam Scene Interface
         */
        Parent creatingExamParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/exams_Interfaces/creatingExam.fxml"));
        setCreatingExamScene(new Scene(creatingExamParent, 330, 300));
//        Parent CreatingExamQuestionsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/exams_Interfaces/creatingExamQuestions.fxml"));
//        CreatingExamQuestionsScene = new Scene(CreatingExamQuestionsParent, 540, 390);

        /**
         * Those Fxml's is the main interface
         */
        Parent Main_Parent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/NumTheoryFXML.fxml"));
        Parent aboutrootParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/AboutFXML.fxml"));
        setAboutScene(new Scene(aboutrootParent, 520, 330));
        setMainScene(new Scene(Main_Parent, 540, 390));

        /**
         * Those Fxml's is the Divisors interface
         */
        Parent allDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/AllDivisors.fxml"));
        Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        Parent primeFactorizationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeFactorization.fxml"));
        setAllDivisorsScene(new Scene(allDivisorsParent, 530, 300));
        setPrimeDivisorsScene(new Scene(primeDivisorsParent, 535, 330));
        setPrimeFactorizationScene(new Scene(primeFactorizationParent, 640, 320));

        /**
         * Those Fxml's is the GCD interface
         */
        Parent GcdParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/Gcd.fxml"));
        Parent LCMParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/LCM.fxml"));
        Parent GcdAsLinearCombinationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/GcdAsLinearCombination.fxml"));
        setGcdScene(new Scene(GcdParent, 570, 270));
        setLcmScene(new Scene(LCMParent, 570, 260));
        setGcdAsLinearCombinationScene(new Scene(GcdAsLinearCombinationParent, 660, 245));

        /**
         * Those Fxml's is the primes interface
         */
        Parent IsPrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsPrime.fxml"));
        Parent IsRelativePrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsRelativePrime.fxml"));
        setIsPrimeScene(new Scene(IsPrimeParent, 530, 240));
        setIsRelativePrimeScene(new Scene(IsRelativePrimeParent, 600, 230));
// done before in the same method
//Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        /**
         * Those Fxml's is the diophantine interface
         */
        Parent SolveDiophantineParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/SolveDiophantine.fxml"));
        Parent DivisionAlgorithmParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/DivisionAlgorithm.fxml"));
        setSolveDiophantineScene(new Scene(SolveDiophantineParent, 570, 280));
        setDivisionAlgorithmScene(new Scene(DivisionAlgorithmParent, 680, 280));

        /**
         * Those Fxml's is the modulo interface
         */
        Parent IsCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/IsCongurent.fxml"));
        Parent SolveLinearCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/SolveLinearCongurent.fxml"));
        Parent ModuloParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/Modulo.fxml"));
        setIsCongurentScene(new Scene(IsCongurentParent, 650, 240));
        setSolveLinearCongurentScene(new Scene(SolveLinearCongurentParent, 560, 250));
        setModuloScene(new Scene(ModuloParent, 540, 220));

        /**
         * Those Fxml's is the encryption interface
         */
        Parent CaesarParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/encryption/Caesar.fxml"));
        setCaesarScene(new Scene(CaesarParent, 630, 360));

        /**
         * Those Fxml's is the chinese interface
         */
        Parent SolveChineseParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/chinese/SolveChinese.fxml"));
        setSolveChineseScene(new Scene(SolveChineseParent, 550, 370));

        /**
         * Those Fxml's is the τ_σ_𝜙 interface
         */
        Parent GetPhiParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetPhi.fxml"));
        Parent GetTauParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetTau.fxml"));
        Parent GetSigmaParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/tau_sigma_phi/GetSigma.fxml"));
        setPhiScene(new Scene(GetPhiParent, 480, 210));
        setTauScene(new Scene(GetTauParent, 480, 210));
        setSigmaScene(new Scene(GetSigmaParent, 470, 220));

        /**
         * Those Fxml's is the primitiveRoots interface
         */
        Parent numOfPrimitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/NumOfPrimitiveRoots.fxml"));
        Parent primitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/primitiveRoots.fxml"));
        Parent orderParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/order.fxml"));
        setNumOfPrimitiveRootsScene(new Scene(numOfPrimitiveRootsParent, 520, 220));
        setPrimitiveRootsScene(new Scene(primitiveRootsParent, 560, 290));
        setOrderScene(new Scene(orderParent, 470, 220));

        /**
         * Now just lunch first Page
         */
        File No_used_first_interface = new File("src\\data_Files\\No.used_first_interface");
        if (No_used_first_interface.canRead()) {
            if (Files.lines(No_used_first_interface.toPath()).count() == 0) {
                stage.setScene(getMainScene());
            } else {
                stage.setScene(getLoginPageScene());
            }
        } else {
            stage.setScene(getFirstInterfaceScene());
        }
        stage.show();
        stage.setResizable(false);
        NumberTheoryApplication.setStage(stage);
    }

}
