package com.jarvis.dynamic.matrix.minPath;

import java.util.regex.Matcher;

/**
 * [[1,3,1],
 *  [1,5,1],
 *  [4,2,1]]
 * Given the above grid map, return 7.
 * Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinPath {
    public int minPathSum(int[][] grid){
        if(grid.length==0||grid[0].length==0){
            return 0;
        }
        int m=grid.length,n=grid[0].length;
        int[] dp=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    dp[j]=dp[j];        //从上面走到该位置
                }else if(i==0){
                    dp[j]=dp[j-1];      //从左侧走到该位置
                }else{
                    dp[j]= Math.min(dp[j-1],dp[j]);
                }
                dp[j]+=grid[i][j];
                System.out.print(dp[j]+"\t");
            }
            System.out.println();
        }
        return dp[n-1];
    }
}
