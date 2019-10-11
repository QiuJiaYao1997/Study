package com.springboot.controller;

import com.springboot.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userlist {

    @RequestMapping("showUser")
     public String show(Model model){
        List<user> list = new ArrayList<>();
        list.add(new user(1,"zhang","zhang"));
        list.add(new user(1,"aa","aa"));
        list.add(new user(1,"li","li"));

        model.addAttribute("list",list);
        return "userlist";
    }


}
