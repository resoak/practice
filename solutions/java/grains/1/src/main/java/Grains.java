import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) throws IllegalArgumentException {
        BigInteger grain = BigInteger.valueOf(1);
        if(square>64||square<1){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        for(int i=1;i<square;i++){
            grain=grain.multiply(BigInteger.TWO);
        }
        return grain;
    }

    BigInteger grainsOnBoard(){
        BigInteger sum = BigInteger.ZERO;
        for(int i=1;i<=64;i++){
            sum=sum.add(grainsOnSquare(i));
        }
        return sum;
    }

}
