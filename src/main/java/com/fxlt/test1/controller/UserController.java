package com.fxlt.test1.controller;


import com.fxlt.test1.bean.module.RequestHoliday;
import com.fxlt.test1.service.HandleHoliday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private HandleHoliday holiday;

    @GetMapping("user")
    public Object getUser() {
        holiday.handleHoliday(new RequestHoliday(6));
        return null;
    }
}
