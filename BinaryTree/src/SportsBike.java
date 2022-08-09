public class SportsBike extends Bicycle {
    String Color;


    @Override
    public String toString() {
        return "SportsBike{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", Color='" + Color + '\'' +
                '}';
    }

    public SportsBike(int speed, int gear,  String color) {
        super(speed, gear);
        Color = color;
    }

    public SportsBike(String color) {
        Color = color;
    }
}
