package org.datastructure.sort.insertsort;

import org.datastructure.sort.Sort;
import org.datastructure.sort.SortingTools;

/**
 * @program: datastructure
 * @Date: 2020/12/17 18:11
 * @Author: Shaffer
 * @Description:
 */
public class InsertSort<E extends Comparable<E>> implements Sort<E> {

    @Override
    public void sort(E[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        for (int i = 1; i < data.length; i++) {
            E tmp = data[i];
            int j;
            for (j = i; j > 0 && tmp.compareTo(data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }
            data[j] = tmp;
        }
    }

    public static void main(String[] args) throws Exception {
        int size = 10000;
        Integer[] data = SortingTools.generateRandomIntegerArray(size, 10000);
        SortingTools.testSorted(new InsertSort<>(), data);
        data = SortingTools.generateOrderedIntegerArray(size);
        SortingTools.testSorted(new InsertSort<>(), data);
    }
}
