package BuilderPattern;

public class House {
    // Attributes of the house
    private int rooms;
    private int windows;
    private int doors;
    private boolean hasGarden;

    // Private constructor; only the Builder can create the object
    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarden = builder.hasGarden;
    }

    // Overriding toString method to display house details
    @Override
    public String toString() {
        return "House [rooms=" + rooms + ", windows=" + windows + ", doors=" + doors + ", hasGarden=" + hasGarden + "]";
    }

    // Static inner class: HouseBuilder
    public static class HouseBuilder {
        private int rooms;
        private int windows;
        private int doors;
        private boolean hasGarden;

        // Setters with return type HouseBuilder to chain methods
        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Build method to return the constructed House object
        public House build() {
            return new House(this);
        }
    }
}
