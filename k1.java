package com.av.av;import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class k1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dashboard Example");

        // Creating buttons
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Creating a table view
        TableView<Item> tableView = new TableView<>();
        TableColumn<Item, String> column1 = new TableColumn<>("Column 1");
        column1.setCellValueFactory(new PropertyValueFactory<>("column1"));
        TableColumn<Item, String> column2 = new TableColumn<>("Column 2");
        column2.setCellValueFactory(new PropertyValueFactory<>("column2"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        // Adding some dummy data to the table
        tableView.getItems().add(new Item("Data 1", "Data 2"));
        tableView.getItems().add(new Item("Data 3", "Data 4"));

        // Creating labels
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");

        // Setting up layout
        HBox buttonBox = new HBox(10, btn1, btn2, btn3);
        VBox layout = new VBox(10, label1, label2, buttonBox, tableView);

        // Setting the scene
        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Item class for table data
    public static class Item {
        private String column1;
        private String column2;

        public Item(String column1, String column2) {
            this.column1 = column1;
            this.column2 = column2;
        }

        public String getColumn1() {
            return column1;
        }

        public void setColumn1(String column1) {
            this.column1 = column1;
        }

        public String getColumn2() {
            return column2;
        }

        public void setColumn2(String column2) {
            this.column2 = column2;
        }
    }
}
