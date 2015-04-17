/**
 * Created by Sam on 17/04/2015.
 * Implements a checker piece
 */
public class Checker {

    //VARIABLES
    private int playerID;
    private boolean madeKing;
    private boolean isDead;

    /**
     * Constructor for Checker
     * @param playerID  player to which the piece belongs
     */
    public Checker(int playerID){
        this.playerID = playerID;
        this.madeKing = false;
        this.isDead = false;
    }

    /**
     * Setter for madeKing
     */
    public void setKing(){
        this.madeKing = true;
    }

    /**
     * Getter for madeKing
     * @return value of madeKing
     */
    public boolean getKing(){
        return madeKing;
    }

    /**
     * Setter for isDead
     */
    public void setDead(){
        this.isDead = true;
    }

    /**
     * Getter for isDead
     * @return value of isDead
     */
    public boolean getDead(){
        return isDead;
    }

}