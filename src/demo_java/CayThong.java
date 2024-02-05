/*
QuangND64
*/
package demo_java;

import java.util.Scanner;

public class CayThong {
	// cây thông 1
	 static void cayThong1(int tang) {
		for (int i = 1; i <= tang; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
	}
	 
	// cây thông 2
	static void cayThong2(int tang) {
		for (int i = 1; i <= tang; i++) {
			for (int j = 1; j <= tang + i - 1; j++) {
				if (j < tang - i + 1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}	
			
			System.out.println("");
		}
	}
	
	// cây thông 3
	static void cayThong3(int tang) {
		for (int i = 1; i <= tang; i++) {
			for (int j = 1; j <= tang + i - 1; j++) {
				if (j < tang - i + 1) {
					System.out.print(" ");
				}
				else {
					System.out.print((tang-i+1) % 2 - (j % 2) == 0 ? "*" : " ");
				}
			}	
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số tầng cây thông");
		int tang = scanner.nextInt();
		scanner.close();
		System.out.println("----------cây thông 1-----------");
		cayThong1(tang);
		System.out.println("----------cây thông 2-----------");
		cayThong2(tang);
		System.out.println("----------cây thông 3-----------");
		cayThong3(tang);
	}
}
