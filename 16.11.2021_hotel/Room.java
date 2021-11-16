public class Room {
    private int rommNumber;
    private int sleepingPlace;
    private boolean wifi;
    private boolean wc;
    private boolean conditioner;
    private boolean reserved;

    public Room(int rommNumber, int sleepingPlace, boolean wifi, boolean wc, boolean conditioner) {
        this.rommNumber = rommNumber;
        this.sleepingPlace = sleepingPlace;
        this.wifi = wifi;
        this.wc = wc;
        this.conditioner = conditioner;
        this.reserved = false;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getRommNumber() {
        return rommNumber;
    }

    public int getSleepingPlace() {
        return sleepingPlace;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public boolean isReserved() {
        return reserved;
    }
}
