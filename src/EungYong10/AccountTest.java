package EungYong10;

public class AccountTest {

    public static void main(String[] args) {
        testInit();
    }

    public static void testInit() {
        System.out.println("==== 테스트 시작 ====");
        Account account = new Account("홍길동", 30000);
        System.out.println(account);
    }
}
