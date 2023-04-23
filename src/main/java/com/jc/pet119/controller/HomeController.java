package com.jc.pet119.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/test")
    public Map testCall() {
        Map testMap = new HashMap<String,String>();
        testMap.put("test-key", "test-value");
        return testMap;
    }

}
