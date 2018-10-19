package application.service;

import application.dao.ArticleRepository;
import application.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServise {

    @Autowired
    private ArticleRepository repository;

    public void save(Article article){
        repository.save(article);
    }
}

