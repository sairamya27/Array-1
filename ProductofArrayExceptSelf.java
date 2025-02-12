
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod  = new int[nums.length];
        prod[0]=1;
        for(int i=1;i<nums.length;i++){
            prod[i] = prod[i-1]*nums[i-1];
        }
        int temp = 1;
        for(int i=nums.length-2;i>=0;i--){
            prod[i]*= nums[i+1]*temp;
            temp*= nums[i+1];
        }
        return prod;
    }
}