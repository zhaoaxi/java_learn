package com.fxlt.test1.service.role;

import com.fxlt.test1.bean.module.RequestHoliday;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(2)
@Service
public class   Manager implements LeaveHandler {

    @Override
    public boolean dealHoliday(RequestHoliday requestHoliday) {
        if(requestHoliday.getDays() <= 7) {
            System.out.println("manager chuli");
            return true;
        }
        return false;
    }
}
