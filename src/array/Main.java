package array;

import linearsearch.Student;

/**
 * @program: datastructure
 * @Date: 2020/12/19 18:00
 * @Author: Shaffer
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        MyArray<Integer> arr = new MyArray<>(10);
        arr.add(0, 2);
        arr.addLast(1);
        System.out.println(arr);
        System.out.println(arr.getSize());
        for (int i = 0; i < 20; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        MyArray<Student> s = new MyArray<>();
        s.addLast(new Student("aaa"));
        s.addLast(new Student("bbb"));
        s.addLast(new Student("ccc"));
        System.out.println(s);

    }
}
