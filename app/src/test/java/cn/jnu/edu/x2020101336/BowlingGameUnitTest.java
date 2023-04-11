package cn.jnu.edu.x2020101336;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void first_test()
    {
        BowlingGame game = new BowlingGame();
        for(int i = 1; i < 11; i++)
            game.roll(4);
        assertEquals(4,game.score());
    }

    private void roll_second_test(int n) {
        for(int i = 1; i < n; i++)
            if(i % 2 == 0) game.roll(2);
            else game.roll(1);
    }

    @Test
    public void second_test()
    {
        roll_second_test(11);
        assertEquals(15, game.score());
    }

    private void roll_spare() {
        game.roll(7);
        game.roll(3);
    }

    @Test
    public void third_test()
    {
        roll_spare();
        game.roll(4);
        roll_second_test(11);
        assertEquals(33, game.score());
    }

    @Test
    public void fourth_test()
    {
        game.roll(10); // strike
        roll_spare();
//        game.roll(7);
//        game.roll(3);
        game.roll(8);
        assertEquals(46, game.score());
    }
}