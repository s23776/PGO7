import java.util.List;

public class Room {

    private double area;
    private List<Furniture> furnitureList;

    public Room(double area, List<Furniture> furnitureList) {
        this.area = area;
        this.furnitureList = furnitureList;
    }

    public double getPrice(){
        double sum = 0.0;
        for (Furniture furniture: furnitureList)
            sum += furniture.getPriceBrutto();
        return sum;
    }
}