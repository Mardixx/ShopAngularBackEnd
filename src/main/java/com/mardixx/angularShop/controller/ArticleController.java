package com.mardixx.angularShop.controller;

import com.mardixx.angularShop.model.Article;
import com.mardixx.angularShop.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Article saveArticle(@RequestBody Article article) {
        return articleService.save(article);
    }

    @GetMapping("/{id}")
    public Optional<Article> findArticleById(@PathVariable Long id) {
        return articleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticleById(@PathVariable Long id) {
        articleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.findAll();
    }

    @PutMapping("/{id}")
    public Article updateArticle(@RequestBody Article article, @PathVariable Long id) {
        Optional<Article> foundArticle = articleService.findById(id);
        if (foundArticle.isPresent()) {
            foundArticle = Optional.ofNullable(article);
            return articleService.save(foundArticle.get());
        }
        throw new RuntimeException("Could not find Article with id: " + id);
    }
}
