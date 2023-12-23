package com.example.sprintbootstarterapp;

import com.example.sprintbootstarterapp.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class SampleRunner implements CommandLineRunner {

    // field Injection
    @Autowired
    JdbcTemplate jdbcTemplate;

//    Constructor injection
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public SampleRunner(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

//    Setter Injection
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("sample print");
        //jdbcTemplate.update("insert into note (content) values (?)","st3");
        List<Note> note = jdbcTemplate.query("SELECT * from note where content = ?", new Object[]{"sample data"},new BeanPropertyRowMapper<>(Note.class));
        System.out.println(note.size());
    }
}
