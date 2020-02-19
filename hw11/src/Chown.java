package edu.umb.cs.cs680.hw11;
//Chown changes the owner of a directory, but not a file
public class Chown implements Command {

	FileSystem fs = FileSystem.getFileSystem();
	private String newOwner;

	public Chown(String newOwner) {

		this.newOwner = newOwner;
		execute();
	}

	public void execute() {
	
		fs.getCurrentDirectory().setOwner(newOwner);

	}

}