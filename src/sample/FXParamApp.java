package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.List;
import java.util.Map;

public class FXParamApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parameters p = this.getParameters();
        Map<String, String> namedParams = p.getNamed();
        List<String> unnamedParams = p.getUnnamed();
        List<String> rawParams = p.getRaw();

        String paramStr = "Named Params: " + namedParams + "\n" +
                          "Unnamed Params: " + unnamedParams + "\n" +
                          "Raw Params: " + rawParams + "\n";

        TextArea ta = new TextArea(paramStr);
        Group g = new Group(ta);
        Scene scene = new Scene(g);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application Params");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
