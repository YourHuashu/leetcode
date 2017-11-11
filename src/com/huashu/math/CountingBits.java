package com.huashu.math;

public class CountingBits {

    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;

        int base = 1;//末尾为1的情况
        while(base <= num){
            int next = base * 2;//下一个末尾全为0的值
            for(int i = base;i<next && i<=num;i++){
                res[i] = res[i-base]+1;
            }
            base = next;
        }
        return res;
    }
}
