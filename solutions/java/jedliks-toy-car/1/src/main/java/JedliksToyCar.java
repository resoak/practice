public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters",distance);
    }

    public String batteryDisplay() {
        if(battery==0){
            return "Battery empty";
        }
        return String.format("Battery at %d%%",battery);
    }

    public void drive() {
        if(battery==0){

        }
        else{
            battery-=1;
            distance+=20;
        }
    }
}
