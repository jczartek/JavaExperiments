package binding;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.beans.binding.Bindings;

public class CenteredCircle extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        Group group = new Group(circle);
        Scene scene = new Scene(group, 100, 100);

        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));
        circle.radiusProperty().bind(Bindings.min(scene.widthProperty(),
                                                  scene.heightProperty()).divide(2));

        primaryStage.setTitle("Binding in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
