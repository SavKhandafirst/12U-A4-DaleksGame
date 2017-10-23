
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class BoardClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Board b = new Board(12, 12);

        // place peg
        b.putPeg(Color.GREEN, 1, 1);


//        // remove a peg
//        b.removePeg(3, 5);
//
//        // message
//        b.displayMessage("Hello everyone");
//
//        // receive a click from the user
//        while (true) {
//            Coordinate click = b.getClick();
//            int clickRow = click.getRow();
//            int clickCol = click.getCol();
//            // put a peg at the click
//            b.putPeg(Color.BLACK, clickRow, clickCol);
//        }
    }
}
