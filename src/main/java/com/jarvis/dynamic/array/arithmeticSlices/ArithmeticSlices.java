package com.jarvis.dynamic.array.arithmeticSlices;

/**
 * A = [0, 1, 2, 3, 4]
 *
 * return: 6, for 3 arithmetic slices in A:
 *
 * [0, 1, 2],
 * [1, 2, 3],
 * [0, 1, 2, 3],
 * [0, 1, 2, 3, 4],
 * [ 1, 2, 3, 4],
 * [2, 3, 4]
 *
 * dp[i] 表示以 A[i] 为结尾的等差递增子区间的个数。
 *当 A[i] - A[i-1] == A[i-1] - A[i-2]，那么 [A[i-2], A[i-1], A[i]] 构成一个等差递增子区间。
 * 而且在以 A[i-1] 为结尾的递增子区间的后面再加上一个 A[i]，一样可以构成新的递增子区间。
 *
 * 在 A[i] - A[i-1] == A[i-1] - A[i-2] 时，dp[i] = dp[i-1] + 1
 *
 * 因为递增子区间不一定以最后一个元素为结尾，可以是任意一个元素结尾，因此需要返回 dp 数组累加的结果。
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A){
        if(A==null||A.length==0){
            return 0 ;
        }
        int n=A.length;
        int[] dp=new int[n];
        for(int i=2;i<n;i++){
            if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                dp[i]=dp[i-1]+1;
            }
        }
        int total=0;
        for(int cnt:dp){
            total+=cnt;
        }
        return total;
    }
}
