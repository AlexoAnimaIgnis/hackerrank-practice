package com.alexo.hackerrankalexo.random.datastructures;

import java.util.*;

public class GraphTraversal {

    private Map<Integer, List<Integer>> adjList;

    public GraphTraversal() {
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    public void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public void DFS(int start) {
        Set<Integer> visited = new HashSet<>();
        DFSUtil(start, visited);
    }

    private void DFSUtil(int node, Set<Integer> visited) {
        if (visited.contains(node)) return;

        System.out.print(node + " ");
        visited.add(node);

        for (int neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
            DFSUtil(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Breadth First Traversal starting from vertex 2:");
        graph.BFS(2);
        System.out.println("\nDepth First Traversal starting from vertex 2:");
        graph.DFS(2);
    }
}

