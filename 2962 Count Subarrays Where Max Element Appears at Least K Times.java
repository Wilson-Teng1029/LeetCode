//2962. Count Subarrays Where Max Element Appears at Least K Times

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxInt = Arrays.stream(nums).max().getAsInt(); // 
        int numsLength = nums.length;
        long conbination = 0;
        int cnt = 0, j = 0;
        for (int i : nums) {
            // 找到max數量=k時，直接將右邊數字全包，因為代表都符合
            while (j < numsLength && cnt < k) {
                cnt += nums[j++] == maxInt ? 1 : 0;
            }
            //完全無法大於K代表此陣列中最大值的數不夠多
            if (cnt < k) {
                break;
            }
            conbination += numsLength - j + 1;
            // 若i還沒到最大，左端點往右移一位
            cnt -= i == maxInt ? 1 : 0;
        }
        return conbination;
    }
}
