package com.csw.SpringBootTodo.sercice;

import com.csw.SpringBootTodo.entity.Luntan;

import java.util.List;

public interface LuntanService {
    List<Luntan> getList();
    void insert(Luntan list);
    void del(Luntan list);
    void update(Luntan list);
}
