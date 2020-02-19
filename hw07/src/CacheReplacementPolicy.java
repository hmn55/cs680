package edu.umb.cs.cs680.hw07;
import java.util.Map;

public interface CacheReplacementPolicy {
     public void replace(Map<String, String> map, File str);
}
