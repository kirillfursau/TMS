package myFirstProject.model;

import lessons.lesson11.DateUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrackedGame extends Game {
    private int gameId;
    private LocalDateTime localDateTime;

    public TrackedGame(RegisteredPlayer player1, RegisteredPlayer player2, Field field,
                       int gameId, LocalDateTime localDateTime) {
        super(player1, player2, field);
        setGameId(gameId);
        this.localDateTime = localDateTime;
    }

    @Override
    public Player getPlayer1() {
        return getPlayer1();
    }

    @Override
    public Player getPlayer2() {
        return getPlayer2();
    }

    @Override
    public Field getField() {
        return getField();
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }


}
