import java.util.*;

class Dijkstra {
    private int V; // Number of vertices
    private List<List<Edge>> adjacencyList;

    public Dijkstra(int V) {
        this.V = V;
        adjacencyList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adjacencyList.get(u).add(new Edge(v, weight));
        adjacencyList.get(v).add(new Edge(u, weight));
    }

    public void dijkstra(int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(V, new NodeComparator());
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;
            for (Edge e : adjacencyList.get(u)) {
                int v = e.dest;
                int weight = e.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source vertex " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        Dijkstra graph = new Dijkstra(V);

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.println("Enter edge " + (i + 1) + " details (source destination weight): ");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(u, v, weight);
        }

        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();

        graph.dijkstra(source);
    }
}

class Edge {
    int dest;
    int weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

class Node {
    int vertex;
    int distance;

    public Node(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }
}

class NodeComparator implements Comparator<Node> {
    public int compare(Node a, Node b) {
        return a.distance - b.distance;
    }
}
