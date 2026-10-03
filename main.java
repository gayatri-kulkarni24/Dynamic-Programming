public static void main(String args[]){
        //System.out.println(fibonacci_memoization(5,new int[7]));
        //System.out.println(fibonacci_tab(6));
        //System.out.println(countWays(4));
        //int ways[]=new int[5];
        //Arrays.fill(ways,-1);
        //System.out.println(countWaysMem(4,ways));
        //System.out.println(countWaysTab(4));

        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[W+1][val.length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        //System.out.println(knapsack(val,wt,W,val.length));
        System.out.println(knapsackMem(val,wt,W,val.length,dp));
        System.out.println(knapsackTab(val,wt,W));


        
    }
