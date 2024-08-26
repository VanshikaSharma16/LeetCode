class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        return arr;
    }
    
    private int findFirst(int[] nums, int target) {
        int strt = 0, end = nums.length - 1;
        int index = -1;
        while (strt <= end) {
            int mdl = (strt + end) / 2;
            if (nums[mdl] >= target) {
                end = mdl - 1; 
            } else {
                strt = mdl + 1; 
            }
            if (nums[mdl] == target) {
                index = mdl; 
            }
        }
        return index;
    }
    
    private int findLast(int[] nums, int target) {
        int strt = 0, end = nums.length - 1;
        int index = -1;
        while (strt <= end) {
            int mdl = (strt + end) / 2;
            if (nums[mdl] <= target) {
                strt = mdl + 1; 
            } else {
                end = mdl - 1; 
            }
            if (nums[mdl] == target) {
                index = mdl; 
            }
        }
        return index;
    }
}
