package edu.umb.cs.cs680.hw08v1;

public class StockEvent{
	private String ticker;
	private float quote;
	public StockEvent(String t, float q) {
	ticker = t;
	quote = q;
	}
	public String getTicker() {
		return ticker;
	}
	public float getQuote() {	
		return quote;
	}
	

}
