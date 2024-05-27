package com.busanit501.spring_me.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lunchMenu")
@Log4j2
public class lunchController {
    @RequestMapping("list")
    public void lunchTest() {
        log.info("lunch 조회 화면입니다");
    }

    @GetMapping("/register")
    public void registerGetTest() {
        log.info("todo register 등록 화면 Get  테스트 콘솔");
    }

    @PostMapping("/register")
    public void registerPostTest() {
        log.info("todo register 등록 화면 Post 테스트 콘솔");
    }

}
