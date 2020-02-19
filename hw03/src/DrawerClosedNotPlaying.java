package edu.umb.cs.cs680.hw03;

public class DrawerClosedNotPlaying implements State{
	
	public static DVDPlayer player= null;
	private static DrawerClosedNotPlaying instance = null;
	private DrawerClosedNotPlaying () {
	
	};
	public static DrawerClosedNotPlaying getInstance() {
		if(instance == null)
			instance = new DrawerClosedNotPlaying();
		return instance;
	}
	public void openCloseButtonPushed(DVDPlayer player){
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}
	public void playButtonPushed(DVDPlayer player) {
		player.play();
		player.changeState( DrawerClosedPlaying.getInstance());
	}
	public void stopButtonPushed(DVDPlayer player) {
		
	}
	public String toString(){
		return "Drawer Closed Not Playing";
	}

}
