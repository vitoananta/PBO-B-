import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TesJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
	Button btnQuit = new Button();
        btnQuit.setText("Quit");
        btnQuit.setLayoutX(460);
        btnQuit.setLayoutY(225);
        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        
        Button btn1 = new Button();
        btn1.setText("Dosen Pengajar");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Agus Budi Raharjo");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Ruang");  
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("TIF 105 B");
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Waktu");  
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Selasa, 15:30-17:20");
            }
        });
        
        Group root = new Group();
        root.getChildren().add(btnQuit);
        
        TilePane root2 = new TilePane();
        root2.getChildren().add(btn1);
        root2.getChildren().add(btn2);
        root2.getChildren().add(btn3);
        
        root2.setLayoutX(100);
        root2.setLayoutY(100);
        root.getChildren().add(root2);
        
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Pemrograman Berorientasi Objek (B)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
