import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private final Map<String,String> attr = new HashMap<>();
    private final Collection<Node> nodes = new ArrayList<>();
    private final Collection<Edge> edges = new ArrayList<>();
    public Graph() {
    }

    public Graph(Map<String, String> attributes) {
        attr.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return nodes;
    }

    public Collection<Edge> getEdges() {
        return edges;
    }

    public Graph node(String name) {
        Node n = new Node(name);
        nodes.add(n);
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node n;
        if(attributes!=null){
            n = new Node(name,attributes);
        }
        else{
            n = new Node(name);
        }
        nodes.add(n);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge e = new Edge(start,end);
        edges.add(e);
        return this;

    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge e;
        if(attributes!=null){
            e = new Edge(start,end,attributes);
        }
        else{
            e = new Edge(start,end);
        }
        edges.add(e);
        return this;
    }

    public Map<String, String> getAttributes() {
        return attr;
    }
}
