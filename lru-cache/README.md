
# LRU Cache using LinkedHashMap

## LinkedHashMap 

* Types of iteration order :

**1.Insertion order**

	* This is the default iteration ordering
	* Iteration is based on the order in which keys were inserted

**2.Access order**

* Iteration is based on the order in which keys were last 
  accessed, from the least-recently to the most-recently
  
* To change the default iteration order ( insertion ), use the version
  of the constructor used below :

	 LinkedHashMap(int initialCapacity,
	             float loadFactor,
	             boolean accessOrder)
	    
   Set the last parameter, accessOrder, as true
               
* LinkedHashMap has the removeEldestEntry method, which decides the 
  eviction order
  
  