class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int ArrSum =0;
        for(int i = 0; i<nums.length+1; i++){
             sum = sum + i;
        }
        for(int j =0; j<nums.length; j++){
             ArrSum = ArrSum + nums[j];
        } 
        return sum-ArrSum;
    }
}