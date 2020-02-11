package myFirstProject.control;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.Game;
import myFirstProject.model.Player;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;
import myFirstProject.model.exception.XOException;
import myFirstProject.service.FieldService;
import myFirstProject.service.GameService;

import java.util.InputMismatchException;
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
        Field field = new Field();
        FieldService fieldService = new FieldService();
        Game game = new Game(new Player(xPlayerName, Figure.X), new Player(yPlayerName, Figure.O), field);
        while (!getGameService().isOver(game, fieldService)) {
            try {
                Scanner scanner = new Scanner(System.in);
                getFieldService().draw(field);
                System.out.print("Enter x : ");
                int x = scanner.nextInt();
                System.out.print("Enter y : ");
                int y = scanner.nextInt();
                getFieldService().makeMove(field, x, y);
            } catch (AlreadyOccupiedException e) {
                System.out.println("This field is occupied");
            } catch (MoveOutOfBoundsException e) {
                System.out.println("There is no such field");
            } catch (InputMismatchException e) {
                System.out.println("You did't enter a number");
            } catch (XOException e) {
                e.printStackTrace();
            }
        }
    }
}
