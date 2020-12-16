package org.datastructure.linearsearch;

/**
 * @program: datastructure
 * @Date: 2020/12/16 17:08
 * @Author: Shaffer
 * @Description:
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static int[] generateOrderedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
