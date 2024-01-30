package com.fxlt.test1.service.role;

import com.fxlt.test1.bean.module.RequestHoliday;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(1)
@Service
public class TeamLeader implements LeaveHandler{
    @Override
    public boolean dealHoliday(RequestHoliday requestHoliday) {
        if(requestHoliday.getDays() <= 3) {
            System.out.println("team chuli");
            return true;
        }
        return false;
    }
}
