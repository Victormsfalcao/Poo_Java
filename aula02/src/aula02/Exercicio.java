package aula02;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contador = 0;
		
		System.out.println("Telefonou para a vítima?");
			char resp1 = input.next().charAt(0);
			if (resp1 == 's') {
				contador ++;
			}
			System.out.println("Esteve no local do crime?");
			char resp2 = input.next().charAt(0);
			if (resp2 == 's') {
				contador ++;
			}
			
			System.out.println("Mora perto da vítima?");
			char resp3 = input.next().charAt(0);
			if (resp3 == 's') {
				contador ++;
			}
			System.out.println("Devia para a vítima?");
			char resp4 = input.next().charAt(0);
			if (resp4 == 's') {
				contador ++;
			}
			
			System.out.println("Já trabalhou com a vítima?");
			char resp5 = input.next().charAt(0);
			if (resp5 == 's') {
				contador ++;
			}
			
			if (contador == 2) {
				System.out.println("Suspeito");
			}
			else if (contador == 3 || contador == 4 ) {
				System.out.println("Cúmplice");
			}
		
			else if (contador == 5 ) {
				System.out.println("Assassino");
			}
			else {
				System.out.println("Inocente");
			}
	}
	}