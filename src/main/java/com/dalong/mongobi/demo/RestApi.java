package com.dalong.mongobi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
    @Autowired
    CntArticleDAO cntArticleDAO;
    @RequestMapping("/cns")
    public  Object users(){
       return cntArticleDAO.search();
    }
}
