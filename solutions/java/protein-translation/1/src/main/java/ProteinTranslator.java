import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) throws IllegalArgumentException {
        List<String> ls = new ArrayList<>();
        boolean stop = false;
        for(int i=0;i<rnaSequence.length();i+=3){
            if(stop){
                break;
            }
            if(i+3>rnaSequence.length()){
                throw new IllegalArgumentException("Invalid codon");
            }
            switch(rnaSequence.substring(i, i+3)){
                case "AUG": ls.add("Methionine");  break;
                case "UUU":
                case "UUC": ls.add("Phenylalanine"); break;
                case "UUA":
                case "UUG": ls.add("Leucine"); break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG": ls.add("Serine"); break;
                case "UAU":
                case "UAC": ls.add("Tyrosine"); break;
                case "UGU":
                case "UGC": ls.add("Cysteine"); break;
                case "UGG": ls.add("Tryptophan"); break;
                case "UAA":
                case "UAG":
                case "UGA": stop = true; break;
                default: throw new IllegalArgumentException("Invalid codon");

            }
        }
        return ls;
    }
}
