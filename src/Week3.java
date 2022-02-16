import java.security.SecureRandom;

public class Week3 {

    public static void main(String[] args) {

        Week3 oWeek3 = new Week3();

        //oWeek3.runRandNumTest();
        oWeek3.runGameGrid2();
    }
    private void runRandNumTest() {
        SecureRandom oRand = new SecureRandom();

        oRand.setSeed(25);
        int iNum = oRand.nextInt(10);

        System.out.println(iNum);
    }

    private void runGameGrid1() {
        // ai: Means array of integers
        int[][] aiGrid = new int[10][8];

        SecureRandom oRand = new SecureRandom();

        // Ys are rows and Xs are columns.

        // Create a 2D game grid
        for(int y = 0; y < aiGrid[0].length; y++) {
            for (int x = 0; x < aiGrid.length; x++) {
                aiGrid[x][y] = oRand.nextInt(2);
                System.out.print(aiGrid[x][y] + " ");
            }
            System.out.println();
        }
    }
    private void runGameGrid2() {
        int[][] aiGrid = new int[10][8];
        SecureRandom oRand = new SecureRandom();

        // Sets the chance of getting a wall to 30.
        int iWallChance = 30;

        // Create a 2D game grid
        for (int y = 0; y < aiGrid[0].length; y++) {
            for (int x = 0; x < aiGrid.length; x++) {

                int iChance = oRand.nextInt(100);

                if (iChance < iWallChance) {
                    aiGrid[x][y] = 1;

                } else {
                    aiGrid[x][y] = 0;
                }
                System.out.print(aiGrid[x][y] + " ");
            }
            System.out.println();
        }

    }
}
