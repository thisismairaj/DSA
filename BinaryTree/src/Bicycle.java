public class Bicycle {

    public int speed;
    public int gear;


    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;

    }

    public Bicycle(){};
public void applyBreak(int b){
    speed =speed - b;
    gear--;


}
    public void SpeedUp(int g){
        speed =speed + g;
        gear++;


    }

}
