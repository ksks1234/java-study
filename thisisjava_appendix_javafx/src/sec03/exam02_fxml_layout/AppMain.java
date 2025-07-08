package sec03.exam02_fxml_layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
 * FXML : javaFX 애플리케이션의 UI 레이아웃을 자바 코드에서 불리해서 태그로 선언
 * xml로 레이아웃을 작성하고, 이벤트 처리 및 애플리케이션 로직은 자바로작성한다.
 */
public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// FXML 레이아웃 파일 로딩 코드
		// == HBox root = (HBox) FXMLLoader.load(getClass().getResource("root.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
