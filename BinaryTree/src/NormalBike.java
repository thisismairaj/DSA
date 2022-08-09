public class NormalBike extends Bicycle {
    String Color;


    @Override
    public String toString() {
        return "NormalBike{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", Color='" + Color + '\'' +
                '}';
    }

    public NormalBike(int speed, int gear,  String color) {
        super(speed, gear);
        Color = color;
    }


    public NormalBike(String color) {
        Color = color;
    }

}
