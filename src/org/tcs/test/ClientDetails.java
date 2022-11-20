

package org.tcs.test;
import java.io.File;
import java.io.PrintStream;

public class ClientDetails {



	public static void main(String[] args, PrintStream Fileutils) {
	File f = new File("R:\\core java greens\\selenium\\Ranjith\\ran.txt");
	boolean A = f.createNewFile();
	System.out.println(A);
	String s= "Welcome to Mypc";
	Fileutils.write(f,s,false);
	
	
	
	}


	}
	



