package com.hotel.hotelmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);

            stage.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" --module-path C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib --add-modules javafx.controls,javafx.fxml "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\lib\idea_rt.jar=13772:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx-swt.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.web.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.base.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.fxml.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.media.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.swing.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.controls.jar;C:\JavaLib\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib\javafx.graphics.jar;C:\JavaLib\itextpdf-5.3.4.jar jdk.jpackage.main.Main
        Usage: jpackage <options>
        Use jpackage --help (or -h) for a list of possible options

        Process finished with exit code 0
    }


    public static void main(String[] args) {
        launch();
    }
}