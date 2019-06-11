package com.tom.j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Area {

	public static void main(String[] args) {
		ArrayList<String>cities = new ArrayList<>();
		ArrayList<String>areas = new ArrayList<>();
		ArrayList<String>postCodes = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("data1.txt"));
			String line  = in.readLine();
			String lastcity = "" ;
			while (line!= null) {
				System.out.println(line);
				String [] tokens = line.split(",");
				if(!tokens[0].equals(lastcity)) {
					lastcity = tokens [0];
					cities.add(tokens[0]);
				}
				cities.add(tokens[0]);
				areas.add(tokens[1]);
				postCodes.add(tokens[2]);
				line  = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
