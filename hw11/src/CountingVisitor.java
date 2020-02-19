package edu.umb.cs.cs680.hw11;

public class CountingVisitor implements FSVisitor{
	
	private int dirNum=0;
	private int fileNum=0;
	private int linkNum=0;

	public void visit(Link link){

		this.linkNum++;
	}

	public void visit(File file){

		this.fileNum++;
	}
	public void visit(Directory directory){

		this.dirNum++;
	}

	public int getDirNum(){


		return this.dirNum;

	}

	public int getFileNum(){


		return this.fileNum;

	}


	public int getLinkNum(){


		return this.linkNum;
	}

}
