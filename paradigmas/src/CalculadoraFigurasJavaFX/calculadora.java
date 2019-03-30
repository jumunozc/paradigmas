package CalculadoraFigurasJavaFX;



import java.io.IOException;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class calculadora extends Application {
	
	

	@Override
	public void start(Stage arg0) throws Exception {
		DecimalFormat formateador = new DecimalFormat("####.##");
		//CREACION GRIDPANE
		GridPane gp = new GridPane();
		//CREACION ANCHORPANE
		AnchorPane ac = new AnchorPane();
		//CREACION TEXTOS 
		Text texto1 = new Text(" LADO: ");
		Text texto2 = new Text(" RADIO: ");
		Text texto3 = new Text(" ALTO: ");
		Text texto4 = new Text(" ANCHO: ");
		Text texto5 = new Text(" COLOR: ");
		Text texto6 = new Text(" NOMBRE: ");
		Text texto7 = new Text(" AREA: ");
		Text texto8 = new Text(" PERIMETRO: ");
		Text texto9 = new Text(" NOMBRE: ");
		//CREACION CAMPOS DE TEXTO
		TextField campo1 = new TextField();
		TextField campo2 = new TextField();
		TextField campo3 = new TextField();
		TextField campo4 = new TextField();
		TextField campo6 = new TextField();
		
		Label campo5 = new Label();
		Label campo7 = new Label();
		Label campo8 = new Label();
		//CREACION BOTONES
		Button rect = new Button("CREAR RECTANGULO");
		Button rectVer = new Button("VER RECTANGULO");
		Button cuad = new Button("CREAR CUADRADO");
		Button cuadVer = new Button("VER CUADRADO");
		Button circ = new Button("CREAR CIRCULO");
		Button circVer = new Button("VER CIRCULO");
		Button anterior = new Button("ANTERIOR");
		Button siguiente = new Button("SIGUIENTE");
		
		//CREACION LISTA DEL COMBO BOX
		ObservableList<String> items = FXCollections.observableArrayList();
		items.addAll("ROJO", "AMARILLO", "NEGRO", "AZUL", "BLANCO");
		ComboBox<String> cbx = new ComboBox<>(items);
		//CREACION GRUPO Y CANVAS PARA DIBUJAR FIGURAS
		Group root = new Group();
		Canvas canvas = new Canvas(390, 130);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        //AJUSTE TAMAÑO DEL CONTENIDO GRAFICO DEL CANVAS
		gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		/*gc.setStroke(Color.BLUE);
		gc.setLineWidth(5);
		gc.strokeLine(40, 10, 10, 40);
		gc.fillOval(10, 60, 30, 30);
		gc.strokeOval(60, 60, 30, 30);
		gc.fillRoundRect(110, 60, 30, 30, 10, 10);
		gc.strokeRoundRect(160, 60, 30, 30, 10, 10);*/

		//AJUSTE DE TAMAÑO Y POSICION GRIDPANE
		gp.setMinSize(400, 300);
		gp.setVgap(5); 
		gp.setHgap(5); 
		gp.setAlignment(Pos.TOP_LEFT);
		//INSERSION DE CADA UNO DE LOS BOTONES,TEXTOS Y CAMPOS DE TEXTO
		gp.add(texto1, 0, 0);
		gp.add(campo1, 1, 0);
		gp.add(texto2, 0, 1);
		gp.add(campo2, 1, 1);
		gp.add(cuad, 1, 2);
		gp.add(cuadVer, 1, 3);
		
		gp.add(texto3, 2, 0);
		gp.add(campo3, 3, 0);
		gp.add(rect, 3, 2);
		gp.add(rectVer, 3, 3);
		gp.add(texto4, 2, 1);
		gp.add(campo4, 3, 1);
		
		gp.add(texto5, 4, 0);
		gp.add(cbx, 5, 0);
		gp.add(texto6, 4, 1);
		gp.add(campo6, 5, 1);
		gp.add(circ, 5, 2);
		gp.add(circVer, 5, 3);
		
		gp.add(texto9, 4, 4);
		gp.add(campo5, 5, 4);
		gp.add(texto7, 4, 5);
		gp.add(campo7, 5, 5);
		gp.add(texto8, 4, 6);
		gp.add(campo8, 5, 6);
		
		gp.add(anterior, 1, 22);
		gp.add(siguiente, 5, 22);
		
		//EVENTOS BOTONES 	
		cuad.setOnAction(evt -> gc.strokeRect(20, 20, Integer.parseInt(campo1.getText()), Integer.parseInt(campo1.getText())));
		cuadVer.setOnAction(e ->{
			campo5.setText(campo6.getText());
			campo7.setText(formateador.format((Integer.parseInt(campo1.getText())*Integer.parseInt(campo1.getText()))));
		});
		
		circ.setOnAction(evt -> gc.strokeOval(140, 20, Integer.parseInt(campo2.getText()), Integer.parseInt(campo2.getText())));
		circVer.setOnAction(e ->{
			campo5.setText(campo6.getText());
			campo7.setText(formateador.format(Math.PI*(Math.pow(Integer.parseInt(campo2.getText()),2))));
			campo8.setText(formateador.format(2*Math.PI*Integer.parseInt(campo2.getText())));
		});
		
		rect.setOnAction(evt -> gc.strokeRect(320, 20, Integer.parseInt(campo4.getText()), Integer.parseInt(campo3.getText())));
		rectVer.setOnAction(e ->{
			campo5.setText(campo6.getText());
			campo7.setText(formateador.format((Integer.parseInt(campo3.getText())*Integer.parseInt(campo4.getText()))));
			campo8.setText(formateador.format(2*(Integer.parseInt(campo1.getText())+Integer.parseInt(campo1.getText()))));
		});

		
		//AJUSTE DE POSICION DEL CANVAS POR MEDIO DEL ANCHORPANE
		AnchorPane.setTopAnchor(root, 120.0);
        AnchorPane.setLeftAnchor(root, 10.0);
        AnchorPane.setRightAnchor(root, 10.0);
		ac.getChildren().addAll(root);
		//CREACION STACKPANE QUE CONTIENE EL GRIDPANE Y ANCHORPANE
		StackPane st = new StackPane(ac,gp);
		//ASIGNACION DE COLOR DEL STACK PANE
		st.setStyle("-fx-background-color: BEIGE;");
		//CREACION DE LA ESCENA Y EL ESCENARIO
		Scene esc = new Scene(st);
		Stage sta = new Stage();
		sta.setTitle("CALCULDORA DE FIGURAS");
		sta.setScene(esc);
		sta.setResizable(false);
		sta.show();
		

	}
	public static void main(String[] args) {
		launch(args);
	}

}
