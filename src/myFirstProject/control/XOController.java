package myFirstProject.control;

import myFirstProject.model.*;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;
import myFirstProject.model.exception.XOException;
import myFirstProject.repository.DatabaseGameRepository;
import myFirstProject.repository.DatabaseUserRepository;
import myFirstProject.service.FieldService;
import myFirstProject.service.GameService;

import java.time.LocalDateTime;
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


    public void startNonRegisteredGame(String xPlayerName, String yPlayerName) {
        Field field = new Field();
        Game game = new QuickGame(new NotRegisteredPlayer(Figure.X, xPlayerName),
                new NotRegisteredPlayer(Figure.O, yPlayerName), field);
        gameSickle(game, field);
    }

    public void startRegisteredGame(String xPlayerName, String yPlayerName) {
        Field field = new Field();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X user name : ");
        xPlayerName = scanner.nextLine();
        User user = new User((int) (Math.random() * 100), xPlayerName);
        System.out.print("Enter O user name : ");
        yPlayerName = scanner.nextLine();
        User user1 = new User((int) (Math.random() * 100), yPlayerName);
        DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository();
        DatabaseGameRepository databaseGameRepository = new DatabaseGameRepository();
        databaseUserRepository.saveUser(user);
        databaseUserRepository.saveUser(user1);
        TrackedGame game = new TrackedGame(new RegisteredPlayer(Figure.X, user),
                new RegisteredPlayer(Figure.O, user1), field, (int) (Math.random() * 100), LocalDateTime.now());
        gameSickle(game, field);
        databaseGameRepository.saveGame(game, gameService);
    }

    public void gameSickle(Game game, Field field) {
        while (!getGameService().isOver(game, fieldService)) {
            try {
                Scanner scanner = new Scanner(System.in);
                getFieldService().draw(field);
                if (fieldService.getNextFigure(field) == Figure.O) {
                    System.out.println("Turn O");
                } else {
                    System.out.println("Turn X");
                }
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
