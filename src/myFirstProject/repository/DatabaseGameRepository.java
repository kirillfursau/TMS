package myFirstProject.repository;

import myFirstProject.model.TrackedGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseGameRepository implements GameRepository {
    @Override
    public TrackedGame saveGame(TrackedGame trackedGame) {
        try {
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/XO_schema", "root", "rootroot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO games VALUES ('" + trackedGame.getPlayer1().getName() + "','"
                    + trackedGame.getPlayer2().getName() + "'," + trackedGame.getGameId() + ",'"
                    + trackedGame.getLocalDateTime() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trackedGame;
    }
}

