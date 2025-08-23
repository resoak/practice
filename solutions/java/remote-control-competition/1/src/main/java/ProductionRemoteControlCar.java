class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int victories;
    @Override
    public void drive() {
        this.distance += 10;
    }
    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.victories;    
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(car.victories,this.victories);
    }
}
