package com.xf.vo;

import java.util.List;

public class UserListVo<userId> {


    List<Integer> list;



    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserListVo{" +
                " list=" + list +
                '}';
    }
}
