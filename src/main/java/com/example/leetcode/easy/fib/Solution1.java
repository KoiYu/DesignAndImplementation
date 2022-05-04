package com.example.leetcode.easy.fib;

public class Solution1 {
    public int fib(int n){
        if(n < 2) {
            return n;
        }
        int a=0, b=0, ans=1;
        for(int i = 2; i <= n; i++) {
            a = b;
            b = ans;
            ans = a + b;
        }
        return ans;
    }
}
