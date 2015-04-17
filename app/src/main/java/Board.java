/**
 * Created by Sam on 17/04/2015.
 * Implements a board for checkers
 */
public class Board {

    //CONSTANTS
    private final int EIGHT_BY_EIGHT_SIZE = 20;
    private final int TEN_BY_TEN_SIZE = 15;
    private final int TWELVE_BY_TWELVE_SIZE = 10;

    //VARIABLES
    private int numSquares;
    private int squareSize = TEN_BY_TEN_SIZE;


    /**
     * Implements a Board of a given size
     * @param numSquares    number of square each side
     *                      i.e. numSquares of 8 will yield 8x8 board
     */
    public Board(int numSquares){
        this.numSquares = numSquares;

        switch (numSquares){
            case 8:
                this.squareSize = EIGHT_BY_EIGHT_SIZE;
                break;
            case 10:
                this.squareSize = TEN_BY_TEN_SIZE;
                break;
            case 12:
                this.squareSize = TWELVE_BY_TWELVE_SIZE;
                break;
        }
    }

    /**
     * Constructor for a Board with no argument, assumes default 10x10 board
     */
    public Board(){
        this.numSquares = 10;
        this.squareSize = TEN_BY_TEN_SIZE;
    }



}