

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

	public Directory getParent() {
		return this.parent;
	}

	public String getName() {
		return this.name;
	}

	
	

	public int getDiskUtil() {
		return this.size;
	}

	public void accept(FSVisitor v) {
	}

}
