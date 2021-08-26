package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Location{
	HashMap<String, Location> map;
	Scanner scan = new Scanner(System.in);
	private String name;
	private double latitude, longitude;
	
	public Location(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		map = new HashMap<String, Location>();
	}
	
	private void read() {
		System.out.println("Enter City name, latitude, longitude");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer lc = new StringTokenizer(text, ",");
			String name = lc.nextToken().trim();
			double latitude = Double.parseDouble(lc.nextToken().trim());
			double longitude = Double.parseDouble(lc.nextToken().trim());
			
			Location c = new Location(name,latitude,longitude);
			map.put(name, c);
		}
	}
	
	void printAll() {
		System.out.println("---------------------------");
		Iterator<String> iter = map.keySet().iterator(); 
		while(iter.hasNext()) {
			String key = iter.next();
			Location value = map.get(key);
			System.out.println(key+"\t"+value.latitude+"\t"+value.longitude);
		}
		System.out.println("---------------------------");
	}
	
	void processQuery() {
		while(true) {
			System.out.print("City name >> ");
			String n = scan.next();
			if(n.equals("exit")) {
				break;
			}
			boolean b = map.containsKey(n);
			if(b) {
				System.out.println(map.get(n).name+"\t"+map.get(n).latitude+"\t"+map.get(n).longitude);
			} else {
				System.out.println("Location of "+n+" is unknown.");
			}
		}
	}
	
	void run() {
		read();
		printAll();
		processQuery();
	}
}

public class Q7 {

	public static void main(String[] args) {
		/*
		 * a. Create the Location class which has City, Latitude and Longitude information.
		 * b. Create HashMap<String, Location> collection
		 * c. Get 4 City names, latitudes and longitudes. Modify read() method of Q5.
		 * d. Print all 4 city information. Make prinAll() method.
		 * e. Get the city name & print the latitude and longitude. Make processQuery() method.
		 */
		Location l = new Location(null, 0, 0);
		l.run();
	}

}
