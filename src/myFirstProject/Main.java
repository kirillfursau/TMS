package myFirstProject;

import myFirstProject.control.XOController;
import myFirstProject.service.FieldService;
import myFirstProject.service.GameService;

public class Main {
    public static void main(String[] args) {
        XOController xoController = new XOController(new GameService(), new FieldService());
//        xoController.startRegisteredGame("Kiryl","Dima");
        xoController.startNonRegisteredGame("Kiryl","Dima");
    }
}
