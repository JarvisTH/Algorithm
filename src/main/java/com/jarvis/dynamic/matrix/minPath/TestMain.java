package com.jarvis.dynamic.matrix.minPath;

public class TestMain {
    public static void main(String[] args){
        int[][] grid=new int[4][4];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=(int)(Math.random()*10)+1;
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("最小路径和："+new MinPath().minPathSum(grid));
    }
}
