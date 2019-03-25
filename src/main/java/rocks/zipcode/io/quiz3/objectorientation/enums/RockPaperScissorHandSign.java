package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK("rock"),
        PAPER("paper"),
            SCISSOR("scissor");

    private String sign;

    RockPaperScissorHandSign(String sign) {
        this.sign =sign;

    }

    public RockPaperScissorHandSign getWinner() {
        if (this.name().equals("ROCK")) {
            return PAPER;
        } else if (this.name().equals("PAPER")) {
            return SCISSOR;
        } else

            return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if (this.name().equals("ROCK")) {
            return SCISSOR;
        } else if (this.name().equals("PAPER")) {
            return ROCK;
        } else

            return PAPER;
    }
}
