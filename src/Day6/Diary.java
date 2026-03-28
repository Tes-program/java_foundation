package Day6;

public class Diary {
    private boolean isLocked;
    private MyString pin;

    public Diary(MyString pin) {
        this.pin = pin;
        this.isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(MyString pin) {
        if(pin.equals(this.pin)) isLocked = false;
    }
}
