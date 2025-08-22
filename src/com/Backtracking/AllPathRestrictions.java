package com.Backtracking;

public class AllPathRestrictions {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPathRestrictions("" , board , 0 , 0);
    }

    static void allPathRestrictions(String p , boolean[][] maze, int r , int c){

        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }


        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            allPathRestrictions(p + 'D' , maze , r +1 , c);
        }

        if(c < maze[0].length-1){
            allPathRestrictions(p + 'R' , maze , r , c+1);
        }

        if(r > 0){
            allPathRestrictions(p + 'U' , maze , r -1 , c);
        }

        if(c > 0){
            allPathRestrictions(p + 'L' , maze , r , c -1 );
        }

        maze[r][c] = true;
    }
}