package me.pinetreelch.springbootdeveloper.repository;


import me.pinetreelch.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogInterface extends JpaRepository<Article, Long> {

}
