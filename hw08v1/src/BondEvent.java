package edu.umb.cs.cs680.hw08v1;

public class BondEvent {
     private String bondName;
     private float value;
     public BondEvent(String name, float initialValue) {
    	bondName = name;
    	value = initialValue;
     }
	public String getBondName() {
		return bondName;
	}
	public void setBondName(String bondName) {
		this.bondName = bondName;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
}
