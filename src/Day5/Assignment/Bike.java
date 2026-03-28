package Day5.Assignment;

public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
        gear = 1;
    }

    public void accelerate() {
        if (!isOn) {
            return;
        }
        speed = speed + gear;
    }

    public void decelerate() {
        if (!isOn) {
            return;
        }
        speed = speed - gear;
        if (speed < 0) {
            speed = 0;
        }
    }

    private void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 30) {
            gear = 2;
        } else if (speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
