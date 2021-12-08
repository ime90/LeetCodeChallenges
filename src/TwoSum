/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<num.length;i++) {
            if (map.containsKey(target - num[i])) {
                ans[1] = i;
                ans[0] = map.get(target - num[i]);
                return ans;
            }
            map.put(num[i], i);
        }
        return ans;
    }
}