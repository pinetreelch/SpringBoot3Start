package me.pinetreelch.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import java.lang.reflect.Member; ==> 이거 왜 에러남?????????????????
import java.util.List;

@Service
public class TestService {

    @Autowired
   MemberRepository memberRepository;

    public List<Member> getAllMembers()
    {
        return memberRepository.findAll();  // --> findAll머임?? 어디있음? 그래도 대충 뭔지는 알아할듯?
    }
}