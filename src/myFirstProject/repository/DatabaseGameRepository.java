package myFirstProject.repository;

import myFirstProject.model.TrackedGame;

import java.sql.*;

public class DatabaseGameRepository implements GameRepository {
    @Override
    public TrackedGame saveGame(TrackedGame trackedGame) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/XO_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("REPLACE INTO games SET x_user = '" + trackedGame.getPlayer1().getName()
                    + "',o_user = '" + trackedGame.getPlayer2().getName() + "', id = " + trackedGame.getGameId()
                    + ",time = '" + trackedGame.getLocalDateTime() + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trackedGame;
    }
}

