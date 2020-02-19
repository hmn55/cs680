package edu.umb.cs.cs680.hw11;

public class Pwd implements Command {

	
	public Pwd(){
		execute();
	}
	
	public void execute() {
		String currentDirectory = FileSystem.getFileSystem().getCurrentDirectoryName();
		System.out.println("curr dir: " + currentDirectory);
	}
}
