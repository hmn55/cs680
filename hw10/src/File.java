

import java.util.Date;


public class File extends FSElement {

	public File(Directory parent, String name, String owner, Date created, int size) {
		super(name, parent, owner, created);
		this.size = size;
	}

	public boolean isLeaf() {
		return true;
	}


	public void accept (FSVisitor v) {
		v.visit(this);
	}

	

}