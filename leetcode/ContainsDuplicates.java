import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
int count=0;int ecount=0;
   for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
    if(nums[i]==nums[j])
      {
        count++;
      }
      else{
        ecount++;
      }
    }
   }
   boolean a=(count>0)?true: false;
return a;
    }
    }

