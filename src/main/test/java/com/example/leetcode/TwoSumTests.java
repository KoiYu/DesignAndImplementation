package com.example.leetcode;

import com.example.leetcode.easy.twoSum.Solution1;
import com.example.leetcode.easy.twoSum.Solution2;
import com.example.leetcode.easy.twoSum.Solution3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTests {
    @Test
    void case1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution1 s = new Solution1();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case2() {
        int[] nums = {3,2,4};
        int target = 6;
        Solution1 s = new Solution1();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{1, 2}), actual);
    }
    @Test
    void case3() {
        int[] nums = {3,3};
        int target = 6;
        Solution1 s = new Solution1();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case4() {
        int[] nums = {3,3,5,7};
        int target = 7;
        Solution1 s = new Solution1();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{}), actual);
    }
    @Test
    void case5() {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution2 s = new Solution2();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case6() {
        int[] nums = {3,2,4};
        int target = 6;
        Solution2 s = new Solution2();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{1, 2}), actual);
    }
    @Test
    void case7() {
        int[] nums = {3,3};
        int target = 6;
        Solution2 s = new Solution2();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case8() {
        int[] nums = {3,3,5,7};
        int target = 7;
        Solution2 s = new Solution2();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{}), actual);
    }
    @Test
    void case9() {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution3 s = new Solution3();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case10() {
        int[] nums = {2,3,4};
        int target = 6;
        Solution3 s = new Solution3();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 2}), actual);
    }
    @Test
    void case11() {
        int[] nums = {3,3};
        int target = 6;
        Solution3 s = new Solution3();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{0, 1}), actual);
    }
    @Test
    void case12() {
        int[] nums = {3,3,5,7};
        int target = 7;
        Solution3 s = new Solution3();
        int[] array = s.twoSum(nums, target);
        String actual = Arrays.toString(array);
        System.out.println(actual);
        Assertions.assertEquals(Arrays.toString(new int[]{}), actual);
    }
}
