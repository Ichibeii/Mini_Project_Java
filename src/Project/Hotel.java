package Project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Project.entities.Reservation;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print("Digite o número da sala: ");
			int n = teclado.nextInt();
			System.out.print("Entre com a data de Check-in");
			Date checkin = sdf.parse(teclado.next());
			System.out.print("Entre com a data de Check-out");
			Date checkout = sdf.parse(teclado.next());

			Reservation reservation = new Reservation(n, checkin, checkout);
			System.out.print("Reservado: " + reservation);

			System.out.println("\n");
			System.out.println("Entre com as datas para a atualização");
			System.out.print("Entre com a data de Check-in");
			checkin = sdf.parse(teclado.next());
			System.out.print("Entre com a data de Check-out");
			checkout = sdf.parse(teclado.next());
			reservation.updateDates(checkin, checkout);
			System.out.println("Reservado: " + reservation);
		} catch (ParseException e) {
			System.out.println("Error na formatização das datas");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
