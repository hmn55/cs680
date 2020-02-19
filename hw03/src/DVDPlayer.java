package edu.umb.cs.cs680.hw03;

public class DVDPlayer {

	private State state;
	private static  DVDPlayer player = null;

	private DVDPlayer() {};

	public static DVDPlayer getInstance() {
		
		player = new DVDPlayer();
		return player;
	}

	public void changeState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void openCloseButtonPushed() {

		state.openCloseButtonPushed(player);
	}

	public void playButtonPushed() {

		state.playButtonPushed(player);
	}

	public void stopButtonPushed() {

		state.stopButtonPushed(player);
	}

	public void open() {
		System.out.println("Open button has been pushed");
	}

	public void close() {
		System.out.println("Close button has been pushed");
	}

	public void play() {
		System.out.println("Play button has been pushed");
	}

	public void stop() {

	}

	

}
