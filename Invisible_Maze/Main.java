import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameTile[][] board = new GameTile[5][5];
        Player player = new Player();

        // Initialize the board
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = new GameTile();
            }
        }

        // Set wall positions
        board[1][0].setWall(true);
        board[1][1].setWall(true);
        board[1][2].setWall(true);
        board[1][3].setWall(true);
        board[2][3].setWall(true);
        board[3][3].setWall(true);
        board[4][3].setWall(true);

        // Starting position
        int startRow = 0;
        int startCol = 0;
        player.setrPos(startRow);
        player.setcPos(startCol);
        board[startRow][startCol].setHasPlayer(true);
        board[startRow][startCol].setRevealed(true);

        // Winning position
        int winRow = 4;
        int winCol = 4;

        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;

        while (gameOn) {
            // Print the maze
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(board[i][j].toString() + " ");
                }
                System.out.println();
            }

            // Check for win
            if (player.getrPos() == winRow && player.getcPos() == winCol) {
                System.out.println("YOU WIN");
                break;
            }

            // Ask for move
            System.out.print("Move w = up, s = down, a = left, d = right: ");
            String move = scanner.nextLine().toLowerCase();

            int newR = player.getrPos();
            int newC = player.getcPos();

            switch (move) {
                case "w": newR--; break;
                case "s": newR++; break;
                case "a": newC--; break;
                case "d": newC++; break;
                default:
                    System.out.println("USE W/A/S/D");
                    continue;
            }

            // Check bounds
            if (newR < 0 || newR >= 5 || newC < 0 || newC >= 5) {
                System.out.println("Can't move outside the maze");
                continue;
            }

            // Reveal the attempted tile
            board[newR][newC].setRevealed(true);

            if (board[newR][newC].isWall()) {
                System.out.println("TRY AGAIN");
                continue;
            }

            // Move player
            board[player.getrPos()][player.getcPos()].setHasPlayer(false);
            board[player.getrPos()][player.getcPos()].setRevealed(true); 

            player.setrPos(newR);
            player.setcPos(newC);

            board[newR][newC].setHasPlayer(true);
        }

        scanner.close();
    }
}
