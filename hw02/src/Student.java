package edu.umb.cs.cs680.hw02;

public class Student {

	private String name;
	private float tuition;
	private int i20num;
	private String usAddr;
	private int yrsInState;
	private String foreignAddr;// String

	private Student(String name, int i20num, String usAddr, int yrsInState, String foreignAddr, StudentStatus status) {
		this.name = name;
		this.i20num = i20num;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.foreignAddr = foreignAddr;

	}

	public static Student createInStateStudent(String name, String usAddr, int yrsInState) {
           return new Student( name, -1, usAddr, yrsInState, null, StudentStatus.INSTATE );
	}

	public static Student createOutStateStudent(String name, String usAddr, int yrsInState) {
		 return new Student( name, -1, usAddr, yrsInState, null, StudentStatus.OUTSTATE);
	}

	public static Student createIntlStudent(String name, int i20num, String usAddr, int yrsInState, String foreignAddr) {
		 return new Student( name,i20num,  usAddr, yrsInState, foreignAddr, StudentStatus.INTL);
	}

	

	public float getTuition() {
		return tuition;
	}

	public String getName() {
		return name;
	}

	public float geti20num() {
		return i20num;
	}

	public String getusAddr() {
		return usAddr;
	}

	public float yrsInState() {
		return yrsInState;
	}

	public String foreignAddr() {
		return foreignAddr;
	}
public static void main(String[] args) {
System.out.print("Hello World");
}
}
