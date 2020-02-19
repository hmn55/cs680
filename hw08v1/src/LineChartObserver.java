package edu.umb.cs.cs680.hw08v1;



public class LineChartObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if (arg instanceof StockEvent) {
			StockEvent stockevent = (StockEvent) arg;	
			System.out.print("Stock Market LineChart: ");
			System.out.println(stockevent.getTicker()+ "  $"+ stockevent.getQuote()+" \n");
			}
		else if (arg instanceof BondEvent) {
			BondEvent bondevent = (BondEvent) arg;
			System.out.print("Bond Market LineChart: ");
			System.out.println(bondevent.getBondName() + "  $"+ bondevent.getValue()+" \n");
			}
		else if (arg instanceof DJIAEvent) {
			DJIAEvent djiaevent = (DJIAEvent) arg;
			System.out.print("DJIA LineChart: $");
			System.out.println(djiaevent.getDjia()+" \n");
			}
		else {
			System.out.println("Event is not recognized");
	}

}
}
