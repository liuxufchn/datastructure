package sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @program: datastructure
 * @Date: 2020/12/17 16:36
 * @Author: Shaffer
 * @Description:
 */
final public class SortingTools {
    private SortingTools() {
    }

    public static Integer[] generateOrderedIntegerArray(int size) {
        Integer[] data = new Integer[size];
        for (int i = 0; i < size; i++) {
            data[i] = i;
        }
        return data;
    }

    public static Integer[] generateRandomIntegerArray(int size, int maxBound) {
        Integer[] data = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(maxBound) - random.nextInt(maxBound);
        }
        return data;
    }

    private static <E extends Comparable<E>> void assertSorted(E[] data) throws Exception {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1].compareTo(data[i]) > 0) {
                throw new Exception("未正确排序");
            }
        }
    }

    public static <E> void swap(E[] data, int i, int j) {
        if (data == null || data.length == 0) {
            return;
        }
        if (i != j && data.length <= 1) {
            return;
        }
        E tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;

    }

    private static class SortHandler implements InvocationHandler {
        private Object target;

        public SortHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.nanoTime();
            Object result = method.invoke(target, args);
            long endTime = System.nanoTime();
            double durTime = (endTime - startTime) / 1000000000.0;
            System.out.println("排序完成。耗时：" + durTime + "s。");
            return result;
        }
    }

    public static <E extends Comparable<E>> void testSorted(Sort<E> sort, E[] data) throws Exception {
        SortHandler handler = new SortHandler(sort);
        Object o = Proxy.newProxyInstance(sort.getClass().getClassLoader(), sort.getClass().getInterfaces(), handler);
        Sort<E> s = (Sort<E>) o;
        s.sort(data);
        assertSorted(data);
    }

}
