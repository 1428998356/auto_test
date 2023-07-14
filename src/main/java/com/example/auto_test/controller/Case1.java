package com.example.auto_test.controller;

import com.example.auto_test.dao.Case1Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class Case1 {

    @Autowired
    public Case1Bean case1Bean;

    @RequestMapping("/case1")
    @ResponseBody
    public Case1Bean getCase1(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("test_case1");
        arr.add("test_case2");
        case1Bean.setCaseName(arr);
        return case1Bean;
    }
}
