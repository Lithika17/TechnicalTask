package org.java;

public class Technical1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = i; j == i; j++) {
				System.out.print(" * ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
		}

	}

}
