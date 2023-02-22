package com.study.board.controller;

import com.study.board.service.SuHeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Main {
    // 메인
    @GetMapping("/")
    public String goHome() {
        return "index";
    }

    // 우건희
    @GetMapping("/gunHee")
    public String gunHee() {
        return "/board/gunHeeBoard";
    }

    // 김준한
    @GetMapping("/junHan")
    public String junHan() {
        return "/board/junHanBoard";
    }

    // 나준영
    @GetMapping("/junYeong")
    public String junYeong() {
        return "/board/junYeongBoard";
    }

    // 양지우
    @GetMapping("/jiWoo")
    public String jiWoo() {
        return "/board/jiWooBoard";
    }

    // 임수헌
    @GetMapping("/suHeon")
    public String suHeon() {
        return "/board/suHeonBoard";
    }

    @Autowired
    SuHeonService suHeonService;
}
