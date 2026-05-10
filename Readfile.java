package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 //File file = new File("C:\\Users\\santo\\OneDrive\\Documents\\data.txt");
		Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the name or path of the text file: ");
        String filePath = inputScanner.nextLine();
	        FileReader fr = new FileReader(filePath);
	        BufferedReader br = new BufferedReader(fr);
	        int linecount=0;
	        int wordCount=0;
	        int charCount=0;
	        String longestWord ="";
	       
	        String st;
	      try
	      {
	    	  String line;
	        while (( line=br.readLine()) != null)
	        {

	        	linecount++;
	        	
	        	charCount += line.length();
	        	
	        	String[] words=line.trim().split("\\s+");
	        	if(!line.trim().isEmpty())
	        	{
	        		wordCount+=words.length;
	        	}
	        	
	        	 for (String word : words)
	        	 {
                     // Remove punctuation if you want to count only letters/numbers
                     String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
                     if (cleanWord.length() > longestWord.length())
                     {
                         longestWord = cleanWord;
                     }
	        	 }
	        }
            System.out.println("Total number of lines: " + linecount);
            System.out.println("Total numbers of words: "+wordCount);
            System.out.println("Total number of characters: " +charCount);
            System.out.println("Longest Word : "+longestWord);
            
	      }
	      catch (Exception e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	      }
	      
	      finally {
	            inputScanner.close();
	      }
            
	      }
	}


