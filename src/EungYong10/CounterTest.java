package EungYong10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    // UpCounter 테스트
    @Test
    public void testGetCount() {
        UpCounter counter = new UpCounter();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testSetCount() {
        UpCounter counter = new UpCounter();
        counter.setCount(10);
        assertEquals(10, counter.getCount());
    }

    @Test
    public void testCount() {
        UpCounter counter = new UpCounter();
        assertEquals(0, counter.count());
        assertEquals(1, counter.count());
        assertEquals(2, counter.count());
    }

    // DownCounter 테스트
    @Test
    public void testGetCount1() {
        DownCounter counter = new DownCounter();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testSetCount1() {
        DownCounter counter = new DownCounter();
        counter.setCount(10);
        assertEquals(10, counter.getCount());
    }

    @Test
    public void testCount1() {
        DownCounter counter = new DownCounter();
        assertEquals(0, counter.count());
        assertEquals(-1, counter.count());
        assertEquals(-2, counter.count());
    }


}
