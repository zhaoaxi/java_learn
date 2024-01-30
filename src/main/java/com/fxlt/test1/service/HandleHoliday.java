package com.fxlt.test1.service;


import com.fxlt.test1.bean.module.RequestHoliday;
import com.fxlt.test1.service.role.LeaveHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HandleHoliday {

    @Autowired
    private List<LeaveHandler> list = new ArrayList<>();

    public  void handleHoliday(RequestHoliday requestHoliday) {

        for (LeaveHandler leaveHandler : list) {
            boolean b = leaveHandler.dealHoliday(requestHoliday);
            if(b == true) {
                break;
            }
        }
    }
}
