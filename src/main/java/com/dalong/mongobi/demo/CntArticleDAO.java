package com.dalong.mongobi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CntArticleDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Map<String, Object>> search() {
        String sql = "select * from cntArticle";
        return   jdbcTemplate.queryForList(sql);
    }
}
