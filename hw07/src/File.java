package edu.umb.cs.cs680.hw07;

public class File {
	private String key;//file name
	private String value;//file contents
	
public File(String key, String value){
	this.key = key;
	this.value = value;
	
}
public String getKey(){
	return key;}

public String getValue(){
	return value;}


}
