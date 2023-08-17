//package com.example.casestudyoop3;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class ServerApplication extends Application {
//
//    public static void main(String[] args) throws IOException {
//        launch(args);
//        }
//
//
//    @Override
//    public void start(Stage primaryStage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(ServerApplication.class.getResource("server.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Chat Online");
//        primaryStage.show();
//    }
//}
