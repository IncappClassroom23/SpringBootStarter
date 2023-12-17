package com.example.sprintbootstarterapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Note {
    @Id
    private int id;
    private String content;

    public Note(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
