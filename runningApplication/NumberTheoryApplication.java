package runningApplication;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NumberTheoryApplication extends Application {
    
    public static Scene mainScene;
    public static Scene CaesarScene;
    public static Scene aboutScene;
    public static Stage stage;
    public static Scene allDivisorsScene;
    public static Scene primeDivisorsScene;
    public static Scene primeFactorizationScene;
    public static Scene gcdScene;
    public static Scene lcmScene;
    public static Scene GcdAsLinearCombinationScene;
    public static Scene SolveDiophantineScene;
    public static Scene DivisionAlgorithmScene;
    public static Scene IsPrimeScene;
    public static Scene IsRelativePrimeScene;
    public static Scene IsCongurentScene;
    public static Scene SolveLinearCongurentScene;
    public static Scene ModuloScene;
    public static Scene SolveChineseScene;
    public static Scene GetPhiScene;
    public static Scene GetTauScene;
    public static Scene GetSigmaScene;
    public static Scene numOfPrimitiveRootsScene;
    public static Scene primitiveRootsScene;
    public static Scene orderScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        /**
         * Those Fxml's is the main interface
         */
        Parent Main_Parent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/NumTheoryFXML.fxml"));
        Parent aboutrootParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/main_Interfaces/AboutFXML.fxml"));
        aboutScene = new Scene(aboutrootParent, 520, 330);
        mainScene = new Scene(Main_Parent, 540, 390);

        /**
         * Those Fxml's is the Divisors interface
         */
        Parent allDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/AllDivisors.fxml"));
        Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        Parent primeFactorizationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeFactorization.fxml"));
        allDivisorsScene = new Scene(allDivisorsParent, 530, 300);
        primeDivisorsScene = new Scene(primeDivisorsParent, 535, 330);
        primeFactorizationScene = new Scene(primeFactorizationParent, 640, 320);

        /**
         * Those Fxml's is the GCD interface
         */
        Parent GcdParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/Gcd.fxml"));
        Parent LCMParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/LCM.fxml"));
        Parent GcdAsLinearCombinationParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/GCD/GcdAsLinearCombination.fxml"));
        gcdScene = new Scene(GcdParent, 570, 270);
        lcmScene = new Scene(LCMParent, 570, 260);
        GcdAsLinearCombinationScene = new Scene(GcdAsLinearCombinationParent, 660, 245);

        /**
         * Those Fxml's is the primes interface
         */
        Parent IsPrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsPrime.fxml"));
        Parent IsRelativePrimeParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primes/IsRelativePrime.fxml"));
        IsPrimeScene = new Scene(IsPrimeParent, 530, 240);
        IsRelativePrimeScene = new Scene(IsRelativePrimeParent, 600, 230);
        // done before in the same method
        //Parent primeDivisorsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/divisors/PrimeDivisors.fxml"));
        /**
         * Those Fxml's is the diophantine interface
         */
        Parent SolveDiophantineParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/SolveDiophantine.fxml"));
        Parent DivisionAlgorithmParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/diophantine/DivisionAlgorithm.fxml"));
        SolveDiophantineScene = new Scene(SolveDiophantineParent, 570, 280);
        DivisionAlgorithmScene = new Scene(DivisionAlgorithmParent, 680, 280);

        /**
         * Those Fxml's is the modulo interface
         */
        Parent IsCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/IsCongurent.fxml"));
        Parent SolveLinearCongurentParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/SolveLinearCongurent.fxml"));
        Parent ModuloParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/modulo/Modulo.fxml"));
        IsCongurentScene = new Scene(IsCongurentParent, 650, 240);
        SolveLinearCongurentScene = new Scene(SolveLinearCongurentParent, 560, 250);
        ModuloScene = new Scene(ModuloParent, 540, 220);

        /**
         * Those Fxml's is the encryption interface
         */
        Parent CaesarParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/encryption/Caesar.fxml"));
        CaesarScene = new Scene(CaesarParent, 630, 360);
        
        /**
         * Those Fxml's is the chinese interface
         */
        Parent SolveChineseParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/chinese/SolveChinese.fxml"));
        SolveChineseScene = new Scene(SolveChineseParent, 550, 370);
        
        /**
         * Those Fxml's is the τ_σ_𝜙 interface
         */
        Parent GetPhiParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/τ_σ/GetPhi.fxml"));
        Parent GetTauParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/τ_σ/GetTau.fxml"));
        Parent GetSigmaParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/τ_σ/GetSigma.fxml"));
        GetPhiScene = new Scene(GetPhiParent, 480, 210);
        GetTauScene = new Scene(GetTauParent, 480, 210);
        GetSigmaScene = new Scene(GetSigmaParent, 470, 220);
        
        /**
         * Those Fxml's is the primitiveRoots interface
         */
        Parent numOfPrimitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/NumOfPrimitiveRoots.fxml"));
        Parent primitiveRootsParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/primitiveRoots.fxml"));
        Parent orderParent = FXMLLoader.load(getClass().getResource("/Interfaces_and_Controllers/primitiveRoots/order.fxml"));
        numOfPrimitiveRootsScene = new Scene(numOfPrimitiveRootsParent, 520, 220);
        primitiveRootsScene = new Scene(primitiveRootsParent, 560, 290);
        orderScene = new Scene(orderParent, 470, 220);
        
        stage.setScene(mainScene);
        stage.show();

        stage.setResizable(false);
        NumberTheoryApplication.stage = stage;
    }

}
