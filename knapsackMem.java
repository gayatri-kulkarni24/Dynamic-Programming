  public static int knapsackMem(int val[],int wt[],int W,int n,int dp[][]){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[W][n]!=-1){
            return dp[W][n];
        }
        if(wt[n-1] <= W){
            int ans1=val[n-1]+knapsackMem(val,wt,W-wt[n-1],n-1,dp);
            int ans2=knapsackMem(val,wt,W,n-1,dp);
            dp[W][n]=Math.max(ans1,ans2);
            return dp[W][n];
        }else{
            dp[W][n]=knapsackMem(val,wt,W,n-1,dp);
            return dp[W][n];
        }
    }
