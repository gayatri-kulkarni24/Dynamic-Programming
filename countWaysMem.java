public static int countWaysMem(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]=countWaysMem(n-1,ways) + countWaysMem(n-2,ways);
        return ways[n];
    }
