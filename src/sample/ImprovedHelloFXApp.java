package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImprovedHelloFXApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLbl = new Label("Enter your name: ");
        TextField nameFld = new TextField();

        Label msg = new Label();
        msg.setStyle("-fx-text-fill: blue;");

        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");

        exitBtn.setOnAction(e -> Platform.exit());
        sayHelloBtn.setOnAction(e -> {
            String name = nameFld.getText();

            if (name.trim().length() > 0) {
                msg.setText("Hello " + name);
            } else {
                msg.setText("Hello There!");
            }
        });

        VBox root = new VBox();
        root.setSpacing(5);

        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);

        Scene scene = new Scene(root, 350, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Improved Hello JavaFX Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
