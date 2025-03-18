package com.test.JournalApp.entity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalEntry {

    private
        long id;
        String title;
        String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
