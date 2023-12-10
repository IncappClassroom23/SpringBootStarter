package com.example.sprintbootstarterapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements CommandLineRunner {

    // field injector
//    @Autowired
//    JdbcTemplate jdbcTemplate;

//    Constructor injection
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public SampleRunner(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

//    Setter Injection
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("sample print");
        jdbcTemplate.update("insert into note (content) values (?)","st3");
    }
}
