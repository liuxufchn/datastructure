package org.datastructure.sort;

/**
 * @program: datastructure
 * @Date: 2020/12/17 17:08
 * @Author: Shaffer
 * @Description:
 */
public interface Sort<E extends Comparable<E>> {
    /**
     * 排序方法
     * @param data
     */
    void sort(E[] data);
}
