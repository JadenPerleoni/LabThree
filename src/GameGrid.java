import java.security.SecureRandom;
import java.util.Scanner;


public class GameGrid {

    int iWallChance = 10;
    int iUserRow = 0;
    int iUserCol = 0;
    boolean bExitLoop = true;
    Scanner scnr = new Scanner(System.in);
    String sUserChoice;

    public void run() {
        int[][] aiGrid = new int[10][10];
        SecureRandom oRand = new SecureRandom();

        // Sets the chance of getting a wall to 30.


        // Create a 2D game grid
        for (int y = 0; y < aiGrid[0].length; y++) {
            for (int x = 0; x < aiGrid.length; x++) {

                int iChance = oRand.nextInt(100);

                if (iChance < iWallChance) {
                    aiGrid[x][y] = 1;
                } else {
                    aiGrid[x][y] = 0;
                }
                if (x == 0 && y == 0) {
                    aiGrid[x][y] = 0;
                }
            }
        }


        // Gets user's selected path
        while (bExitLoop) {
            System.out.print("Would you like to move right or down? ");
            sUserChoice = scnr.next();

            if (sUserChoice.equals("right")) {
                iUserRow++;
            } else if (sUserChoice.equals("down")) {
                iUserCol++;
            }
            // Checks if user hits a wall
            if (aiGrid[iUserRow][iUserCol] == 1) {
                System.out.println("You failed");
                bExitLoop = false;
            } else if (iUserCol == 9 || iUserRow == 9) {
                System.out.println("You won!");
                bExitLoop = false;
            }
        }
        // Prints the array
        for (int y = 0; y < aiGrid[0].length; y++) {
            for (int x = 0; x < aiGrid.length; x++) {

                if (x == iUserRow && y == iUserCol) {
                    System.out.print("X ");
                } else {
                    System.out.print(aiGrid[x][y] + " ");
                }
            }
            System.out.println();
        }


    }
}
