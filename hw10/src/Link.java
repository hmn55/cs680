

import java.util.Date;

public class Link extends FSElement {

	private FSElement target;

	public Link(String name, Directory parent, String owner, File browser, Date created) {
		super(name, parent, owner, created);
		this.size = 0;
		
		this.setTarget(target);
	}

	public void setTarget(FSElement target) {
		this.target = target;
	}

	public void accept(FSVisitor v) {
		v.visit(this);
	}

}