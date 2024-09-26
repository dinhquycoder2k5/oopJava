package core;

import java.util.Scanner;

public class Examples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String direction = "";
		switch(n)
		{
		case 1:
			direction = "east";
			System.out.println("one");
			break;
		
		case 2:
				direction = "west";
				System.out.println("two");
				break;
		case 3: 
			direction = "south";
			System.out.println("three");
			break;
		
		default: 
			System.out.println("default");
			break;
			
		}
		
		switch (direction.toUpperCase())
		{
		case "east":
			System.out.println("dong");
			break;
		case "west":
			System.out.println("tay");
			break;
		case "south":
			System.out.println("bac");
			break;
		}
	}
}