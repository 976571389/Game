package game;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * This is the main class.
 * @author Ru Xue
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
         
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/Scene.fxml"));
        Scene scene = new Scene((Parent) loader.load());
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
   private static Logger logger = LoggerFactory.getLogger(MainApp.class);
    public static void main(String[] args) {
        launch(args);
                logger.error("");
		logger.warn("This is a WARNING message");
		logger.info("This is an INFO message");
		logger.debug("This is a DEBUG message");
		logger.trace("This is a TRACE message");
		logger.info("User's name is {}", System.getProperty("user.name"));
		logger.error("This is an ERROR message that contains 'FAIL'");
    }

}
