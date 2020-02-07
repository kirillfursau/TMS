package myFirstProject.control;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.Game;
import myFirstProject.model.Player;
import myFirstProject.service.FieldService;
import myFirstProject.service.GameService;

import java.util.Scanner;

public class XOController {
    private GameService gameService;
    private FieldService fieldService;

    public XOController(GameService gameService, FieldService fieldService) {
        setGameService(gameService);
        setFieldService(fieldService);

    }

    public GameService getGameService() {
        return gameService;
    }

    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }

    public FieldService getFieldService() {
        return fieldService;
    }

    public void setFieldService(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    public void startGame(String xPlayerName, String yPlayerName) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field();
        GameService gameService = new GameService();
        FieldService fieldService = new FieldService();
        XOController xoController = new XOController(gameService, fieldService);
        Game game = new Game(new Player(xPlayerName, Figure.X), new Player(yPlayerName, Figure.O), field);
        while (!getGameService().isOver(game)) {
            getFieldService().draw(field);
            getFieldService().makeMove(field);
        }
    }
}
