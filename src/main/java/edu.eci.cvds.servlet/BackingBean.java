package edu.eci.cvds.servlet;

import java.util.Random;
import java.lang.Integer;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.ApplicationScoped;


@ManagedBean(
        name = "guessBean"
)
@ApplicationScoped
public class BackingBean {

    private int guesses = 0;
    private int guessedNumber;
    private int prize = 100000;
    private String gameState = " todavia no ";
    private Random generator = new Random();
    private int number = generator.nextInt();

    public BackingBean() {
    }

    public int getNumber() {
        return number;
    }

    public int getGuesses() {
        return guesses;
    }

    public int getPrize() {
        return prize;
    }

    public String getGameState(){
        return gameState;
    }

    public void setGuessedNumber(int guess) {
        this.guessedNumber = guess;
    }

    private void guess(int guessedNumber) {
        if (guessedNumber == number) {
            gameState = "win " + Integer.toString(prize);
        }
        else {
            prize -= 10000;
            guesses++;
        }
    }

    private void restart() {
        prize = 100000;
        gameState = " todavia no ";
        number = generator.nextInt();
    }
}