package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
	public static void main(String[] args) {
		// Code to create a new file
		File myFile = new File("cwh111file.txt");
		try {
			myFile.createNewFile();
			System.out.println("The file has been created Successfully");
		} catch (IOException e) {
			System.out.println("Unable to create this file");
			e.printStackTrace();
		}
		// Code to write to a file
		try {
			FileWriter fileWriter = new FileWriter("cwh111file.txt");
			fileWriter.write("This is our first file from this java course\nOkay now bye");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Reading a file
		File myFile2 = new File("cwh111file.txt");
		try {
			Scanner sc = new Scanner(myFile2);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Deleting a file
		File myFile3 = new File("cwh111file.txt");
		if (myFile3.delete()) {
			System.out.println("I have deleted: " + myFile3.getName());
		} else {
			System.out.println("Some problem occurred while deleting the file");
		}
	}
}
