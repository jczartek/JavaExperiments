package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXLifeCycleApp extends Application {

    public static void main(String[] args) {
        Application.launch(FXLifeCycleApp.class, args);
    }

    public FXLifeCycleApp() {
        String name = Thread.currentThread().getName();
        System.out.println("FXLifeCycleApp() constructor: " + name);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("start() method: " + name);

        Scene scene = new Scene(new Group(), 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle(this.getClass().getName());
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("init() method: " + name);
    }

    @Override
    public void stop() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("stop() method: " + name);
    }
}
