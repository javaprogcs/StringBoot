package com.csw.SpringBootTodo.sercice.impl;

import com.csw.SpringBootTodo.dao.LuntanDao;
import com.csw.SpringBootTodo.entity.Luntan;
import com.csw.SpringBootTodo.sercice.LuntanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LuntanServiceImpl implements LuntanService {

    @Autowired
    private LuntanDao luntanDao;

    @Override
    public List<Luntan> getList() {
        return luntanDao.findAll();
    }

    @Override
    public void insert(Luntan list) {
        luntanDao.save(list);
    }

    @Override
    public void del(Luntan id) {
        luntanDao.deleteById((long) 1);
    }


    @Override
    public void update(Luntan list) {

    }
}
