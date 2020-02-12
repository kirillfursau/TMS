package myFirstProject.repository;

import myFirstProject.model.TrackedGame;

public interface GameRepository {
    TrackedGame saveGame(TrackedGame trackedGame);
}
