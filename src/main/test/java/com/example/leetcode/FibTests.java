package com.example.leetcode;

import com.example.leetcode.easy.fib.Solution1;
import com.example.leetcode.easy.fib.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibTests {
    @Test
    void case1() {
        int n = 0;
        Solution1 s = new Solution1();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(0,actual);
    }
    @Test
    void case2() {
        int n = 1;
        Solution1 s = new Solution1();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(1,actual);
    }
    @Test
    void case3() {
        int n = 2;
        Solution1 s = new Solution1();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(1,actual);
    }
    @Test
    void case4() {
        int n = 3;
        Solution1 s = new Solution1();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(2,actual);
    }
    @Test
    void case5() {
        int n = 4;
        Solution1 s = new Solution1();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(3,actual);
    }
    @Test
    void case6() {
        int n = 0;
        Solution2 s = new Solution2();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(0,actual);
    }
    @Test
    void case7() {
        int n = 1;
        Solution2 s = new Solution2();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(1,actual);
    }
    @Test
    void case8() {
        int n = 2;
        Solution2 s = new Solution2();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(1,actual);
    }@Test
    void case9() {
        int n = 3;
        Solution2 s = new Solution2();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(2,actual);
    }@Test
    void case10() {
        int n = 4;
        Solution2 s = new Solution2();
        int actual = s.fib(n);
        System.out.println(actual);
        Assertions.assertEquals(3,actual);
    }
}
