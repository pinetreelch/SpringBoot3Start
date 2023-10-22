package me.pinetreelch.springbootdeveloper.repository;


import me.pinetreelch.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
