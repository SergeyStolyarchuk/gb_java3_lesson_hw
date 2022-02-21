import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private lesson6Hw dz;

    @Before
    public void prepare(){
        dz = new lesson6Hw();
    }

    @Test(expected = RuntimeException.class)
    public void test_1_empty_array(){
        dz.task1(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void test_1_without_4(){
        dz.task1(new int[]{1, 2, 3, 5});
    }
    @Test
    public void test_1_4_not_last(){
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(new int[]{5, 6, 7}, dz.task1(data));
    }
    @Test
    public void test_1_with_some_4(){
        int[] data = {1, 2, 3, 4, 5, 6, 7, 4};
        Assert.assertArrayEquals(new int[]{}, dz.task1(data));
    }
}