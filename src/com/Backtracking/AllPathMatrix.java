package com.Backtracking;

import java.util.Arrays;

public class AllPathMatrix {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] path = new int[board.length][board[0].length];
        allPathMat("",board,0,0,1,path);
    }

    static void allPathMat(String p ,boolean[][] maze , int r , int c  , int step , int[][] path){

        if(r == maze.length -1 && c == maze[0].length -1){
            path[r][c] = step ;
            for(int[] num : path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;//debugging this program for n times without this return statement
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPathMat(p + 'D' , maze ,r + 1 , c , step + 1 , path);
        }

        if(c < maze[0].length - 1){
            allPathMat(p + 'R' , maze , r , c + 1 , step + 1 , path);
        }

        if(r > 0){
            allPathMat(p + 'U' , maze , r - 1 , c , step + 1 , path);
        }

        if(c > 0){
            allPathMat(p + 'L' , maze , r , c - 1 , step + 1 , path);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }
}