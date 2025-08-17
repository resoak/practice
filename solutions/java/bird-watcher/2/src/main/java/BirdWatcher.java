
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i:birdsPerDay){
            if(i==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i=0;i<numberOfDays;i++){
            if(i<birdsPerDay.length){
                count+=birdsPerDay[i];
            }
            else{
                break;
            }
        }
        return count;
    }

    public int getBusyDays() {
        int bd = 0;
        for(int i:birdsPerDay){
            if(i>=5){
                bd++;
            }
        }
        return bd;
    }
}
