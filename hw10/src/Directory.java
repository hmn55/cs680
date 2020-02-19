

import java.util.*;

public class Directory extends FSElement {

	private LinkedList<FSElement> children;

	public Directory(String name, Directory parent, String owner, Date created) {
		super(name, parent, owner, created);
		this.size = 0;
		children = new LinkedList<FSElement>();
	}

	public LinkedList<FSElement> getChildren() {
		return this.children;
	}

	public void appendChild(FSElement newChild) {
		Date date = new Date();
		this.children.add(newChild);
		this.lastModified = date;
		if (this.parent != null) {
			this.parent.lastModified = date;
		}
	}

	public boolean isLeaf() {

		if (this.children.isEmpty()) {
			return true;
		} else {
			return false;

		}

	}

	public void accept(FSVisitor v) {

		v.visit(this);
		for (FSElement e : children) {
			e.accept(v);
		}
	}
}