package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testEx1() {
        Assert.assertEquals(60, s.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(90, s.solution(new int[]{-3, 1, 2, -2, -5, 6}));
    }
}
