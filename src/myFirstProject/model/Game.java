package myFirstProject.model;

public class Game {
    Player player1;
    Player player2;
    Field field;

    public Game(Player player1, Player player2, Field field) {
        setPlayer1(player1);
        setPlayer2(player2);
        setField(field);
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
