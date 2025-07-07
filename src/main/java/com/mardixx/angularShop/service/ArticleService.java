package com.mardixx.angularShop.service;

import com.mardixx.angularShop.model.Article;
import com.mardixx.angularShop.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository  articleRepository;

    public Article save(Article article) {
        return articleRepository.save(article);
    }

    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    public void deleteById(Long id) {
        if (articleRepository.existsById(id)) {
            articleRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("Article could not be found with Id: " + id);
        }
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
