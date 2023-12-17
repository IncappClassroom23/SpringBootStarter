package com.example.sprintbootstarterapp;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

//@Component
public class EmailRunner implements CommandLineRunner {

    @Autowired
    JavaMailSender javaMailSender;

    @Override
    public void run(String... args) throws Exception {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setText("hello world");
        simpleMailMessage.setTo("incappclassroom23@gmail.com");
        simpleMailMessage.setFrom("anukooltiwari98@gmail.com");
        simpleMailMessage.setSubject("Test");
        javaMailSender.send(simpleMailMessage);
    }
}
