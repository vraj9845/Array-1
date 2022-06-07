//Time complexity: O(n)
// space complexity: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int x=1;
        arr[0]=1;
        
        for(int i=1;i<nums.length;i++){
            
            x=nums[i-1]*x;
            arr[i]=x;
        }
        x=1;
        for(int i=nums.length-2;i>=0;i--){
             x=x*nums[i+1];
            arr[i]=arr[i]*x;
           
        }
        return arr;
    }
}
