public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double res = 0.0;
        if(speed>=1 && speed<=4){
            res=speed*1.0*221;
        }
        else if(speed>=5 && speed<=8){
            res=speed*0.9*221;
        }
        else if(speed==9){
            res=speed*0.8*221;
        }
        else if(speed==10){
            res=speed*0.77*221;
        }
        return res;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed)/60);
    }
}
