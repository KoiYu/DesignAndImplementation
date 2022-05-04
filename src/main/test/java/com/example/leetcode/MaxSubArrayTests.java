package com.example.leetcode;

import com.example.leetcode.easy.maxSubArray.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSubArrayTests {
    @Test
    void case1() {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       Solution s = new Solution();
       int actual = s.maxSubArray(nums);
       System.out.println(actual);
       Assertions.assertEquals(6, actual);
    }
    @Test
    void case2() {
        int[] nums = {1};
        Solution s = new Solution();
        int actual = s.maxSubArray(nums);
        System.out.println(actual);
        Assertions.assertEquals(1, actual);
    }
    @Test
    void case3() {
        int[] nums = {5,4,-1,7,8};
        Solution s = new Solution();
        int actual = s.maxSubArray(nums);
        System.out.println(actual);
        Assertions.assertEquals(23, actual);
    }
}