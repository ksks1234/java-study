package sec02.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();	// 윈도우 보여주기
		/*
		 * JavaFX 는 윈도우를 무대(Stage)로 표현한다.
		 * launch()는 start() 메소드를 호출할 때 메인 윈도우를 primaryStage로 제공하는데, 
		 * start()에서 primaryStage.show() 메소드를 호출함으로써 
		 * 메인 윈도우가 보여진다.
		 * 
		 * launch() 메소드가 호출 -> main 객체 생성
		 * 이어서 init() 호출 :: init() main의 실행 매개값을 얻어 애플리케이션을 이용할 수 있게 해줌
		 * init() -> start() 호출 => 메인 윈도우 실행
		 * 종료되기 직전 stop() 메서드 호출
		 */
		
	}
	
	public static void main(String[] args) {
		launch(args);	// AppMain 객체 생성 및 메인 윈도우 생성
	}

}
