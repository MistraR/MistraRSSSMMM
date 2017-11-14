package com.sm.controller;

import com.sm.po.User;
import com.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mistra.WR on 2017/11/10/010.
 */
@Controller
@RequestMapping("/userAdd")
public class UserAddController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userAdd.do")
    public String UserAdd(User user, Model model){
        System.out.println(user.toString());
        if(userService.insertSelective(user)>0){
            model.addAttribute("successMsg", "注册成功！");
            model.addAttribute("name", user.getUsername());
            return "/success";//返回的页面
        }else{
            model.addAttribute("failMsg", "注册失败！");
            return "/fail";
        }
    }
}
