import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class lesson6HwTestTask2 {
    lesson6Hw dz;

    @Before
    public void setUp() throws Exception {
        dz = new lesson6Hw();
    }

    @Test
    public void task2_empty_array() {
        Assert.assertFalse(dz.task2(new int[]{}));
    }
    @Test
    public void task2_correct_array() {
        Assert.assertTrue(dz.task2(new int[]{1, 4}));
    }
    @Test
    public void task2_not_correct_array() {
        Assert.assertFalse(dz.task2(new int[]{1, 2, 3}));
    }
    @Test
    public void task2_double_correct_array() {
        Assert.assertTrue(dz.task2(new int[]{1,1,4,4}));
    }
    @Test
    public void task2_only_4() {
        Assert.assertFalse(dz.task2(new int[]{4,4}));
    }
}