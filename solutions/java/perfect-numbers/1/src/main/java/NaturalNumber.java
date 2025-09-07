class NaturalNumber {
    private int sum = 0;
    private int number;
    NaturalNumber(int number) throws IllegalArgumentException {
        if(number<=0){
                throw new IllegalArgumentException("You must supply a natural number (positive integer)");
            }
        this.number = number;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        
        
    }

    Classification getClassification() {
        return sum==number?Classification.PERFECT:sum>number?Classification.ABUNDANT:Classification.DEFICIENT;
    }
}
