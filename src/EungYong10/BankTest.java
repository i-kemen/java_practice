package EungYong10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BankTest {

    // 내 처음 코드
    // @Test(expected = IllegalArgumentException.class)
    // public void test() {
    // Bank bank = new Bank("하나은행");
    // }

    // 수정 코드
    // 1. setName 메소드가 정상적으로 작동하여 이름이 변경된 Bank 인스턴스가
    // 반환되는지 확인하는 것입니다.
    @Test
    public void testSetName_valid() {
        Bank bank = new Bank("신한은행");
        bank.setName("하나은행");

        assertEquals("하나은행", bank.getName());
    }

    @Test
    public void testSetName_invalid() {
        Bank bank = new Bank("하나은행");

        assertThrows(IllegalArgumentException.class, () -> bank.setName("하나"));
    }
}
