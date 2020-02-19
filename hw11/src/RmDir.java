package edu.umb.cs.cs680.hw11;

public class RmDir implements Command{
	FileSystem fs = FileSystem.getFileSystem();
	private String input;

	public RmDir(String input) {

		this.input = input;
		execute();
	}

	public void execute() {
	//	if (fs.getCurrentDirectory().getChildren().size() == 0) {
	
		//} else {
			for (int i = 0; i < fs.getCurrentDirectory().getChildren().size(); i++) {
				if (this.input.equals(fs.getCurrentDirectory().getChildren().get(i).getName())) {
					fs.getCurrentDirectory().getChildren().remove(i);
				}
			}
		}

//	}
}
