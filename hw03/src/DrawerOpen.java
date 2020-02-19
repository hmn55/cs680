package edu.umb.cs.cs680.hw03;

public class DrawerOpen implements State {
	//private  DVDPlayer player;
	private static DrawerOpen instance = null;
	private DrawerOpen() {
	
	};
	public static DrawerOpen getInstance() {
		if(instance == null)
			instance = new DrawerOpen();
		return instance;
	}
	
public void openCloseButtonPushed(DVDPlayer player){
     player.close();
     player.changeState(DrawerClosedNotPlaying.getInstance());
}
public void playButtonPushed(DVDPlayer player) {
	player.close();
	player.play();
	player.changeState(DrawerClosedPlaying.getInstance());
}
public void stopButtonPushed(DVDPlayer player) {

}
public String toString(){
	return "Drawer Open";
}

}
