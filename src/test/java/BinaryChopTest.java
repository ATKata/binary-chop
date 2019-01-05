import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryChopTest {

    private BinaryChop binaryChop;

    @Before
    public void setup() {
        binaryChop = new BinaryChop();
    }

    @Test
    public void test1() {
        assertThat(binaryChop.chop(3, new int[]{})).isEqualTo(-1);
    }

    @Test
    public void test2() {
        assertThat(binaryChop.chop(3, new int[]{1})).isEqualTo(-1);
    }

    @Test
    public void test3() {
        assertThat(binaryChop.chop(1, new int[]{1})).isEqualTo(0);
    }

    @Test
    public void test4() {
        assertThat(binaryChop.chop(1, new int[]{1, 3, 5})).isEqualTo(0);
    }

    @Test
    public void test5() {
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5})).isEqualTo(1);
    }

    @Test
    public void test6() {
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5})).isEqualTo(2);
    }

    @Test
    public void test7() {
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5})).isEqualTo(-1);
    }

    @Test
    public void test8() {
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5})).isEqualTo(-1);
    }

    @Test
    public void test9() {
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5})).isEqualTo(-1);
    }

    @Test
    public void test10() {
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5})).isEqualTo(-1);
    }

    @Test
    public void test11() {
        assertThat(binaryChop.chop(1, new int[]{1, 3, 5, 7})).isEqualTo(0);
    }

    @Test
    public void test12() {
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5, 7})).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5, 7})).isEqualTo(2);
    }

    @Test
    public void test14() {
        assertThat(binaryChop.chop(7, new int[]{1, 3, 5, 7})).isEqualTo(3);
    }

    @Test
    public void test15() {
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    public void test16() {
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    public void test17() {
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    public void test18() {
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    public void test19() {
        assertThat(binaryChop.chop(8, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }
}

