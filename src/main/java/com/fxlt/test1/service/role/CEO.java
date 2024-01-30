package com.fxlt.test1.service.role;

import com.fxlt.test1.bean.module.RequestHoliday;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(3)
@Service
public class CEO implements LeaveHandler{
    @Override
    public boolean dealHoliday(RequestHoliday requestHoliday) {
        System.out.println("ceo chuli");
        return true;
    }
}
