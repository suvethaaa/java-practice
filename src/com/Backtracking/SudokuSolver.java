package com.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}

        };


        if(solve(board)){
            display(board);
        }else{
            System.out.println("cannot solve");
        }
    }


    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        //checking the row

        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row or not
            if (board[row][col] == num) {
                return false;
            }
        }

        //check the column

        for (int[] nums : board) {
            //check if the number is present in the col
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean solve(int[][] board){
        int n = board.length; // number of rows
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //this is how we are replacing the r , c from arguments

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            //if you found some empty element in row then break

            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
            //sudoku is solved
        }

        //backtrack

        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number)){
                 board[row][col] = number;
                 if(solve(board)){
                     //found the answer
                     return true;
                 }else{
                     //backtrack
                     board[row][col] = 0;
                 }
            }
        }
        return false;
    }

}