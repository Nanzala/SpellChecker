package org.meltwater.java.spellchecker;

import java.io.*;
import java.util.StringTokenizer;

public class SpellChecker {
	
	
	public static void main (String []args) throws IOException {
		SpellChecker checker = new SpellChecker();
		
		
		/*******************************************************
		* READ A FILE.
		*  
		********************************************************/
		String fileName = "document.txt";
		
		try {
			ReadFile file = new ReadFile(fileName);
			String[] arrayLines = file.OpenFile();
			
			for(int i=0; i<arrayLines.length; i++) {
				System.out.println(arrayLines[i]);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		/*******************************************************
		* WRITE TO A FILE.
		*  
		********************************************************/
		try {
			WriteFile data = new WriteFile(fileName, true);
			data.writeToFile("This is another line of text.");
		}
		catch(IOException e) {
				System.out.println(e.getMessage());
		}
	}	
}
