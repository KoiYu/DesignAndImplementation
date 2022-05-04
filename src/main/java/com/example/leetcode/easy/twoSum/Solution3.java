package com.example.leetcode.easy.twoSum;

import java.util.Arrays;

public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        // 数组有序可用
        int len = nums.length;
        int i = 0;
        int j = len-1;
        while (i < j){
            if (nums[i] + nums[j] > target){
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] == target) {
                return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
