// Two Sum
// https://leetcode.com/problems/two-sum/description/
class Solution {
    public HashMap<Integer, Integer> addToHashMap(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        return hashMap;
    }

    public int[] twoSum(int[] nums, int target) {
        int output[] = new int[2];
        // Add values to hash map along with their indices
        HashMap<Integer, Integer> hashMap = addToHashMap(nums);
        
        // Go over the elements of the array and see if 2 elements add to target
        for(int i = 0; i<nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])) {
                int index = hashMap.get(target-nums[i]);
                if (index != i) {
                    output[0] = i;
                    output[1] = index;
                    return output;
                }
            }
        }
        return null;
    }
}