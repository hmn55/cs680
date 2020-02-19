package edu.umb.cs.cs680.hw11;

import java.util.LinkedList;

public class Ls implements Command {
	FileSystem fs = FileSystem.getFileSystem();
	private String dir = fs.getCurrentDirectory().getName();
	FSElement tempDir;
	public Ls() {
		
		execute();
	}

	public void execute() {
		if (dir.equals("") || dir.equals(" ")) {
			LinkedList<FSElement> list = FileSystem.getFileSystem().getCurrentDirectory().getChildren();

			for (FSElement element : list) {
				if (element instanceof Directory) {
					
					System.out.println("Directory: " + element.getName());
					
				} else if (element instanceof Link) {
					System.out.println("Link: " + element.getName());
					
				} else {
					System.out.println("File: " + element.getName());
					
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
					
				} else if (element instanceof Link) {
					System.out.println("Link: " + element.getName());
				
				} else {
					System.out.println("File: " + element.getName());
					
				}
			}
			fs.setCurrent((Directory) tempDir);
		}

	}
}
