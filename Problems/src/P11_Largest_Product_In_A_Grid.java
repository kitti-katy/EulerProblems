/**
 * Created by Yekaterina on 8/12/2016.
 */
public class P11_Largest_Product_In_A_Grid {


    static long[] largestLeftRight(int startPoint, int endPoint, int row, int[][] grid, long product) {

        if (endPoint >= grid[0].length && row < grid.length) {
            endPoint = 3;
            startPoint = 0;
            row++;
        } else if (endPoint >= grid[0].length && row >= grid.length)
            return new long[]{0, 0, 0};

        long newProduct = 1;

        if (product == 0) {

            for (int i = startPoint; i < endPoint + 1; i++) {
                if (grid[row][i] == 0)
                    return largestLeftRight(i + 1, i + 4, row, grid, 0);
                newProduct = newProduct * grid[row][i];

            }

        } else {
            newProduct = (product / grid[row][startPoint - 1]) * grid[row][endPoint];
            if (newProduct == 0) {
                startPoint = startPoint + 3;
                endPoint = endPoint + 3;
            }
        }

        long[] finalGreatest = largestLeftRight(startPoint + 1, endPoint + 1, row, grid, newProduct);
        if (finalGreatest[2] > newProduct)
            return finalGreatest;
        return new long[]{startPoint, row, newProduct};

    }


    static long[] largestUpDown(int startPoint, int endPoint, int column, int[][] grid, long product) {

        if (endPoint >= grid[0].length && column < grid.length) {
            endPoint = 3;
            startPoint = 0;
            column++;
        } else if (endPoint >= grid.length && column >= grid[0].length)
            return new long[]{0, 0, 0};

        long newProduct = 1;

        if (product == 0) {

            for (int i = startPoint; i < endPoint + 1; i++) {
                if (grid[i][column] == 0)
                    return largestLeftRight(i + 1, i + 4, column, grid, 0);
                newProduct = newProduct * grid[i][column];

            }

        } else {
            newProduct = (product / grid[startPoint - 1][column]) * grid[endPoint][column];
            if (newProduct == 0) {
                startPoint = startPoint + 3;
                endPoint = endPoint + 3;
            }
        }

        long[] finalGreatest = largestLeftRight(startPoint + 1, endPoint + 1, column, grid, newProduct);
        if (finalGreatest[2] > newProduct)
            return finalGreatest;
        return new long[]{startPoint, column, newProduct};

    }


    static long[] largestDiagonalUpDown(int startPoint, int endPoint, int row, int[][] grid, long product) {

        if (endPoint >= grid[0].length && row < grid.length - 4) {
            endPoint = 3;
            startPoint = 0;
            row++;
        } else if (endPoint >= grid[0].length && row >= grid.length)
            return new long[]{0, 0, 0};

        long newProduct = 1;

        if (product == 0) {

            for (int i = startPoint; i < endPoint + 1; i++) {
                if (grid[row][i] == 0)
                    return largestLeftRight(i + 1, i + 4, row, grid, 0);
                newProduct = newProduct * grid[row][i];
                row++;

            }

        } else {
            newProduct = (product / grid[row][startPoint - 1]) * grid[row][endPoint];
            if (newProduct == 0) {
                startPoint = startPoint + 3;
                endPoint = endPoint + 3;
            }
        }

        long[] finalGreatest = largestLeftRight(startPoint + 1, endPoint + 1, row, grid, newProduct);
        if (finalGreatest[2] > newProduct)
            return finalGreatest;
        return new long[]{startPoint, row, newProduct};

    }
}



