class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String number = Integer.toString(numberToCheck);
        int sum = 0;
        int length = number.length();
        for(int i=0;i<length;i++){
            int num = Integer.parseInt(number.substring(i, i+1));
            int product =1;
            for(int j=0;j<length;j++){
                product*=num;
            }
            sum+=product;
        }
        return sum==numberToCheck;
    }

}
