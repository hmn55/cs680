package edu.umb.cs.cs680.hw07;


import java.util.Map;

public class FIFO implements CacheReplacementPolicy{
	 public void replace(Map<String,String> cache, File file) {
		 
		 String key = cache.keySet().iterator().next();
		 cache.remove(key);
		 cache.put(file.getKey(), file.getValue());
		 	 
	}

	

	

		
	}

