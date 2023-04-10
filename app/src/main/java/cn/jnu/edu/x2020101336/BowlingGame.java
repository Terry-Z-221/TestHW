package cn.jnu.edu.x2020101336;public class BowlingGame {
    private int score = 0;

    public void roll(int pin) {
        score += pin;
    }

    public int score() {
        return score;
    }

}
