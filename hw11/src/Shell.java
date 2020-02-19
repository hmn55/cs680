package edu.umb.cs.cs680.hw11;

import java.io.Console;
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
public class Shell {
	static ArrayList<String> history = new ArrayList<String>();
	public static void main(String args[]) throws IOException {

		FileSystem fs = FileSystem.getFileSystem();
		Date date = new Date();
		Directory home = new Directory("home", fs.root, "User", date);
		File browser = new File(home, "browser.exe", "User", date, 1);
		File passwords = new File(home, "passwords.txt", "User", date, 1);
		File docs = new File(home, "data.txt", "Tom", date, 2);
		Directory pictures = new Directory("pictures", fs.root, "User", date);
		File IMG_1233 = new File(pictures, "IMG_1233.png", "User", date, 1);
		Link browserShortcut = new Link("browser.exe", pictures, "User", browser, date);
		Directory photos = new Directory("photos", pictures, "User", date);
		File IMG_1234 = new File(pictures, "IMG_1234.jpg", "User", date, 1);
		File IMG_1235 = new File(pictures, "IMG_1235.jpg", "User", date, 2);
		Link photosBrowserShortcut = new Link("browser.exe", photos, "User", browser, date);
		Directory images = new Directory("images", pictures, "User", date);
		File wallpaper = new File(pictures, "wallpaper.png", "User", date, 1);
		File background = new File(pictures, "background.png", "User", date, 2);
		Link imagesBrowserShortcut = new Link("browser shortcut", images, "User", browser, date);
		CommandCheck.getCommand("test");
		Console c = System.console();
		if (c == null) {
			System.err.println("no console");
			System.exit(1);
		}
		String text = " ";
		String mostRecentCommand = " ";
		do {
		 text = c.readLine(">");
		history.add(text);
			if(text.equals("redo"))
				text = mostRecentCommand;
			if (text.equals("history")) {
				for (String element : history)
					System.out.println(element);
			}mostRecentCommand = text;
		CommandCheck.getCommand(text);
		}while(!text.equals("exit"));
	}
}
