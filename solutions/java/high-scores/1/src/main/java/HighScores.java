import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores=highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.getLast();
    }

    Integer personalBest(){
        List<Integer> best = new ArrayList<>(highScores);
        Collections.sort(best);
        return best.getLast();
    }

    List<Integer> personalTopThree() {
        List<Integer> topThree = new ArrayList<>(highScores);
        Collections.sort(topThree, Collections.reverseOrder());
        if (topThree.size() > 3) {
            return topThree.subList(0, 3);
        }
        return topThree;
    }

}
