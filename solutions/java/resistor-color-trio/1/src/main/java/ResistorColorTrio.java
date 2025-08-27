
import java.util.Arrays;
import java.util.List;

class ResistorColorTrio {
    private static final List<String> COLORS = Arrays.asList(
        "black","brown","red","orange","yellow","green","blue","violet","grey","white"
    );
    String label(String[] colors) {
        int val = COLORS.indexOf(colors[0]) * 10 + COLORS.indexOf(colors[1]);
        int exp = COLORS.indexOf(colors[2]);

        long total = val;
        for (int i = 0; i < exp; i++) {
            total *= 10;
        }

        if (exp >= 9) return (total / 1_000_000_000L) + " gigaohms";
        if (exp >= 6) return (total / 1_000_000L) + " megaohms";
        if (exp >= 2) return (total / 1_000L) + " kiloohms";
        return total + " ohms";
    }
}
