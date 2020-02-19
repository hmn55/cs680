package edu.umb.cs.cs680.hw07;

import java.util.Map;

public class NullReplacement implements CacheReplacementPolicy{
	private static NullReplacement instance = null;
	private NullReplacement(){}
	
	
	public static NullReplacement getInstance()
	{
		if(instance == null)
		{
			instance = new NullReplacement();
		}
		return instance;
		
	}
	public void replace(Map<String, String> cache, File str) {
		
		System.out.println("Null Replacement");
	}

	
}
