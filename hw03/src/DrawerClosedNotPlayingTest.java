package edu.umb.cs.cs680.hw03;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class DrawerClosedNotPlayingTest {
public static DVDPlayer cut = null;
	@Before
	public void config()
	{
		cut = DVDPlayer.getInstance();
		cut.changeState(DrawerClosedNotPlaying.getInstance());
	}
	
	
	@Test
	public void DrawerClosedNotOpenCloseButtonPushedTest() {
		
		
		 cut.openCloseButtonPushed();
		 String actual = cut.getState().toString();
		 String expected = "Drawer Open";
		 assertThat(actual, is(expected));
	}
	

	@Test
	public void DrawerClosedNotPlayingPlayButtonPushedTest() {
	
		
	    cut.playButtonPushed();
		String actual = cut.getState().toString();
		String expected = "Drawer Closed Playing";
		assertThat(actual, is(expected));
	}
	

	@Test
	public void DrawerClosedNotPlayingStopButtonPushedTest() {
			
		 cut.stopButtonPushed();
		 String actual = cut.getState().toString();
		 String expected = "Drawer Closed Not Playing";
		assertThat(actual, is(expected));
	}

}

