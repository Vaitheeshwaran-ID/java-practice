class Solution {
    public int majorityElement(int[] nums) {
    int m=nums[0];
    int n=1;
    for(int i=1;i<nums.length;i++){
if(n==0){
    m=nums[i];
    n=1;
}
else if(nums[i]==m){
n++;
}
else{
    n--;
}
    }
    return m;     
     }  
    }

