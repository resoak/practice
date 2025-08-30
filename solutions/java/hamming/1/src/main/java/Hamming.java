public class Hamming {
    private final String left;
    private final String right;
    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if(leftStrand.length()!=rightStrand.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.left = leftStrand;
        this.right = rightStrand;
    }
    public int getHammingDistance() {
        int distance = 0;
        for(int i=0;i<this.left.length();i++){
            if(left.charAt(i)!=right.charAt(i)){
                distance +=1;
            }
        }
        return distance;
    }
}
