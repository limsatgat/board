package com.study.board.service;

import com.study.board.dao.SoHeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoHeeService {

    @Autowired
    SoHeeDao soHeeDao;
}
