package Task2;

import java.util.ArrayList;

public class Main {
    //TODO 2.h Arraylist roomCollection
    static ArrayList<Room> roomCollection = new ArrayList<>();

    public static void main(String[] args) {
        //TODO 2.g Created 3 rooms
        Room room1 = new Room(4, 1, 2, 4);
        Room room2 = new Room(100, 5, 120, 0);
        Room room3 = new Room(1, 2, 0, 2);

        roomCollection.add(room1);
        roomCollection.add(room2);
        roomCollection.add(room3);

        //TODO 2.i Created a building
        Building building1 = new Building(roomCollection, 1, 1000, false);

        //TODO 2.j Print all lamps in the building
        int sumOfLamps = 0;
        for (Room r : building1.getRooms()) {
            sumOfLamps += r.getNumberOfLamps();
        }
        System.out.println("Amount of Lamps in all Rooms in the building: " + sumOfLamps);

        //TODO 2.k Prints if number of floors is bigger than amount of rooms
        if (building1.getNumberOfFloors() > building1.getRooms().size()) {
            System.out.println("This is an odd building");
        }
    }
}
