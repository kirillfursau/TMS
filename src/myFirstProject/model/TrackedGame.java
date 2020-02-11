package myFirstProject.model;

import lessons.lesson11.DateUtils;

public class TrackedGame extends Game {
    private int gameId;
    private DateUtils dateUtils;

    public TrackedGame(RegisteredPlayer player1, RegisteredPlayer player2, Field field,
                       int gameId, DateUtils dateUtils) {
        super(player1, player2, field);
        setGameId(gameId);
        setDateUtils(dateUtils);
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

    public DateUtils getDateUtils() {
        return dateUtils;
    }

    public void setDateUtils(DateUtils dateUtils) {
        this.dateUtils = dateUtils;
    }
}
