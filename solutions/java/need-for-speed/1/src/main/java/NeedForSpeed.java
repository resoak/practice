class NeedForSpeed {
    public final int speed;
    public int battery=100;
    public final int batteryDrain;
    private int meters_driven=0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return this.meters_driven;
    }

    public void drive() {
        if(battery >= batteryDrain){
            this.meters_driven += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return distance<=car.speed*(car.battery/car.batteryDrain);
    }
}
