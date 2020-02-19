package edu.umb.cs.cs680.hw11;

import java.util.Date;
import java.util.LinkedList;

public class Cp implements Command {

	FileSystem fs = FileSystem.getFileSystem();
	private String source;
	private String destination;
	private Directory current = fs.getCurrentDirectory();
	private Directory directory;
	FSElement element = null;

	public Cp(String source, String destination) {

		this.source = source;
		this.destination = destination;
		execute();
	}

	public void execute() {

		for (int i = 0; i < fs.getCurrentDirectory().getChildren().size(); i++) {
			if (source.equals(fs.getCurrentDirectory().getChildren().get(i).getName())) {
				element = fs.getCurrentDirectory().getChildren().get(i);
				

			}
		}
		
		
		
		traverse(fs.root);

		fs.setCurrent(directory);
		fs.getCurrentDirectory();

		System.out.println(element.getName());

		if (!destination.equals("root"))
			fs.getCurrentDirectory().appendChild(element);
		else {
			Date date = new Date();
			if (element instanceof Directory) {

				new Directory(source, fs.root, "User", date);
			}
			if (element instanceof File) {

				new File(fs.root, source, "User", date, 1);
			}
		}

		fs.setCurrent(current);
	}

	public void traverse(FSElement node) {

		if (node instanceof Directory) {
			LinkedList<FSElement> list = ((Directory) node).getChildren();

			for (FSElement element : list) {
				if (element instanceof Directory) {
					if (element.getName().equals(destination))
						directory = (Directory) element;
					traverse(element);
				}
				if (element instanceof Link) {
					traverse(element);
				}
				if (element instanceof File) {// element instanceOf File

					traverse(element);
				}
			}
		}
	}

}
