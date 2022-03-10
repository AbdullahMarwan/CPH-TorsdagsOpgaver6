package Task2;

//TODO 2.a Created Room class with fields
public class Room {
    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //TODO 2.b Created Constructor
    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //TODO 2.c Getters
    public int getWalls() {
        return walls;
    }

    //TODO 2.c Getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    //TODO 2.c Getters
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    //TODO 2.c Getters
    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
