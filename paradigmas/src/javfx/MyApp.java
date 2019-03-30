package javfx;

import java.io.FileInputStream;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApp extends Application{
	String cont = "1";
	
	
	EventHandler<ActionEvent> handler1 = new EventHandler<ActionEvent>() {
		
	    @Override
	    public void handle(ActionEvent event) {
	        System.out.println("handler1...");
	     
	        
	        
	    }
	};
	EventHandler<ActionEvent> handler2 = (ActionEvent event) -> {
	    System.out.println("handler2...");
	};
	
	
	
	@Override
	public void start(Stage mainStage) throws Exception {
		
		FileInputStream entrada = new FileInputStream("C:/Users/julia/Downloads/imagenes/2.jpg");
		Image imagenes = new Image(entrada);
		ImageView image = new ImageView(imagenes);
		
		GridPane galeria = new GridPane();
		
		galeria.setAlignment(Pos.CENTER);
		
		Button boton13 = new Button("ANTERIOR");
		Button boton14 = new Button("SIGUIENTE");
		
		galeria.add(image, 2, 1);
		galeria.add(boton13, 2, 3);
		galeria.add(boton14, 3, 3);
		
		boton13.setOnAction(handler1);
		boton14.setOnAction(handler2);
		
		
		Scene esce = new Scene(galeria);
		Stage stag = new Stage();
		stag.setTitle("GALERIA");
		stag.setScene(esce);
		stag.show();
		
		/*
		//CREA BOTON
		Button boton1 = new Button("ACEPTAR");
		//CREA UNA ESCENA
		Scene escena1 = new Scene(boton1, 300,300);
		//ASIGNA UN TITULO AL STAGE
		mainStage.setTitle("MI PRIMER JAVAFX");
		//ASIGNA LA ESCENA AL STAGE
		mainStage.setScene(escena1);
		//MOSTRAR EL STAGE
		mainStage.show();

		Stage segundo = new Stage();
		segundo.setTitle("SEGUNDO STAGE");
		Button boton2 = new Button("CANCELAR");
		Scene escena2 = new Scene(boton2, 500, 500);
		segundo.setScene(escena2);
		segundo.setResizable(false);
		segundo.show();


		//HBOX
		//CREACION HBOX
		HBox hBox = new HBox();
		Button boton3 = new Button("SI");
		Button boton4 = new Button("NO");
		//ASIGNACION BOTONES A CHILDREN
		hBox.getChildren().addAll(boton3,boton4);
		//ESPACIO ENTRE BOTONES
		hBox.setSpacing(10);
		//CREACION NUEVA ESCENA Y STAGE
		Scene escena3 = new Scene(hBox,300,250);
		Stage stage3 = new Stage();
		stage3.setTitle("HBOX PUEBA");
		stage3.setScene(escena3);
		stage3.show();

		//VBOX
		//CREACION VBOX
		VBox vBox = new VBox();
		Button boton5 = new Button("ACEPTAR");
		Button boton6 = new Button("DENEGAR");
		//ASIGNACION BOTONES A CHILDREN
		vBox.getChildren().addAll(boton5,boton6);
		//ESPACIO ENTRE BOTONES
		vBox.setSpacing(20);
		//CREACION NUEVA ESCENA Y STAGE
		Scene escena4 = new Scene(vBox,300,250);
		Stage stage4 = new Stage();
		stage4.setTitle("VBOX PUEBA");
		stage4.setScene(escena4);
		stage4.show();


		//GRIDPANE
		//CREACION GRIDPANE
		GridPane grid = new GridPane();
		Button boton7 = new Button("ACEPTAR");
		Button boton8 = new Button("DENEGAR");
		//ASIGNACION BOTONES A GRIDPANE MAS UBICACION DE LOS BOTONES
		grid.add(boton7,0,0,1,1);
		grid.add(boton8, 2,1,1,1);
		//CREACION ESCENA Y STAGE
		Scene escena5 = new Scene(grid,300,250);
		Stage stage5 = new Stage();
		stage5.setTitle("GRIDPANE");
		stage5.setScene(escena5);
		stage5.show();

		//STACKPANE
		//CREACION STACKPANE
		StackPane stack = new StackPane();
		Button boton9 = new Button("    ACEPTAR    ");
		Button boton10 = new Button("DENEGAR");
		//ASIGNACION BOTONES A STACKPANE
		stack.getChildren().addAll(boton9,boton10);
		//CREACION ESCENA Y STAGE
		Scene escena6 = new Scene(stack,300,250);
		Stage stage6 = new Stage();
		stage6.setTitle("STACKPANE");
		stage6.setScene(escena6);
		stage6.show();

		//BORDERPANE
		//CREACION BORDERPANE
		BorderPane bp = new BorderPane();
		//CREACION BORDERPANE Y BOTONES
		bp.setTop(new Button("aja"));
		bp.setRight(new Button("derecha"));
		//CREACION DE ESCENA Y STAGE
		Scene escena7 = new Scene(bp,300,250);
		Stage stage7 = new Stage();
		stage7.setTitle("BORDERPANE");
		stage7.setScene(escena7);
		stage7.show();


		//IMAGEVIEW
		//CREACION LECTURA DE ARCHIVOS IMAGEN Y CREACION IMAGE Y IMAGEVIEW
		FileInputStream input = new FileInputStream("C:/Users/julia/Downloads/imagen.jpg");
		Image imagen = new Image(input);
		ImageView imageView = new ImageView(imagen);
		//CREACION BORDERPANE Y BOTONES
		BorderPane b = new BorderPane();
		b.setCenter(imageView);
		b.setLeft(new Button("ANTERIOR"));
		b.setRight(new Button("SIGUIENTE"));
		//CREACION DE ESCENA Y STAGE
		Scene escena8 = new Scene(b,300,250);
		Stage stage8 = new Stage();
		stage8.setTitle("IMAGEVIEW CON BORDERPANE");
		stage8.setScene(escena8);
		stage8.show();

		//EJEMPLO TODO
		GridPane gp = new GridPane();

		Text texto1 = new Text();
		Text texto2 = new Text();

		TextField campo1 = new TextField();
		TextField campo2 = new TextField();

		Button login = new Button("Log in");
		Button sign = new Button("Sign in");

		gp.setMinSize(400, 200);

		gp.setVgap(5); 
		gp.setHgap(5); 

		gp.setAlignment(Pos.CENTER);

		gp.add(texto1, 0, 0);
		gp.add(campo1, 1, 0);
		gp.add(texto2, 0, 1);
		gp.add(campo2, 1, 1);
		gp.add(login, 0, 2);
		gp.add(sign,1,2);

		texto1.setStyle("-fx-font: normal bold 20px 'serif' "); 
		texto2.setStyle("-fx-font: normal bold 20px 'serif' ");  
		gp.setStyle("-fx-background-color: BEIGE;");

		Scene esc = new Scene(gp);
		Stage sta = new Stage();
		sta.setTitle("INICIO SESION");
		sta.setScene(esc);
		sta.show();

		*/
		
		
		//GALERIA
		

		

	}



	public static void main(String[] args) {
		launch(args);
	}


}
