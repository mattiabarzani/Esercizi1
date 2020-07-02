package es5;

import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random prova = new Random();
		int x = prova.nextInt(100);
		int y = 50 + prova.nextInt(50);
		
		System.out.println("var1 è " + x + " mentre " + "var2 è " + y);

	}

}
