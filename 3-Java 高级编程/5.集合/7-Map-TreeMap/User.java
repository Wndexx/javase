package com.wndexx.java;

import java.util.Objects;

/**
 * @author wndexx
 * @create 2022-03-02 11:23
 */
public class User implements Comparable {
    private String name;
    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals() ...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() { // return name.hashCode() + age;
        return Objects.hash(name, age);
    }

    // 按照姓名从大到小排列，年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof User))
            throw new RuntimeException("输入的类型不匹配");
        User u = (User) o;
        int compare = -this.name.compareTo(u.name);
        return compare == 0 ? Integer.compare(this.age, u.age) : compare;
    }
}
