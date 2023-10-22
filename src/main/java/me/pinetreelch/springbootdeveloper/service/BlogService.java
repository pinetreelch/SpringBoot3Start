package me.pinetreelch.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.pinetreelch.springbootdeveloper.domain.Article;
import me.pinetreelch.springbootdeveloper.dto.AddArticleRequest;
import me.pinetreelch.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntitiy());
    }
}
