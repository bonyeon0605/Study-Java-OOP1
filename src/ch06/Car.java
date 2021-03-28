package ch06;

public class Car {
    String color;
    String gearType;
    int door;

    public Car() {
        this("white", "auto", 4);
    }

    public Car(String color) {
        this(color, "auto", 4);
    }

    public Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
