package edu.umb.cs.cs680.hw11;

public class Sort implements Command {

	FileSystem fs = FileSystem.getFileSystem();
	
	public void execute() {
		fs.sort(fs.getCurrentDirectory());

	}

}