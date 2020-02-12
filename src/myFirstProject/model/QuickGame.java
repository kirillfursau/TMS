package myFirstProject.model;

public class QuickGame extends Game {
    public QuickGame(NotRegisteredPlayer player1, NotRegisteredPlayer player2, Field field) {
        super(player1, player2, field);
    }

    @Override
    public Player getPlayer1() {
        return player1;
    }

    @Override
    public Player getPlayer2() {
        return player2;
    }

    @Override
    public Field getField() {
        return field;
    }
}
