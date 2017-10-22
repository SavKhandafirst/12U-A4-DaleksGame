
import java.awt.Color;




/** This class manages the interactions between the different pieces of
 *  the game: the Board, the Daleks, and the Doctor. It determines when
 *  the game is over and whether the Doctor won or lost.
 */
public class CatchGame {

    /**
     * Instance variables go up here
     * Make sure to create a Board, 3 Daleks, and a Doctor
     */
    
    // instance variables 
    
    // make the board
    Board board = new Board(12, 12);
    
    // make the doctor and set the spawn position randomly on board
    Doctor doctor = new Doctor((int) Math.ceil(Math.random() * 12), (int) Math.ceil(Math.random() * 12));
    
    // make Darek #1 and set the spawn position randomly on board
    Dalek dalekOne = new Dalek((int) Math.ceil(Math.random() * 12), (int) Math.ceil(Math.random() * 12));
    
    // make Darek #2 and set the spawn position randomly on board
    Dalek dalekTwo = new Dalek((int) Math.ceil(Math.random() * 12), (int) Math.ceil(Math.random() * 12));
    
    // make Darek #3 and set the spawn position randomly on board
    Dalek dalekThree = new Dalek((int) Math.ceil(Math.random() * 12), (int) Math.ceil(Math.random() * 12));
    
    /**
     * The constructor for the game. 
     * Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame(){
        
        // create the doctor
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());
        
        // create Dalek number 1
        board.putPeg(Color.BLACK, dalekOne.getRow(), dalekOne.getCol());
        
        // create Dalek number 2
        board.putPeg(Color.BLACK, dalekOne.getRow(), dalekOne.getCol());
        
        // create Dalek number 3
        board.putPeg(Color.BLACK, dalekOne.getRow(), dalekOne.getCol());
           
    }
    
    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {

    }

}
