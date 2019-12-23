package homeWork.homeWork6.elonTusk;

public class Main {
    public static void main(String[] args) {
        IStart start1 = new Shuttle();
        IStart start2 = new SpaceX();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(start1);
        spaceport.launch(start2);
    }
}


