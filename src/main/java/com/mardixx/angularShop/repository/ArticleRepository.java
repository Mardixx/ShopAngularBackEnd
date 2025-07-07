package com.mardixx.angularShop.repository;

import com.mardixx.angularShop.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Override
    List<Article> findAll();

    @Override
    List<Article> findAllById(Iterable<Long> ids);

    @Override
    <S extends Article> S save(S entity);

    @Override
    Optional<Article> findById(Long id);

    @Override
    void deleteById(Long id);

    @Override
    void deleteAll();
}
