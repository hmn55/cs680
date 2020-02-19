package edu.umb.cs.cs680.hw11;

import java.util.Date;

public class Link extends FSElement {

	private FSElement target;
	private File file;
	private Directory directory;

	public Link(String name, Directory parent, String owner, File file, Date created) {
		super(name, parent, owner, created);
		this.size = 0;
		this.file = file;
	
		this.setTarget(target);
	}

	public Link(String name, Directory parent, String owner, Directory directory, Date created) {
		super(name, parent, owner, created);
		this.size = 0;
		this.directory = directory;
		
		this.setTarget(target);
	}

	public void setTarget(FSElement target) {
		this.target = target;
	}

	public File getFile() {
		return file;
	}

	public void accept(FSVisitor v) {
		v.visit(this);
	}

}