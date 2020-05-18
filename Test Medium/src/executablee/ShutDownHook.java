package executablee;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
public class ShutDownHook 
{ 
public static void main(String[] args) 
{ 

	Runtime.getRuntime().addShutdownHook(new Thread() 
	{ 
	public void run() 
	{ 
		System.out.println("Shutdown Hook is running !"); 
	} 
	}); 
	System.out.println("Application Terminating ..."); 
} 
} 
