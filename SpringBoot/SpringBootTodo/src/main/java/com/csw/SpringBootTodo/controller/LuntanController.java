package com.csw.SpringBootTodo.controller;

import com.csw.SpringBootTodo.entity.Luntan;
import com.csw.SpringBootTodo.sercice.LuntanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LuntanController {

    @Autowired
    private LuntanService luntanService;

    @RequestMapping(value = "/luntan")
    public List<Luntan> getLuntan(Model model){
        List<Luntan> list = luntanService.getList();
        model.addAttribute(list);
        return list;
    }

    @GetMapping("/luntan/add")
    public String insert(){
        luntanService.insert(new Luntan());
        return "luntanya";
    }

    @GetMapping("/luntan/del")
    public String del(){
        luntanService.del(new Luntan());
        return "yijinshanchule";
    }

}
