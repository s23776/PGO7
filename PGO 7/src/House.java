import java.util.List;

public class House {

    private static int numberOfRooms;

    private String address;
    private List<Room> rooms;

    private House(String address){
        this.address = address;
        numberOfRooms = 0;
    }

    public static House createHouse(String address){
        return new House(address);
    }

    public void addRoom(Room room){
        rooms.add(room);
        numberOfRooms++;
    }

    public void addRoom(List<Room> rooms){
        this.rooms.addAll(rooms);
        numberOfRooms += rooms.size();
    }

    public static int getRoomCount(){
        return numberOfRooms;
    }
}