package edu.umb.cs.cs680.hw11;


public class CommandCheck {
	public static Command getCommand(String input) {
		String commandName = input;
		String argument = " ";
		String argument1 = " ";
		String argument2 = " ";
		if(input.contains(" ")) {
			 commandName= input.substring(0, input.indexOf(" "));
			 argument = input.substring(input.indexOf(" ") + 1, input.length() );
		}
		if(argument.contains(" ")) {
			 argument1 = argument.substring(0, argument.indexOf(" "));
			 argument2 = argument.substring(argument.indexOf(" ") + 1, argument.length() );
		}
     	if(commandName.equals("pwd"))
	    	return new Pwd();
     	if(commandName.equals("dir"))
	    	return new Dir(argument);
     	 if(commandName.equals("ls"))
 			return new Ls();
     	 if(commandName.equals("cd"))
 			return new Cd(argument);
     	 if(commandName.equals("mkdir"))
  			return new MkDir(argument);
     	 if(commandName.equals("ln")) 
   			return new Ln(argument1,argument2);
   		 if(commandName.equals("rmdir")) 
    		return new RmDir(argument);
   		 if(commandName.equals("mv")) 
 			return new Mv(argument1, argument2);
   		 if(commandName.equals("cp")) 
  			return new Mv(argument1, argument2);
   		if(commandName.equals("chown")) 
  			return new Chown(argument);
   		if(commandName.equals("sort")) 
  			return new Sort();
   		if(commandName.equals("test")) 
  			return new Test();
   		if(commandName.equals("history")) 
  			System.out.println("history must be tested in the command line");
   		if(commandName.equals("redo")) 
   			System.out.println("redo must be tested in the command line");
     	 else
		    return new InvalidCommand();
		return null;
}

	
}