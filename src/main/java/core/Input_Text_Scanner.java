package core;

import java.io.*;
import java.util.Scanner;

public class Input_Text_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		// String File args[0];
		
	File file = new File("input.txt");

		Scanner s = new Scanner(file);
		
		while (s.hasNext())
		{
			String first_name = s.next();
			String last_name = s.next();
			System.out.println("Your full name is " + first_name + " " + last_name);}
	s.close();
	}
}
