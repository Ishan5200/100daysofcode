class Solution 
{
    public int[] twoSum(int[] nums, int target) {
        //int [] arr = {-1,-1};
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                int [] arr = {i,j};
                return arr;
                }
            }
        }
            int [] arr = {-1,-1};
            return arr;
        }
    }
