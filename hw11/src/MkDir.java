package edu.umb.cs.cs680.hw11;

import java.util.Date;

public class MkDir implements Command{
	private String newDir;
	FileSystem fs = FileSystem.getFileSystem();
	Directory current = fs.getCurrentDirectory();
	
	public MkDir(String newDir) {
		this.newDir = newDir;
		execute();
	}
	
	
	public void execute() {
		System.out.println("here in execute");
		Date date = new Date();
		
		Directory directory = new Directory(newDir, current , "User", date);
		
		
	}
}
