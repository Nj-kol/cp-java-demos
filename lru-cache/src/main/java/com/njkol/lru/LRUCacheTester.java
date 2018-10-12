package com.njkol.lru;

import java.util.Map.Entry;

import com.njkol.lru.impl.LRUCache;
import com.njkol.lru.model.User;

public class LRUCacheTester {

	public static void main(String[] args) {

		User u1 = new User("1", "Deep", "Dey");
		User u2 = new User("2", "Aniket", "Chow");
		User u3 = new User("3", "Tamanya", "Chow");
		User u4 = new User("4", "Nilanjan", "Sarkar");

		LRUCache<String, User> cache = LRUCache.newInstance(3);

		cache.put("1", u1);
		cache.put("2", u2);
		cache.put("3", u3);

		System.out.println(" Before Eviction ");
		System.out.println(" =============== ");

		for (Entry<String, User> entry : cache.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		cache.put("4", u4);
		
		System.out.println("  ");
		
		System.out.println(" After Eviction ");
		System.out.println(" =============== ");
		for (Entry<String, User> entry : cache.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
