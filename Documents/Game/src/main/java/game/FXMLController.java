package game;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    Game game;
      
          @FXML
       private TextField Name1;
       @FXML
       private TextField Name2;
      
     @FXML
         private Label box1;
     @FXML
       private  Label box2;
     @FXML
        private Label box3;
     @FXML
        private Label box4;
      @FXML
        private  Label box5;
       @FXML
         private Label box6;
        @FXML
         private Label box7;
         @FXML
         private Label box8;
          @FXML
         private Label box9;
           @FXML
         private Label box10;
            @FXML
         private Label box11;
             @FXML
         private Label box12;
              @FXML
         private Label box13;
               @FXML
         private Label box14;
                @FXML
         private Label box15;
      @FXML
      public void  setName1(){
           game.setNameOfPlyer1(Name1.getText());
         //  Name1.textProperty().bind(game.nameOfPlyer1Property());
          System.out.println(game.getNameOfPlyer1());
      }
        @FXML
      public void  setName2(){
           game.setNameOfPlyer2(Name2.getText());
           //Name2.textProperty().bind(game.nameOfPlyer2Property());
            System.out.println(game.getNameOfPlyer2());
            game.setWinner(game.getNameOfPlyer1());
       }
      int j=1;
      int count;
         @FXML
         public void start(){
              count=14;
              int i=1+(int)(Math.random()*15);
               box1.setText("    0");
               box2.setText("    0");
               box3.setText("    0");
               box4.setText("    0");
               box5.setText("    0");
               box6.setText("    0");
               box7.setText("    0");
               box8.setText("    0");
               box9.setText("    0");
               box10.setText("    0");
               box11.setText("    0");
               box12.setText("    0");
               box13.setText("    0");
               box14.setText("    0");
               box15.setText("    0");
             switch(i){
                 case 1:box1.setText("");
                     break;
                 case 2:box2.setText("");
                     break;
                 case 3:box3.setText("");
                     break;
                 case 4:box4.setText("");
                     break;
                 case 5:box5.setText("");
                     break;
                 case 6:box1.setText("");
                     break;
                  case 7:box1.setText("");
                     break;   
                case 8:box1.setText("");
                     break;
                case 9:box1.setText("");
                     break;
                case 10:box1.setText("");
                     break;
                case 11:box1.setText("");
                     break;
                case 12:box1.setText("");
                     break;
                case 13:box1.setText("");
                     break;
                case 14:box1.setText("");
                     break;
                case 15:box1.setText("");
                     break;
              }
           
              game.setNumberOfTurns(j++);
              game.setDate(LocalDateTime.now());
              System.out.println(game.getNumberOfTurns());
              System.out.println(game.getDate());
              
          }
       
         @FXML
         public void Remove1() throws Exception{ 
             box1.setText(" ");
              count--; 
              if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
              alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();  
         
        }
             
    }
         
         @FXML
        public void Remove2() throws Exception{ box2.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
             if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
         if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
           
               }
             
        }
          @FXML
         public void Remove3() throws Exception{box3.setText(" ");
              count--; 
              if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
             if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
       alert.setContentText("Winner is"+" "+game.getWinner());
         alert.showAndWait();
         
             }
             
         }
          @FXML
         public void Remove4() throws Exception{  box4.setText(" ");
           count--; 
           if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
     
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
        alert.setContentText("Winner is"+" "+game.getWinner());
        alert.showAndWait();
         
             }
             
         }
         @FXML
         public void Remove5() throws Exception{ box5.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
         
             }
             
        }
         @FXML
         public void Remove6() throws Exception{ box6.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
           
             }
             
        }
         @FXML
         public void Remove7() throws Exception{ box7.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
         
             }
             
        }
         @FXML
         public void Remove8() throws Exception{ box8.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
          
             }
             
        }
         @FXML
         public void Remove9() throws Exception{ box9.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
          
             }
             
        }
         @FXML
         public void Remove10() throws Exception{ box10.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
           
             }
             
        }
         @FXML
         public void Remove11() throws Exception{ box11.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
          
             }
             
        }
         @FXML
         public void Remove12() throws Exception{ box12.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
          
             }
             
        }
         @FXML
         public void Remove13() throws Exception{ box13.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
           
             }
             
        }
         @FXML
         public void Remove14() throws Exception{ box14.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
          
             }
             
        }
         @FXML
         public void Remove15() throws Exception{ box15.setText(" ");
            count--; 
            if(count!=0){
               Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
               alert.setContentText("Do you want to remove one more?Or can you remove one more?");
               ButtonType buttonTypeOne = new ButtonType("Yes");
              ButtonType buttonTypeTwo = new ButtonType("No");
               alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
              Optional<ButtonType> result = alert.showAndWait();
              if ((result.get()==buttonTypeTwo)&&(game.getWinner().equals(game.getNameOfPlyer1()))){
                  game.setWinner(game.getNameOfPlyer2());
               } else if ((result.get()==buttonTypeTwo )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
               else if ((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer1()))) {
                  game.setWinner(game.getNameOfPlyer1());
               } 
              else if((result.get()==buttonTypeOne )&&(game.getWinner().equals(game.getNameOfPlyer2()))) {
                  game.setWinner(game.getNameOfPlyer2());
               } 
              }
          if(count==0){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("Game Over!");
          alert.setHeaderText("Congratulation!");
          alert.setContentText("Winner is"+" "+game.getWinner());
          alert.showAndWait();
           
             }
       }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
