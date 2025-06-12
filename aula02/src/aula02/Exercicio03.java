package aula02;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o nº 1");
		double num1 = input.nextDouble();

		System.out.println("Insira o nº 2");
		double num2 = input.nextDouble();
		
		double media = (num1 + num2)/2;
		
		System.out.println(media);	
		
		input.close();

	}
		
}
