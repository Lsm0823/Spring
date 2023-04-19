package com.example.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller // Component 이다.

public class TempController {


    private Robot robot;

    public TempController(Robot robot) {
        this.robot = robot;
    }

    @GetMapping
    @ResponseBody
    public String temp() throws JsonProcessingException {
        System.out.println(robot.toString());
        return "안녕하세요1";
    }
}
