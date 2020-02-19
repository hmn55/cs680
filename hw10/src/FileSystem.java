

import java.util.LinkedList;

public class FileSystem {

	private FileSystem() {
	}

	private static FileSystem instance = null;
	public Directory root;

	public static FileSystem getFileSystem() {
		if (instance == null) {
			instance = new FileSystem();
			
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

	public void showAllElements() {
		if (this.root != null) {
			System.out.println("root");
			traverse(root);

		} else {
			System.out.println("Empty Set");
		}
	}

}