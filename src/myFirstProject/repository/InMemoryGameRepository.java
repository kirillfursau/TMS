package myFirstProject.repository;

import myFirstProject.model.TrackedGame;

import java.util.List;

public class InMemoryGameRepository implements GameRepository {
    private static List<TrackedGame> games;
    static int countGames;

    public List<TrackedGame> addTrackedGameToList(TrackedGame trackedGame) {
        games.add(trackedGame);
        return games;
    }

    @Override
    public TrackedGame saveGame(TrackedGame trackedGame) {
        trackedGame.setGameId(countGames);
        countGames++;
        return trackedGame;
    }

    public List<TrackedGame> getTrackedGames() {
        return games;
    }
}
