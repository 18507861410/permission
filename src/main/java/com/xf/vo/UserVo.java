package com.xf.vo;

public class UserVo {

    int[] ids;
    String name;
    int MinAge;
    int MaxAge;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinAge() {
        return MinAge;
    }

    public void setMinAge(int minAge) {
        MinAge = minAge;
    }

    public int getMaxAge() {
        return MaxAge;
    }

    public void setMaxAge(int maxAge) {
        MaxAge = maxAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }
}
