import Tests.*;

public class Tests {

    @BeforeSuite
    public void initialize() {
        System.out.println("Инициализация прошла успешно");
    }

    @Test(priority = 6)
    public void test1() {
        System.out.println("Запущен тест №1");
    }

    @Test(priority = 5)
    public void test2() {
        System.out.println("Запущен тест №2");
    }

    @Test(priority = 7)
    public void test3() {
        System.out.println("Запущен тест №3");
    }

    @Test(priority = 1)
    public void test4() {
        System.out.println("Запущен тест №4");
    }


    @AfterSuite
    public void end() {
        System.out.println("Завершение работы");
    }

}