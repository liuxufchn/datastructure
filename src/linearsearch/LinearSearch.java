package linearsearch;

/**
 * @program: datastructure
 * @Date: 2020/12/16 15:51
 * @Author: Shaffer
 * @Description:
 */
public class LinearSearch {

    private LinearSearch() {}

    public static <E> int search(E[] data, E element) {
        if (null == data || data.length == 0) {
            return -1;
        }

        for (int i = 0; i < data.length; ++i) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
