
import java.awt.Color;

/**
 * This class manages the interactions between the different pieces of the game:
 * the Board, the Daleks, and the Doctor. It determines when the game is over
 * and whether the Doctor won or lost.
 */
public class CatchGame {

    /**
     * Instance variables go up here Make sure to create a Board, 3 Daleks, and
     * a Doctor
     */
    // instance variables 
    // make the board
    Board board = new Board(12, 12);

    // make the doctor and set the spawn position randomly on board
    Doctor doctor = new Doctor((int) (Math.random() * 12), (int) (Math.random() * 12));

    // make Darek #1 and set the spawn position randomly on board
    Dalek dalekOne = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));

    // make Darek #2 and set the spawn position randomly on board
    Dalek dalekTwo = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));

    // make Darek #3 and set the spawn position randomly on board
    Dalek dalekThree = new Dalek((int) (Math.random() * 12), (int) (Math.random() * 12));

//    // bug testing
//    Doctor doctor = new Doctor(1, 5);
//    Dalek dalekOne = new Dalek(3, 4);
//    Dalek dalekTwo = new Dalek(1, 5);
//    Dalek dalekThree = new Dalek(3, 6);
    /**
     * The constructor for the game. Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame() {

        // create the doctor
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());

        // create Dalek number 1
        board.putPeg(Color.BLACK, dalekOne.getRow(), dalekOne.getCol());

        // create Dalek number 2
        board.putPeg(Color.BLACK, dalekTwo.getRow(), dalekTwo.getCol());

        // create Dalek number 3
        board.putPeg(Color.BLACK, dalekThree.getRow(), dalekThree.getCol());

    }

    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {

        // make a boolean just in case if the doctor spawns on a dalek or a dalek spawns on a dalek
        boolean sameSpawn = false;

        // if dalek one and doctor have same spawn position
        if (doctor.getRow() == dalekOne.getRow() && doctor.getCol() == dalekOne.getCol()) {
            // get the dalek to crash
            dalekOne.crash();
            // remove the black peg and replace with yellow peg for dalek
            board.removePeg(dalekOne.getRow(), dalekOne.getCol());
            board.putPeg(Color.YELLOW, dalekOne.getRow(), dalekOne.getCol());
            // remove the green peg and replace with yellow peg for doctor
            board.removePeg(doctor.getRow(), doctor.getCol());
            board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
            // tell the player they lost
            board.displayMessage("Oh too bad, better luck nexttime!");
            // end game
            sameSpawn = true;
        }

        // if dalek two and doctor have same spawn position
        if (doctor.getRow() == dalekTwo.getRow() && doctor.getCol() == dalekTwo.getCol()) {
            // get the dalek to crash
            dalekTwo.crash();
            // remove the black peg and replace with yellow peg for dalek
            board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
            board.putPeg(Color.YELLOW, dalekTwo.getRow(), dalekTwo.getCol());
            // remove the green peg and replace with yellow peg for doctor
            board.removePeg(doctor.getRow(), doctor.getCol());
            board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
            // tell the player they lost
            board.displayMessage("Oh too bad, better luck nexttime!");
            // end game
            sameSpawn = true;
        }

        // if dalek three and doctor have same spawn position
        if (doctor.getRow() == dalekThree.getRow() && doctor.getCol() == dalekThree.getCol()) {
            // get the dalek to crash
            dalekThree.crash();
            // remove the black peg and replace with yellow peg for dalek
            board.removePeg(dalekThree.getRow(), dalekThree.getCol());
            board.putPeg(Color.YELLOW, dalekThree.getRow(), dalekThree.getCol());
            // remove the green peg and replace with yellow peg for doctor
            board.removePeg(doctor.getRow(), doctor.getCol());
            board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
            // tell the player they lost
            board.displayMessage("Oh too bad, better luck nexttime!");
            // end game
            sameSpawn = true;
        }

        // if dalek one and dalek two have same spawn
        if (dalekOne.getRow() == dalekTwo.getRow() && dalekOne.getCol() == dalekTwo.getCol()) {
            // make sure that dalekOne doesnt move again
            dalekOne.crash();
            // make sure that dalekTwo doesn't move again
            dalekTwo.crash();
            // remove dalekOne
            board.removePeg(dalekOne.getRow(), dalekOne.getCol());
            // remove dalekTwo
            board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekOne.getRow(), dalekOne.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekTwo.getRow(), dalekTwo.getCol());
        }

        // if dalek one and dalek three have same spawn
        if (dalekOne.getRow() == dalekThree.getRow() && dalekOne.getCol() == dalekThree.getCol()) {
            // make sure that dalekOne doesnt move again
            dalekOne.crash();
            // make sure that dalekThree doesn't move again
            dalekThree.crash();
            // remove dalekOne
            board.removePeg(dalekOne.getRow(), dalekOne.getCol());
            // remove dalekThree
            board.removePeg(dalekThree.getRow(), dalekThree.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekOne.getRow(), dalekOne.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekThree.getRow(), dalekThree.getCol());
        }

        // if dalek two and dalek three have same spawn
        if (dalekTwo.getRow() == dalekThree.getRow() && dalekTwo.getCol() == dalekThree.getCol()) {
            // make sure that dalektwo doesnt move again
            dalekTwo.crash();
            // make sure that dalekThree doesn't move again
            dalekThree.crash();
            // remove dalekTwo
            board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
            // remove dalekThree
            board.removePeg(dalekThree.getRow(), dalekThree.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekTwo.getRow(), dalekTwo.getCol());
            // add a new peg in the same spot but color red to notify user that both objects have crashed
            board.putPeg(Color.RED, dalekThree.getRow(), dalekThree.getCol());
        }

        // while no one has won and if the doctor does not 
        while (true && sameSpawn == false) {
            // set the board so that clicks can be recieved
            Coordinate click = board.getClick();

            // position of click in row
            int clickRow = click.getRow();

            // position of click in column
            int clickCol = click.getCol();

            // first remove the doctor from the previous positon so there arent doubles
            board.removePeg(doctor.getRow(), doctor.getCol());

            // now move the doctor according to where it was clicked
            doctor.move(clickRow, clickCol);

            // now place a new peg according to the new position of the doctor
            board.putPeg(Color.green, doctor.getRow(), doctor.getCol());

            // while Dalek one hasn't crashed
            if (!dalekOne.hasCrashed()) {
                // remove the peg from previous position
                board.removePeg(dalekOne.getRow(), dalekOne.getCol());
                // move the dalek towards the doctor
                dalekOne.advanceTowards(doctor);
                // place a new peg to the coressponding new position
                board.putPeg(Color.BLACK, dalekOne.getRow(), dalekOne.getCol());
            }

            // while Dalek two hasn't crashed
            if (!dalekTwo.hasCrashed()) {
                // remove the peg from previous position
                board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
                // move the dalek towards the doctor
                dalekTwo.advanceTowards(doctor);
                // place a new peg to the coressponding new position
                board.putPeg(Color.BLACK, dalekTwo.getRow(), dalekTwo.getCol());
            }

            // while Dalek Three hasn't crashed
            if (!dalekThree.hasCrashed()) {
                board.removePeg(dalekThree.getRow(), dalekThree.getCol());
                dalekThree.advanceTowards(doctor);
                board.putPeg(Color.BLACK, dalekThree.getRow(), dalekThree.getCol());
            }

            // if dalek one and dalek two have a collision
            if (dalekOne.getRow() == dalekTwo.getRow() && dalekOne.getCol() == dalekTwo.getCol()) {
                // make sure that dalekOne doesnt move again
                dalekOne.crash();
                // make sure that dalekTwo doesn't move again
                dalekTwo.crash();
                // remove dalekOne
                board.removePeg(dalekOne.getRow(), dalekOne.getCol());
                // remove dalekTwo
                board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekOne.getRow(), dalekOne.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekTwo.getRow(), dalekTwo.getCol());
            }

            // if dalek one and dalek three have a collision
            if (dalekOne.getRow() == dalekThree.getRow() && dalekOne.getCol() == dalekThree.getCol()) {
                // make sure that dalekOne doesnt move again
                dalekOne.crash();
                // make sure that dalekThree doesn't move again
                dalekThree.crash();
                // remove dalekOne
                board.removePeg(dalekOne.getRow(), dalekOne.getCol());
                // remove dalekThree
                board.removePeg(dalekThree.getRow(), dalekThree.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekOne.getRow(), dalekOne.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekThree.getRow(), dalekThree.getCol());
            }

            // if dalek two and dalek three have a collision
            if (dalekTwo.getRow() == dalekThree.getRow() && dalekTwo.getCol() == dalekThree.getCol()) {
                // make sure that dalektwo doesnt move again
                dalekTwo.crash();
                // make sure that dalekThree doesn't move again
                dalekThree.crash();
                // remove dalekTwo
                board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
                // remove dalekThree
                board.removePeg(dalekThree.getRow(), dalekThree.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekTwo.getRow(), dalekTwo.getCol());
                // add a new peg in the same spot but color red to notify user that both objects have crashed
                board.putPeg(Color.RED, dalekThree.getRow(), dalekThree.getCol());
            }

            // if dalekOne has crashed into the Doctor
            if (doctor.getRow() == dalekOne.getRow() && doctor.getCol() == dalekOne.getCol()) {
                // get the dalek to crash
                dalekOne.crash();
                // remove the black peg and replace with yellow peg for dalek
                board.removePeg(dalekOne.getRow(), dalekOne.getCol());
                board.putPeg(Color.YELLOW, dalekOne.getRow(), dalekOne.getCol());
                // remove the green peg and replace with yellow peg for doctor
                board.removePeg(doctor.getRow(), doctor.getCol());
                board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
                // tell the player they lost
                board.displayMessage("Oh too bad, better luck nexttime!");
                // end game
                break;
            }

            // if dalek Two has crashed into the Doctor
            if (doctor.getRow() == dalekTwo.getRow() && doctor.getCol() == dalekTwo.getCol()) {
                // get the dalek to crash
                dalekTwo.crash();
                // remove the black peg and replace with yellow peg for dalek
                board.removePeg(dalekTwo.getRow(), dalekTwo.getCol());
                board.putPeg(Color.YELLOW, dalekTwo.getRow(), dalekTwo.getCol());
                // remove the green peg and replace with yellow peg for doctor
                board.removePeg(doctor.getRow(), doctor.getCol());
                board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
                // tell the player they lost
                board.displayMessage("Oh too bad, better luck nexttime!");
                // end game
                break;
            }

            // if dalekThree has crashed into the Doctor
            if (doctor.getRow() == dalekThree.getRow() && doctor.getCol() == dalekThree.getCol()) {
                // get the dalek to crash
                dalekThree.crash();
                // remove the black peg and replace with yellow peg for dalek
                board.removePeg(dalekThree.getRow(), dalekThree.getCol());
                board.putPeg(Color.YELLOW, dalekThree.getRow(), dalekThree.getCol());
                // remove the green peg and replace with yellow peg for doctor
                board.removePeg(doctor.getRow(), doctor.getCol());
                board.putPeg(Color.YELLOW, doctor.getRow(), doctor.getCol());
                // tell the player they lost
                board.displayMessage("Oh too bad, better luck nexttime!");
                // end game
                break;
            }

            // once all daleks are dead
            if (dalekOne.hasCrashed() && dalekTwo.hasCrashed() && dalekThree.hasCrashed()) {
                // outpout message that the player has won
                board.displayMessage("You won, nice job!");
                // end the game
                break;
            }

        }

    }

}
