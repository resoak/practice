import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class RelativeDistance {

    public static final int NO_KNOWN_RELATIONSHIP = -1;


    private final Map<String, Set<String>> graph = new HashMap<>();

    public RelativeDistance(Map<String, List<String>> parentToChildren) {
        buildGraph(parentToChildren);
    }

    private void buildGraph(Map<String, List<String>> parentToChildren) {

        for (Map.Entry<String, List<String>> e : parentToChildren.entrySet()) {
            String parent = e.getKey();
            graph.computeIfAbsent(parent, k -> new HashSet<>());
            for (String child : e.getValue()) {
                graph.computeIfAbsent(child, k -> new HashSet<>());
            }
        }


        for (Map.Entry<String, List<String>> e : parentToChildren.entrySet()) {
            String parent = e.getKey();
            List<String> children = e.getValue();
            for (String child : children) {
                connect(parent, child);
            }
        }


        for (List<String> children : parentToChildren.values()) {
            for (int i = 0; i < children.size(); i++) {
                for (int j = i + 1; j < children.size(); j++) {
                    connect(children.get(i), children.get(j));
                }
            }
        }
    }

    private void connect(String a, String b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }


    public int degreeOfSeparation(String from, String to) {
        if (from == null || to == null) return NO_KNOWN_RELATIONSHIP;
        if (!graph.containsKey(from) || !graph.containsKey(to)) return NO_KNOWN_RELATIONSHIP;
        if (from.equals(to)) return 0;

  
        Queue<String> q = new ArrayDeque<>();
        Map<String, Integer> dist = new HashMap<>();
        q.offer(from);
        dist.put(from, 0);

        while (!q.isEmpty()) {
            String cur = q.poll();
            int d = dist.get(cur);
            for (String nei : graph.get(cur)) {
                if (!dist.containsKey(nei)) {
                    dist.put(nei, d + 1);
                    if (nei.equals(to)) return d + 1;
                    q.offer(nei);
                }
            }
        }
        return NO_KNOWN_RELATIONSHIP;
    }
}