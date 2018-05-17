/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.time.LocalDateTime;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *This is a class that contain game's information.
 * @author Ru Xue
 */
public class Game {
    /**
     The start date of game,a localDateTime type.
     */
     private ObjectProperty<LocalDateTime> date;
     /**
      * The name of winner.
      */
    private StringProperty winner;
    /**
     * The name of player1.
     */
    private StringProperty nameOfPlyer1;
    /**
     * The name of player2.
     */
    private StringProperty nameOfPlyer2;
    /**
     * The number of turns,it is an integer number.
     */
   private IntegerProperty numberOfTurns;
     
/**
 * Set date,winner,player1'name,player2's name,number of turns.
 * @param Date of start date and time
 * @param winner  name of winner
 * @param nameOfPlayer1  name of player1
 * @param nameOfPlayer2   name of player2
 * @param numberOfTurns  number of turns
 */
    public Game(LocalDateTime date,String winner,String nameOfPlayer1,String nameOfPlayer2,int numberOfTurns) {
        this.date=new SimpleObjectProperty<LocalDateTime>(date);
        this.winner=new SimpleStringProperty(winner);
        this.nameOfPlyer1=new SimpleStringProperty(nameOfPlayer1);
        this.nameOfPlyer2=new SimpleStringProperty(nameOfPlayer2);
        this.numberOfTurns=new SimpleIntegerProperty(numberOfTurns);
    }
   
    
    /**
     * get number of turns.
     * @return int
     */
    public int getNumberOfTurns() {
        return numberOfTurns.get();
    }
/**
 * 
 * @param value number of turns
 */
    public void setNumberOfTurns(int value) {
        numberOfTurns.set(value);
    }
    /**
     * get number of turns.
     * @return int
     */

    public IntegerProperty numberOfTurnsProperty() {
        return numberOfTurns;
    }
    /**
     * get name of player2.
     * @return String 
     */

    public String getNameOfPlyer2() {
        return nameOfPlyer2.get();
    }
/**
 *  set name of player2.
 * @param value 
 */
    public void setNameOfPlyer2(String value) {
        nameOfPlyer2.set(value);
    }
/**
 * get name of player2 .
 * @return StringPeoperty 
 */
    public StringProperty nameOfPlyer2Property() {
        return nameOfPlyer2;
    }
/**
 * get name of player1.
 * @return String
 */
    public String getNameOfPlyer1() {
        return nameOfPlyer1.get();
    }
/**
 * set name of player1.
 * @param value 
 */
    public void setNameOfPlyer1(String value) {
        nameOfPlyer1.set(value);
    }
/**
 * get name of player1.
 * @return StringPeoperty 
 */
    public StringProperty nameOfPlyer1Property() {
        return nameOfPlyer1;
    }
     /**
      * get name of winner.
      * @return String
      */
    public String getWinner() {
        return winner.get();
    }
 /**
  * 
  * @param value 
  */
    public void setWinner(String value) {
        winner.set(value);
    }
    /**
     * get name of winner.
     * @return StringPeoperty 
     */

    public StringProperty winnerProperty() {
        return winner;
    }
    
     /**
      * get start date.
      * @return LocalDateTime
      */
    public LocalDateTime getDate() {
        return date.get();
    }
/**
 * 
 * @param value 
 */
    public void setDate(LocalDateTime value) {
        date.set(value);
    }
/**
 * get start date.
 * @return ObjectProperty
 */
    public ObjectProperty dateProperty() {
        return date;
    }
}
