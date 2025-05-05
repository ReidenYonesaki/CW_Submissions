public class GameTile {
    private boolean hasPlayer;
    private boolean isRevealed;
    private boolean isWall;

    // Constructor initializes all attributes to false
    public GameTile() {
        hasPlayer = false;
        isRevealed = false;
        isWall = false;
    }

    // Getter for hasPlayer
    public boolean isHasPlayer() {
        return hasPlayer;
    }

    // Setter for hasPlayer
    public void setHasPlayer(boolean hasPlayer) {
        this.hasPlayer = hasPlayer;
    }

    // Getter for isRevealed
    public boolean isRevealed() {
        return isRevealed;
    }

    // Setter for isRevealed
    public void setRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }

    // Getter for isWall
    public boolean isWall() {
        return isWall;
    }

    // Setter for isWall
    public void setWall(boolean isWall) {
        this.isWall = isWall;
    }

   //This is for the maze such as what each thing is
    public static String toString(GameTile grid) {
        if (grid.isHasPlayer())
    {
            return "P"; 
        } 
        else if (grid.isRevealed() && grid.isWall()) 
        {
            return "X";
        } 
        else if (grid.isRevealed())
        {
            return "W";
        } 
        else 
        {
            return "K"; 
        }
    }
