package aula02;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma letra");
		char letra = input.next().charAt(0);
		
		if (letra == 'F') {
			System.out.println("Feminino");
		}
		else if (letra == 'M') {
			System.out.println("Masculino");
			}
		else {
			System.out.println("Opção incorreta, insira novamente! ");
		}
		
		System.out.println(letra == 'F'?"Feminino":letra=='M'?"Masculino":"Letra incorreta");
		}

}
