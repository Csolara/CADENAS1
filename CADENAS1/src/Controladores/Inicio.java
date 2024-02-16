package Controladores;

import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera cadena: ");
		String cadena1 = sc.nextLine();
		
		System.out.println("Introduzca la segunda cadena: ");
		String cadena2 = sc.nextLine();
		
		String cadenacompleta = cadena1 + " " + cadena2;
		
		System.out.println("Concatenacion: " + cadenacompleta);
		System.out.println("Longitud: " + cadenacompleta.length() );
	}

}
