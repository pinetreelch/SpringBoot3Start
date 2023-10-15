package me.pinetreelch.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository    // 근데 이것도 까보면 @component -> 빈주입
public interface MemberRepository extends JpaRepository<Member, Long>
{
    // 인터페이스? 정확히 쉽게 설명 가능하게 이해가 필요할듯?
    // 빈으로 주입하는거랑 extends 한거 차이?
}

