package com.study.board.service;

import com.study.board.dao.JunYeongDao;
import com.study.board.dao.SuHeonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JunHanService {

    @Autowired
    JunYeongDao junHanDao;
}
