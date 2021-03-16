package com.example.employmentbreak.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    String title;

    String contents;

    public Article() {
    }

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public Long getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}
