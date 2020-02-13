package myFirstProject.repository;

import myFirstProject.model.Game;
import myFirstProject.model.TrackedGame;
import myFirstProject.service.GameService;

public interface GameRepository {
    TrackedGame saveGame(TrackedGame trackedGame, GameService gameService);
}
