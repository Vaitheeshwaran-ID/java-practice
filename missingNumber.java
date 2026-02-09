public static void main(int[] nums){
int sum=0;
  for(int i=0;i<nums.length;i++){
    sum=sum+nums[i];
}
  int actualsum=(nums.length*(nums.length+1))/2;

int missingnumber=actualsum-sum;
  return missingnumber;
}
