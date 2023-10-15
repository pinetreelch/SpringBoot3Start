package me.pinetreelch.springbootdeveloper;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //테스트용 애플리케이션 컨텍스트 생성   // 어플리케이션 컨텍스트란?
@AutoConfigureMockMvc   //MockMvc 생성 및 자동구성 //
class TestControllerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext context;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    public void mockMvcSetup()
    {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach  // 테스트 실행 후 실행하드 테스트
    public void cleanup()
    {
        memberRepository.deleteAll();
    }
}