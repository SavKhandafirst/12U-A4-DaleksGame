
/**
 * This class models the Doctor in the game. A Doctor has a position and can
 * move to a new position.
 */
public class Doctor {

    private int row, col;
    

    /**
     * Initializes the variables for a Doctor.
     *
     * @param theRow The row this Doctor starts at.
     * @param theCol The column this Doctor starts at.
     */
    public Doctor(int theRow, int theCol) {
        this.row = theRow;
        this.col = theCol;

    }

    /**
     * Move the Doctor. If the player clicks on one of the squares immediately
     * surrounding the Doctor, the peg is moved to that location. Clicking on
     * the Doctor does not move the peg, but instead allows the Doctor to wait
     * in place for a turn. Clicking on any other square causes the Doctor to
     * teleport to a random square (perhaps by using a �sonic screwdriver�).
     * Teleportation is completely random.
     *
     * @param newRow The row the player clicked on.
     * @param newCol The column the player clicked on.
     */
    public void move(int newRow, int newCol) {
        // doctor moves up and to the left
        if(newRow == this.row - 1 && newCol == this.col - 1){
            this.row = newRow;
            this.col = newCol;
        }
        // doctor moves up
        if(newRow == this.row - 1 && newCol == this.col){
            this.row = newRow;
            this.col = newCol;
        }
        // doctor moves up and to the right
         if(newRow == this.row - 1 && newCol == this.col + 1){
            this.row = newRow;
            this.col = newCol;
        }       
        // doctor moves left
        if(newRow == this.row && newCol == this.col - 1){
            this.row = newRow;
            this.col = newCol;
        }       
        // doctor moves right
        if(newRow == this.row && newCol == this.col + 1){
            this.row = newRow;
            this.col = newCol;
        }      
        // doctor stays in the same spot
        if(newRow == this.row && newCol == this.col){
            this.row = newRow;
            this.col = newCol;
        }  
        // doctor moves down and to the left
        if(newRow == this.row + 1 && newCol == this.col - 1){
            this.row = newRow;
            this.col = newCol;
        }     
        // doctor moves down
        if(newRow == this.row + 1 && newCol == this.col){
            this.row = newRow;
            this.col = newCol;
        }            
        // doctor moves down and to the right
        if(newRow == this.row + 1 && newCol == this.col + 1){
            this.row = newRow;
            this.col = newCol;
        }
    }
    
    /**
     * Returns the row of this Doctor.
     *
     * @return This Doctor's row.
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Returns the column of this Doctor.
     *
     * @return This Doctor's column.
     */
    public int getCol() {
        return this.col;
    }

}
