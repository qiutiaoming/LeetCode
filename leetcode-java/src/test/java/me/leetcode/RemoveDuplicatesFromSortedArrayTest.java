package me.leetcode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    @Ignore
    public void testRemoveDuplicates() throws Exception {
        RemoveDuplicatesFromSortedArray rdfs = new RemoveDuplicatesFromSortedArray();
        int[] experted = {1, 2};
        int[] input = {1, 1, 2};
        int actual = rdfs.removeDuplicates(input);
        assertEquals("Should be same", experted.length, actual);
        //TODO: out put array is wrong,need to fix it
        assertEquals("Should be Equals", experted, input);
    }
}
