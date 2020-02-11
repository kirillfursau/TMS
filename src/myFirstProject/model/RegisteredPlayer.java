package myFirstProject.model;

public class RegisteredPlayer extends Player {
    private String name;

    public RegisteredPlayer(String name, Figure figure) {
        super(figure);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
