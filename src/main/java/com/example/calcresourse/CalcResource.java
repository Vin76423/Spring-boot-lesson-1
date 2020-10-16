package com.example.calcresourse;

import com.example.calcresourse.entity.Operation;
import com.example.calcresourse.service.CalcService;
import com.example.calcresourse.service.CalcServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calc")
public class CalcResource {

    private CalcService calcService;

    public CalcResource(CalcService calcService) {
        this.calcService = calcService;
    }

    @PostMapping
    public Operation calc(@RequestBody Operation operation) {
        return calcService.calc(operation);
    }
}
