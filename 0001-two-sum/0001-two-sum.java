class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        
        // for(int i = 0; i<=nums.length-2; i++){
        //     for(int j = 1; j<=nums.length-1; j++){
        //         if(nums[i] + nums[j] == target){
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }

            map.put(nums[i], i);
        }

        return result;       
    }
}