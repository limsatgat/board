package com.study.board.service;

import com.study.board.dao.JunYeongDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JunYeongService {

    @Autowired
    JunYeongDao junYeongDao;
}
