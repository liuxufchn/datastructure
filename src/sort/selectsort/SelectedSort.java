package sort.selectsort;

import sort.Sort;
import sort.SortingTools;

/**
 * @program: datastructure
 * @Date: 2020/12/17 17:12
 * @Author: Shaffer
 * @Description:
 */
public class SelectedSort<E extends Comparable<E>> implements Sort<E> {

    /**
     * 选择排序
     *
     * @param data
     */
    @Override
    public void sort(E[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            SortingTools.swap(data, min, i);
        }
    }

    public static void main(String[] args) throws Exception {
        int size = 10000;
        Integer[] data = SortingTools.generateRandomIntegerArray(size, 10000);
        SortingTools.testSorted(new SelectedSort<>(), data);
        data = SortingTools.generateOrderedIntegerArray(size);
        SortingTools.testSorted(new SelectedSort<>(), data);

    }
}
