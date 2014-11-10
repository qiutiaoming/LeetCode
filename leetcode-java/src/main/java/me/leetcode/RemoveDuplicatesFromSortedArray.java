package me.leetcode;

import java.util.Arrays;

/**
 * @Author: qiutiaoming on 14-11-9.
 * @E-mail: qtm315@qq.com
 * <p/>
 * Given a sorted array,remove the duplicates in place such that each element appear only once
 * and return the new length.
 * Do not allocate extra space for anthor array,you must do this in place with constant memory.
 * For example,Given input array  A = [1,1,2]
 * Your function should return length = 2,and A is now [1,2].
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] a) {
        if (a.length == 0) {
            return 0;
        } else if (a.length == 1) {
            return 1;
        } else {
            int ret = 1;
            int index = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] != a[i]) {
                    ret++;
                    a[++index] = a[i];
                }
            }
            //TODO: need to resize this array,
            // but java cannot do this without create one new array
            //System.arraycopy(a, 0, a, 0, index );
            return ret;
        }
    }
}
