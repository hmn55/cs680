

import java.util.*;

public class Test {

	public static void main(String[] args) {

		FileSystem fs = FileSystem.getFileSystem();
		Date date = new Date();
		fs.root = new Directory("root", null, "User", date);
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
		

		fs.showAllElements();

		CountingVisitor cv = new CountingVisitor();
		fs.root.accept(cv);

		System.out.println("The file system has:" + "\n");

		System.out.println("Directories: " + cv.getDirNum());
		System.out.println("Files: " + cv.getFileNum());
		System.out.println("Links: " + cv.getLinkNum());

		FileSearchVisitor fsvtxt = new FileSearchVisitor(".txt");
		fs.root.accept(fsvtxt);
		
		System.out.println(".txt files: " + fsvtxt.getFoundFiles().size());
		FileSearchVisitor fsvjpg = new FileSearchVisitor(".jpg");
		fs.root.accept(fsvjpg);
	
		System.out.println(".jpg files: " + fsvjpg.getFoundFiles().size());
		FileSearchVisitor fsvexe = new FileSearchVisitor(".exe");
		fs.root.accept(fsvexe);
		
		System.out.println(".exe files: " + fsvexe.getFoundFiles().size());
		FileSearchVisitor fsvpng = new FileSearchVisitor(".exe");
		fs.root.accept(fsvpng);
		
		System.out.println(".png files: " + fsvpng.getFoundFiles().size());
		SizeCountingVisitor scv = new SizeCountingVisitor();
		fs.root.accept(scv);
		System.out.println("File system contains a total of:" + scv.getTotalSize() + " files");

	}

}
