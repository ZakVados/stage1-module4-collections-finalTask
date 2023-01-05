package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() < o2.length()) return 1;
            else if (o1.length() > o2.length()) return -1;
            else return 0;
        };
        List<String> res = new ArrayList<>();
        PriorityQueue<String> pq = new PriorityQueue<String>(comparator);

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) pq.add(entry.getKey());
        }
        int pqSize = pq.size();
        for (int i = 0; i < pqSize; i++) res.add(pq.poll());
        return res;
    }
}
