import java.util.*;
import java.util.regex.*;
import java.io.*;

public class fmr{
	
	public static void main(String[] args){
	
		for(int i = 0; i < args.length; i++){
		
			if(args[i].equals("-h")){
				System.out.println("This program takes in a input and a regrex and outputs the found tokens of the regrex");
				System.exit(0);
			}// if
		}// for	

		int fileInput = -1;
		for(int i = 0; i < args.length; i++){
			
			if(args[i].equals("-f")){
			
				fileInput = i;		

			}// if equals

		}// for i	
		
		if(fileInput != -1){

			String filename = args[fileInput +1];

			Pattern pattern = Pattern.compile(filename);

			try{
				FileReader freader = new FileReader(filename);

				BufferedReader br = new BufferedReader(freader);
			}// try
			catch(Exception e){

			}// catch

		}// if fileInput	
		else{
			String line = args[0];

			String regrex = args[1];

			Pattern pattern = Pattern.compile(regrex);

			Matcher matcher = pattern.matcher(line);

			boolean found = false;

			while(matcher.find()){
			
				System.out.println("I found text " + matcher.group() + " starting at index " + matcher.start() + " and ending at index " + matcher.end());

				found = true;
			
			}// while

			if(!found){
				System.out.println("No match found");
			}//if found
		}// else
	}// main
}// class	
