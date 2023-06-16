package CondicionalesYCiclos;

import java.util.Scanner;

public class condicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int edad = 31; // esta variables es constante, ya tiene un valor final

		/*
		 * condicionales
		 * 
		 * if else else if switch
		 */

		System.out.println("programa para calcular la hora");

		/*
		 * int hora=13; if( hora>=10 && hora<=24) { System.out.println("buenos dias");}
		 */

		// Java, crea un nuevo objeto scanner, llamalo hora y este sera un nuevo objeto
		// de la clase scanner, que tiene los argumnetos para guardar la info que le
		// pase como entrada

		Scanner valorIngresado = new Scanner(System.in); // declaro la variable pidiendo algo en la consola

		System.out.println("por favor ingresa una hora en un formato de 24 horas");

		// var valorIngresado = prompt ("mensaje"); en una sola linea (declaro variable,
		// asigno el prompt y la info la guardo en una variable

		int hora = valorIngresado.nextInt(); // usar info del objeto

		if (hora >= 0 && hora <= 23) {

			System.out.println("hora ingresada correctamente");

			if (hora >= 0 && hora <= 11) {
				System.out.println("buenos dias");
			} else if (hora >= 12 && hora <= 18) {
				System.out.println("buenas tardes");
			} else if (hora >= 19 && hora <= 24) {
				System.out.println("buenas noches");
			} else {
				System.out.println("es madrugada");

			}
		} else {
			System.out.println("hora mal ingresada");

		} // cierre del primer if

		valorIngresado.close(); // cierre del scanner

		/* Condicionales switch */

		int opcion = 1;

		switch (opcion) {

		case 1:
			System.out.println("bienvenido al servivio de reservas");
			// logica de negocio para la funcion de las reservas
			break;

		case 2:
			System.out.println("bienvenido al servivio de check Inn");
			break;

		case 3:
			System.out.println("bienvenido al servivio de check out");
			break;

		default:
			System.out.println("opcion invalida");
			break;

		}// ciere del switch
		
		
		

	}// cierre del metodo main
}// cierre de la clase condicionales
