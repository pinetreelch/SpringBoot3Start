package me.pinetreelch.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.pinetreelch.springbootdeveloper.domain.Article;
import me.pinetreelch.springbootdeveloper.dto.AddArticleRequest;
import me.pinetreelch.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request)
    {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }

}
