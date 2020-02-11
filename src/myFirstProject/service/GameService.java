package myFirstProject.service;

import myFirstProject.model.Figure;
import myFirstProject.model.Game;
import myFirstProject.model.Player;

import java.util.Optional;

public class GameService {
    public Optional<Player> getWinner(Game game) {
        for (int p = 0; p < 3; p++) {
            if ((game.getField().getFigure(p, 0) == Figure.X && game.getField().getFigure(p, 1) == Figure.X &&
                    game.getField().getFigure(p, 2) == Figure.X) ||
                    (game.getField().getFigure(0, p) == Figure.X && game.getField().getFigure(1, p) == Figure.X &&
                            game.getField().getFigure(2, p) == Figure.X)) {
                if (game.getPlayer1().getFigure() == Figure.X) {
                    return Optional.of(game.getPlayer1());
                } else {
                    return Optional.of(game.getPlayer2());
                }
            } else if ((game.getField().getFigure(0, 0) == Figure.X && game.getField().getFigure(1, 1)
                    == Figure.X && game.getField().getFigure(2, 2) == Figure.X) ||
                    (game.getField().getFigure(2, 0) == Figure.X && game.getField().getFigure(1, 1)
                            == Figure.X && game.getField().getFigure(0, 2) == Figure.X)) {
                if (game.getPlayer1().getFigure() == Figure.X) {
                    return Optional.of(game.getPlayer1());
                } else {
                    return Optional.of(game.getPlayer2());
                }
            }
        }
        for (int p = 0; p < 3; p++) {
            if ((game.getField().getFigure(p, 0) == Figure.O && game.getField().getFigure(p, 1) == Figure.O &&
                    game.getField().getFigure(p, 2) == Figure.O) ||
                    (game.getField().getFigure(0, p) == Figure.O && game.getField().getFigure(1, p) == Figure.O &&
                            game.getField().getFigure(2, p) == Figure.O)) {
                if (game.getPlayer1().getFigure() == Figure.O) {
                    return Optional.of(game.getPlayer1());
                } else {
                    return Optional.of(game.getPlayer2());
                }
            } else if ((game.getField().getFigure(0, 0) == Figure.O && game.getField().getFigure(1, 1)
                    == Figure.O && game.getField().getFigure(2, 2) == Figure.O) ||
                    (game.getField().getFigure(2, 0) == Figure.O && game.getField().getFigure(1, 1)
                            == Figure.O && game.getField().getFigure(0, 2) == Figure.O)) {
                if (game.getPlayer1().getFigure() == Figure.O) {
                    return Optional.of(game.getPlayer1());
                } else {
                    return Optional.of(game.getPlayer2());
                }
            }
        }
        return Optional.empty();
    }

    public boolean isOver(Game game, FieldService fieldService) {
        if (!getWinner(game).isPresent() && fieldService.isFull(game.getField()) == false) {
            return false;
        }
        fieldService.draw(game.getField());
        System.out.println("The winner is " + getWinner(game).get().getName());
        return true;
    }
}
