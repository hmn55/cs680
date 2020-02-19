package edu.umb.cs.cs680.hw11;

import java.util.*;

public abstract class FSElement {
	protected String name;
	protected String owner;
	protected Directory parent;
	protected Date created;
	protected Date lastModified;
	protected int size;

	public FSElement(String name, Directory parent, String owner, Date created) {
		this.parent = parent;
		if (parent != null) {
			this.parent.appendChild(this);
		}
		this.created = created;
		this.lastModified = created;
		this.owner = owner;
		this.name = name;
	}
	public Date getDate() {
		return created;
	}
	public Directory getParent() {
		return this.parent;
	}
	public int getSize() {
		return size;
	}
	public String getOwner() {
		return  owner;
	}
	public String getName() {
		return this.name;
	}
	public void setOwner(String owner) {
		System.out.println("Setting owner");
		this.owner = owner;
	}

	// public boolean isLeaf() {
	// return false;}

	public int getDiskUtil() {
		return this.size;
	}

	public void accept(FSVisitor v) {
	}

}
