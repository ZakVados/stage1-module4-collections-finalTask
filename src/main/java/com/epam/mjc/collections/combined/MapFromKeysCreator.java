package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<Integer, Set<String>>();
        for (String inputKey : sourceMap.keySet() ) {
            Integer entryKeyLen = inputKey.length();
            if (res.containsKey(entryKeyLen)) {
                res.get(entryKeyLen).add(inputKey);
                continue;
            }
            Set<String> set = new HashSet<String>();
            set.add(inputKey);
            res.put(entryKeyLen, set);
        }
        return res;
    }
}
