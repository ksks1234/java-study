package sec02.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/*
 * 윈도우 = stage(무대)
 * 무대는 한 번에 하나의 장면을 가질 수 있다.
 * 장면 = Scene
 * start() 실행 -> primaryStage 매개값으로 전달
 * 				   But Scene은 직접 생성 필요(javafx.scene.Parent)
 * -- Parent
 * 추상 클래스
 * Stage > Scene > Parent > Label, Button
 * setScene() 메서드로 Scene 내용을 윈도우에 설정함
 */
public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox(); 		// Parent 하위 객체 VBox, 애플리케이션 크기인듯?
		root.setPrefWidth(350);			// VBox 폭 설정
		root.setPrefHeight(150);		// VBox 높이 설정
		root.setAlignment(Pos.CENTER);	// 컨트롤의 중앙으로 정렬
		root.setSpacing(20);			// 컨트롤의 수직 간격
		// --- 여기까지 진행하면 창 크기 변화함
		
		Label label = new Label(); 			// 라벨 컨트롤 생성
		label.setText("Hello, JavaFX"); 	// text 속성 설정
		label.setFont(new Font(50));		// Font 속성 설정(글자 크기)
		
		Button button = new Button(); 		// 버튼 컨트롤 생성
		button.setText("확인"); 			// text 속성 설정(버튼 내용)
		button.setOnAction(event -> Platform.exit()); 	//  클릭 이벤트 처리
		// 버튼을 클릭하면 창이 닫힘
		// --- 여기까진 창 크기 외에 변화 없음
		
		root.getChildren().add(label); 		// VBox에 라벨 컨트롤 추가
		// --- 여기까지 Hello JavaFX 문구 나타남
		root.getChildren().add(button); 	// VBox에 Button 컨트롤 추가
		// --- 여기까지 버튼생김
		
		Scene scene = new Scene(root); 		// VBox를 루트 컨테이너로 Scene 생성
		// 이거 안하면 label도 button도 안나옴
		
		primaryStage.setTitle("AppMain"); 	// 윈도우에 제목 설정
		primaryStage.setScene(scene); 		// 윈도우에 장면 설정
		// 이거 안하면 label도 button도 안나옴
		primaryStage.show(); 				// 윈도우 보여주기
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
