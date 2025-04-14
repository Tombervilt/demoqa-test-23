import org.junit.jupiter.api.*;


public class SimpleJUnitTest {
    int result;

    @BeforeEach
        void nameOfBeforeEach() {
        System.out.println("###   beforeEach()");
        result = getResult();
    }

    @AfterEach
    void nameOfAfterEach() {
        System.out.println("###   afterEach()\n");
        result = 0;
    }

    @BeforeAll
    static void nameOfBeforeAll() {
        System.out.println("###   beforeAll()\n");
    }

    @AfterAll
    static void nameOfAfterAll() {
        System.out.println("###   afterAll()\n");
    }

    @Test
    void firstTest() {
        System.out.println("###     firstTest()");
        Assertions.assertTrue(result > 2);

    }

    @Test
    void secondTest() {
        System.out.println("###     secondTest()");
        Assertions.assertTrue(result > 2);

    }

    @Test
    void thirdTest() {
        System.out.println("###     thirdTest()");
        Assertions.assertTrue(result > 2);

    }

    private int getResult() {
        return 3;
    }
/*class YahooSearchTest {
        @Test
        void successfulSearchTest() {
            open("https://ru.search.yahoo.com/");
            $("[name=p]").setValue("Джун жестко тестит прод смотреть онлайн без смс и регистрации").pressEnter();
            $("[id=bd]").shouldHave(text("rutube.ru"));
            sleep(10000);

        }*/
}
