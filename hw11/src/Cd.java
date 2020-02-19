package edu.umb.cs.cs680.hw11;

import java.util.LinkedList;

public class Cd implements Command {
	FileSystem fs = FileSystem.getFileSystem();
	private String destination;
	

	public Cd(String destination) {
		this.destination = destination;
		execute();

	}

	public void traverse(FSElement node) {

		if (node instanceof Directory) {
			LinkedList<FSElement> list = ((Directory) node).getChildren();

			for (FSElement element : list) {
				if (element instanceof Directory) {

					if (element instanceof Directory && destination.equals(element.getName())) {
						fs.setCurrent((Directory) element);
						traverse(element);
					}
					if (element instanceof Link) {

						traverse(element);
					}
					if (element instanceof File) {// element instanceOf File

						traverse(element);
					} else {

						traverse(element);
					}
				}
			}
		}

	}

	public void execute() {
		traverse(fs.root);

		if (destination.equals("root"))
			if (!fs.getCurrentDirectory().getName().equals("root"))
				fs.setCurrent(fs.root);
		if (destination.equals(".."))
			if (!fs.getCurrentDirectory().getName().equals("root"))
				fs.setCurrent(fs.getCurrentDirectory().getParent());
		if (destination.equals("") || destination.equals(" "))// if cd is followed by nothing
			fs.setCurrent(fs.root);
	}

}
