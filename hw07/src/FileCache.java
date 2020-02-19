package edu.umb.cs.cs680.hw07;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FileCache {
	private static LinkedHashMap<String, String> cache;
	private static LinkedHashMap<String, File> cache2;
	private static FileCache instance = null;
	private static CacheReplacementPolicy replacementPolicy;
	private static int maxSize = 3;

	private FileCache() {
		replacementPolicy = NullReplacement.getInstance();
		cache = new LinkedHashMap<String, String>(0,(float) 0.75,true);
		cache2 = new LinkedHashMap<String, File>();
	}

	public static FileCache getInstance() {
		if (instance == null)
			instance = new FileCache();
		return instance;
	}

	public File fetch(File targetFile) {

		if (cache.containsKey(targetFile.getKey())) {
			return new File(cache.get(targetFile.getKey()), cache.get(targetFile.getValue()));
		} else {
			if (cache.size() < maxSize) {// cache max is 3
				cache.put(targetFile.getKey(), targetFile.getValue() );
			} else {
				replacementPolicy = new FIFO();
				replace(targetFile);
			}

		}

		return targetFile;

	}

	private static void replace(File targetFile) {
		if (replacementPolicy != null)
			replacementPolicy.replace(cache, targetFile);
	}

	public static void main(String[] args) {
		FileCache fc = FileCache.getInstance();

		fc.fetch(new File("file1", "file1 contents"));
		System.out.println("file1 added to cache");
		fc.fetch(new File("file2", "file2 contents"));
		System.out.println("file2 added to cache");
		fc.fetch(new File("file3", "file3 contents"));
		System.out.println("file3 added to cache");
		System.out.println("Cache contents:");
		for (Entry<String, String> entry : cache.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
	
		fc.fetch(new File("file4", "file4 contents"));
		System.out.println("");
		System.out.println("file4 added to cache, replaced with FIFO");
		System.out.println("Cache contents:");
		for (Entry<String, String> entry : cache.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		
		fc.fetch(new File("file5", "file5 contents"));
		System.out.println("");
		System.out.println("file5 added to cache, replaced with FIFO");
		System.out.println("Cache contents:");
		for (Entry<String, String> entry : cache.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		
	}
}
