package me.pinetreelch.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder // 필더 패턴임
    public Article(String title, String content)
    {
        this.title      = title;
        this.content    = content;
    }

    //빌더 패턴을 사용해서 필요 없어짐;
//    protected Article(){ /* 기본 생성자 */ }
//
//    // Getter
//    public long getId(){
//        return id;
//    }
//
//    public String getTitle(){
//        return title;
//    }
//
//    public String getContent(){
//        return content;
//    }


}
