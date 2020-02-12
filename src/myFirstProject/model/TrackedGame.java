package myFirstProject.model;

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

    public LocalDateTime getLocalDateTime() {
        return localDateTime.now();
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }


}
