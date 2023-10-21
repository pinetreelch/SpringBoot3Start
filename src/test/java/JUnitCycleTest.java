//import org.junit.Test;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll  //전체 테스트를 실행하기 전에 1회 실행하므로 메서드는 static으로 선언, static은 무엇인가? 한번실행한다고 할떄?
    static void beforeAll()
    {
        System.out.println("@BeforeAll실행");
    }

    @BeforeEach //테스트케이스를 시작하기 전마다 실행
    public void beforeEach()
    {
        System.out.println("@BeforeEach 실행");
    }

    @Test
    public void test1()
    {
        System.out.println("test1");
    }

    @Test
    public void test2()
    {
        System.out.println("test2");
    }

    @Test
    public void test3()
    {
        System.out.println("test3");
    }

    @AfterAll // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
    static void afterAll()
    {
        System.out.println("@AfterAll");
    }

    @AfterEach  // 테스트케이스를 종료하기 전마다 실행
    public void afterEach()
    {
        System.out.println("@AfterEach");
    }
}
