package linearsearch;

/**
 * @program: datastructure
 * @Date: 2020/12/16 15:55
 * @Author: Shaffer
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Integer[] data = {1, 3, 4, 5, 6, 2, 11};
        int index = LinearSearch.search(data, 2);
        System.out.println("index = " + index);

        Student[] students = {new Student("zhangsan"), new Student("lisi"), new Student("wangwu")};
        index = LinearSearch.search(students, new Student("wangwu"));
        System.out.println("index = " + index);

        int n = 10000000;
        int[] arr = ArrayGenerator.generateOrderedArray(n);
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            LinearSearch.search(args, n);
        }
        long endTime = System.nanoTime();
        double durTime = (endTime - startTime) / 1000000000.0;

        System.out.println("durTime = " + durTime + " s.");

    }
}
