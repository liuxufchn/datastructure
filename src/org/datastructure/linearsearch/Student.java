package org.datastructure.linearsearch;

import java.util.Objects;

/**
 * @program: datastructure
 * @Date: 2020/12/16 15:59
 * @Author: Shaffer
 * @Description:
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return this.name.equalsIgnoreCase(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
