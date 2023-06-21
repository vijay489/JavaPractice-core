package org.example;

import java.util.*;

public class LRUCache {
    final int cache_size;
    Set<Integer> cache ;
    public LRUCache(int capacity) {
        cache = new LinkedHashSet<>(capacity);
        cache_size = capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(4);
        cache.refer(5);
        cache.refer(1);

        cache.display();
    }

    private void display() {
        for(Integer data : cache)
            System.out.print("Cache values: "+data +" ");
    }

    private void refer(int page) {
        if(!get(page))
            put(page);
    }

    private boolean get(int page) {
        if(!cache.contains(page))
            return false;

        cache.remove(page);
        cache.add(page);
        return true;
    }

    private void put(int page){
        if(cache.size() == cache_size){
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
            System.out.println("Removed from cache "+ firstKey);
        }
        System.out.println("Adding to cache "+ page);
        cache.add(page);
    }
}
