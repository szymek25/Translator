package sample;

import com.example.cloud.translate.samples.TranslateText;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        TranslateText.translateTextWithOptions("hello","en","pl",System.out);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
