package edu.umb.cs.cs680.hw11;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Date;
import java.util.ArrayList;
public class FileSystem {

	private static FileSystem instance = null;
	public Directory root;
	private Directory current;

	private FileSystem() {
		root = new Directory("root", null, "User", new Date());
		current = root;
	}
	
	
	public String getCurrentDirectoryName() {
		return current.getName();
	}
	public Directory getCurrentDirectory() {
		return  current;
	}
	public LinkedList<FSElement> sort(Directory dir){
		Collections.sort(dir.getChildren(), new sortMethod());
		return dir.getChildren();
	}
	public static FileSystem getFileSystem() {
		if (instance == null) {
			instance = new FileSystem();
			// instance.root=root;
			return instance;
		}
		return instance;
	}

	int depth = 0;
Directory directTemp;
	public void traverse(FSElement dir) {

		if (dir instanceof Directory) {
			LinkedList<FSElement> list = ((Directory) dir).getChildren();
			for (FSElement element : list) {
				if (element instanceof Directory) {
					if(directTemp != element.getParent())
					    depth++;
					directTemp = (Directory) element.getParent();
					
					for (int i = 0; i < depth; i++)
						System.out.print("	");
					System.out.println("Directory: " + element.getName());

					traverse(element);

				} else if (element instanceof Link) {
					depth++;
					for (int i = 0; i < depth; i++)
						System.out.print("	");
					System.out.println("-Link: " + element.getName());
					depth--;

					// traverse(((Link) element).getTarget());

				} else {
					depth++;
					for (int i = 0; i < depth; i++)
						System.out.print("	");
					System.out.println("-File: " + element.getName());
					depth--;
				}
			}
		} else {

			for (int i = 0; i < depth; i++)
				System.out.print("	");
			System.out.println("-File: " + dir.getName() + depth);
		}

	}
	public void setCurrent(Directory dir) {
		current = dir;
	}
	public void showAllElements() {
		if (this.root != null) {
			System.out.println("root");
			traverse(root);

		} else {
			System.out.println("Empty Set");
		}
	}

}