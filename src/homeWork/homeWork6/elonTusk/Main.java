package homeWork.homeWork6.elonTusk;

public class Main {
    public static void main(String[] args) {
        IStart start = new Spaceport();
        IStart start1 = new Shuttle();
        IStart start2 = new SpaceX();
        Spaceport spaceport = new Spaceport();
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX =new SpaceX();
        spaceport.launch(start);
        shuttle.launch(start1);
        spaceX.launch(start2);
    }
}


