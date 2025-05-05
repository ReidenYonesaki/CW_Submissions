public class Player {

    // The player's current row position in the maze grid
    private int rPos;

    // The player's current column position in the maze grid
    private int cPos;

    // Constructor: initializes the player's position to (0, 0)
    public Player() {
        this.rPos = 0;
        this.cPos = 0;
    }

    // Getter for the row position
    public int getrPos() {
        return rPos;
    }

    // Setter for the row position
    public void setrPos(int rPos) {
        this.rPos = rPos;
    }

    // Getter for the column position
    public int getcPos() {
        return cPos;
    }

    // Setter for the column position
    public void setcPos(int cPos) {
        this.cPos = cPos;
    }
}
