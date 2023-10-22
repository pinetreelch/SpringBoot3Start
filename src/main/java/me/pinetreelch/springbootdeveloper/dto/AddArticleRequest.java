package me.pinetreelch.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.pinetreelch.springbootdeveloper.domain.Article;

@NoArgsConstructor //기복 생성자 추가
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {
    //DTO는 계층끼리 데이터를 교환하기 위해 사용하는 객체
    //dto -> controller -> service -> (serviceImpl) -> (dao) -> mapper -> xml

    private String title;
    private String content;

    public Article toEntitiy()
    {
        //생성자를 사용해 객체 생성

        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
