package com.njkol.lru.impl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A linked hash map implementation in Java
 * 
 * @author Nilanjan Sarkar
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = -5875882013411440L;
	private int cacheSize;

	private LRUCache(int cacheSize) {
		super(cacheSize, 0.75f, true);
		this.cacheSize = cacheSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > cacheSize;
	}

	public static <K, V> LRUCache<K, V> newInstance(int cacheSize) {
		return new LRUCache<K, V>(cacheSize);
	}
}
