package edu.umb.cs.cs680.hw11;

import java.util.LinkedList;

public class Dir implements Command {
	FileSystem fs = FileSystem.getFileSystem();
	private String dir;
	FSElement tempDir;
	public Dir(String dir) {
		this.dir = dir;
		execute();
	}

	public void execute() {
		if (dir.equals("") || dir.equals(" ")) {
			LinkedList<FSElement> list = FileSystem.getFileSystem().getCurrentDirectory().getChildren();

			for (FSElement element : list) {
				if (element instanceof Directory) {
					
					System.out.println("Directory: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	Date Created: " + element.getDate());
					System.out.println("	Size: " + element.getSize());
				} else if (element instanceof Link) {
					System.out.println("Link: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	File" + ((Link) element).getFile().getName());
					System.out.println("	Date Created: " + element.getDate());

				} else {
					System.out.println("File: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	Date Created: " + element.getDate());
					System.out.println("	Size: " + element.getSize());
				}
			}
		} else

		{	
			
			LinkedList<FSElement> list1 = fs.root.getChildren();
			for (FSElement element : list1) {
			Object Directory;
			if (element.getName().equals(dir))
					 tempDir = element;
			}
	
			LinkedList<FSElement> list2 = fs.root.getChildren();
			for (FSElement element : list2) {
			if (element.getName().equals(dir))
					fs.setCurrent((Directory) element);
			}
			
		
			LinkedList<FSElement> list = FileSystem.getFileSystem().getCurrentDirectory().getChildren();
			
			for (FSElement element : list ) {
				if (element instanceof Directory ) {
					
					System.out.println("Directory: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	Date Created: " + element.getDate());
					System.out.println("	Size: " + element.getSize());
				} else if (element instanceof Link) {
					System.out.println("Link: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	File: " + ((Link) element).getFile().getName());
					System.out.println("	Date Created: " + element.getDate());

				} else {
					System.out.println("File: " + element.getName());
					System.out.println("	Parent: " + element.getParent().getName());
					System.out.println("	Owner: " + element.getOwner());
					System.out.println("	Date Created: " + element.getDate());
					System.out.println("	Size: " + element.getSize());
				}
			}
			fs.setCurrent((Directory) tempDir);
		}

	}
}
