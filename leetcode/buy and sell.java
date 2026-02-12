
class Solution {
    public int maxProfit(int[] prices) {
int ans=0;
int m=Integer.MAX_VALUE;

for(int i=0;i<prices.length;i++){
    if(prices[i]<m){
       m=prices[i]; 
    }
    int profit =prices[i]-m;
    if(profit>ans){
ans=profit;
    }
}
return ans;
    }
}
