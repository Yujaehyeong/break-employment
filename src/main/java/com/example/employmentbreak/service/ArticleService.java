package com.example.employmentbreak.service;

import com.example.employmentbreak.dto.Article;
import com.example.employmentbreak.repository.interfaces.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> selectArticles() {
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(e -> articles.add(e));
        return articles;
    }
}
