import java.io.*;
import java.lang.*;
import java.util.*;

public class Islands {
    // no of rows and cols
    static final int Row = 5, Col = 5;

    // A fucntion to check whether given cell is safe
    boolean isSafe(int M[][], int row, int col, boolean visited[][]) {
        // check true for row in range, col in range
        // not visited cell, equals to 1
        return (row >= 0) && (col >= 0) && (row < Row) && (col < Col) && ((M[row][col] == 1) && (!visited[row][col]));
    }

    // utitlity function to do dfs
    void DFS(int M[][], int row, int col, boolean visited[][]) {
        // relative index to position adjacent cells
        int rowRefIndex[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colRefIndex[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        // mark visited cell
        visited[row][col] = true;
        // recur current nieghbors
        for (int k = 0; k < 8; k++) {
            if (isSafe(M, row + rowRefIndex[k], col + colRefIndex[k], visited)) {
                DFS(M, row + rowRefIndex[k], col + colRefIndex[k], visited);
            }
        }
    }

    // main function to count islands
    int countIslands(int M[][]) {
        boolean[][] visited = new boolean[Row][Col];
        int count = 0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                if (M[i][j] == 1 && !visited[i][j]) {
                    // value of 1 not visited
                    // new island found
                    // DSM through cell
                    // increment count
                    DFS(M, i, j, visited);
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int M[][] = new int[][] {
                { 1, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 1 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 1 }
        };
        Islands i = new Islands();
        System.out.println(i.countIslands(M));
    }
}