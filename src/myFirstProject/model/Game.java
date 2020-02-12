package myFirstProject.model;

public abstract class Game {
    public Player player1;
    public Player player2;
    public Field field;

    public Game(Player player1, Player player2, Field field) {
        this.player1 = player1;
        this.player2 = player2;
        this.field = field;
    }

    public abstract Player getPlayer1();

    public abstract Player getPlayer2();

    public abstract Field getField();

}
