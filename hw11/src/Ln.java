package edu.umb.cs.cs680.hw11;

import java.util.Date;
import java.util.LinkedList;

public class Ln implements Command {
	private String dirOrFile;// <target(real) dir/file>
	private String linkName;// <link (alias) name>
	private File file;
	private Directory directory;
	private Date date = new Date();
	FileSystem fs = FileSystem.getFileSystem();
	Directory current = fs.getCurrentDirectory();
	FSElement tempDir;

	LinkedList<FSElement> list1 = fs.root.getChildren();

	public Ln(String dirOrFile, String linkName) {

		this.dirOrFile = dirOrFile;
		this.linkName = linkName;
		execute();
	}

	// first step, turn strings into FSElements

	public void traverse(FSElement dir) {

		if (dir instanceof Directory) {
			LinkedList<FSElement> list = ((Directory) dir).getChildren();

			for (FSElement element : list) {
				if (element instanceof Directory) {
					if (element.getName().equals(dirOrFile))
						directory = (Directory) element;
					traverse(element);
				}
				if (element instanceof Link) {
					traverse(element);
				}
				if (element instanceof File) {// element instanceOf File
					if (element.getName().equals(linkName)) {
						file = (File) element;
						traverse(element);
					}
				}
			}
		}

	}

	public void execute() {

		traverse(fs.root);
		System.out.println(linkName);// IMG_1233
		if(directory != null) {
		     System.out.println(directory.getName());// home
		     Link link = new Link(linkName, directory, "User", file, date);
		}
		System.out.println("User");// User
        if(file != null) {
		    System.out.println(file.getName());
      
        }
		System.out.println(date);
		
	}

}
