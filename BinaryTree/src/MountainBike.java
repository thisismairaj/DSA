public class MountainBike extends Bicycle{
    String Color;

    @Override
    public void applyBreak(int b) {
        this.speed= this.speed -(b-2);
    }

    @Override
    public void SpeedUp(int g) {
        this.speed= this.speed +(g+2);
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", Color='" + Color + '\'' +
                '}';
    }

    public MountainBike(int speed, int gear,  String color) {
        super(speed, gear);
        Color = color;
    }

    public MountainBike(String color) {
        Color = color;
    }


}
