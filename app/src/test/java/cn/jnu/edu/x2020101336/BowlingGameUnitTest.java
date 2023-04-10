package cn.jnu.edu.x2020101336;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void first_test()
    {
        BowlingGame game = new BowlingGame();
        for(int i = 1; i < 11; i++)
            game.roll(4);
        assertEquals(4,game.score());
    }
}