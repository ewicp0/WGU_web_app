package electronicsstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/electronicsstore/views/MainScreen.fxml"));
        Scene scene = new Scene(root, 600, 400);

        // CSS file
        scene.getStylesheets().add(getClass().getResource("/electronicsstore/resources/styles.css").toExternalForm());

        primaryStage.setTitle("Electronics Store");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
