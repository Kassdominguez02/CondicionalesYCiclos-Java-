package CondicionalesYCiclos;

import java.util.Scanner;

public class condicionalesHotel {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 1er Requerimento: Servicios Adicionales

		System.out.println("Servicios adicionales");

		System.out.println("Usted solicito Servicios adicionales? 1.- Si escriba true 2.- No, escriba false");
		Scanner solicitud = new Scanner(System.in);

		boolean serviciosAdicionales = solicitud.nextBoolean();

		if (serviciosAdicionales) { // Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Servicios Adicionales, se le hara un cargo extra");

		} else { // Como no ocupo
			System.out.println("Usted NO solicito Servicios Adicionales");

		}
		solicitud.close();

		// 2.-temporada

		int mesActual = 6; // Mes actual (ejemplo: 6 representa junio)

		if (mesActual >= 1 && mesActual <= 3) {
			System.out.println("Es temporada baja. Descuentos especiales disponibles.");
			// Aquí irían las acciones adicionales para la temporada baja.
		} else if (mesActual >= 4 && mesActual <= 9) {
			System.out.println("Es temporada alta. Tarifas regulares aplican.");
			// Aquí irían las acciones adicionales para la temporada alta.
		} else if (mesActual >= 10 && mesActual <= 12) {
			System.out.println("Es temporada baja. Descuentos especiales disponibles.");
			// Aquí irían las acciones adicionales para la temporada baja.
		} else {
			System.out.println("El mes proporcionado no es válido.");
			// Aquí irían las acciones adicionales en caso de que el mes no sea válido.
		}

		// 3.- Requerimiento: Horario (checkIn-checkOut)

		System.out.println("\nServicios adicionales");
		Scanner check = new Scanner(System.in); // input

		System.out.println("Ingrese el horario de check-in (HH:mm): ");
		String checkIn = check.nextLine();

		System.out.println("Ingrese el horario de check-out (HH:mm): ");
		String checkOut = check.nextLine();

		// Para mostrar el horario ingresado
		System.out.println("Horario de check-in: " + checkIn);
		System.out.println("Horario de check-out: " + checkOut);
		
		check.close();

		// 4.- Room Service
		System.out.println("Room Service");
		System.out.println("Usted solicito Room Service? 1.- Si escriba true 2.- No, escriba false");

		Scanner solicitudRS = new Scanner(System.in);

		boolean roomService = solicitudRS.nextBoolean();

		if (roomService) { // Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Room Service, se le hara un cargo extra");
		} else { // Como no ocupo
			System.out.println("Usted NO solicito Room Service");
		}
		solicitudRS.close();

		// 5.-Huesped adicional
		System.out.println("ingrese el numero total de huespedes que le gustaria en su habitacion");

		int cantidadHuespedes = 3;

		int capacidadMaxima = 4;

		if (cantidadHuespedes < capacidadMaxima) {
			System.out.println("Puede agregar un huésped adicional a la habitación.");

		} else {
			System.out.println("La habitación ha alcanzado su capacidad máxima de huéspedes.");

		}

	}

}
