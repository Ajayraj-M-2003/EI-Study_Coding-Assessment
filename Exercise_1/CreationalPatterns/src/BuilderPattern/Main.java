package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        // Build a house using the builder
        House house1 = new House.HouseBuilder()
                .setRooms(3)
                .setWindows(5)
                .setDoors(2)
                .setHasGarden(true)
                .build();

        System.out.println(house1);

        // Build another house with different parameters
        House house2 = new House.HouseBuilder()
                .setRooms(4)
                .setWindows(8)
                .setDoors(3)
                .setHasGarden(false)
                .build();

        System.out.println(house2);
    }
}
