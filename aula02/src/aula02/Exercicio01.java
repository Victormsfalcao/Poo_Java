package aula02;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		double num1 = input.nextDouble();
		System.out.println("Insira um numero: ");
		double num2 = input.nextDouble();
		System.out.println("Insira um numero: ");
		double num3 = input.nextDouble();

	/*	if (num1 > num2 && num1 > num3) {
			System.out.println("O numero 1 é o maior");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O numero 2 é o maior");	
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.println("O numero 3 é o maior");	
		}
		*/
		//System.out.println(num1 > num2 && num1 > num3 ? "O número 1 é o maior" :num2 > num1 && num2 > num3 ? "O número 2 é o maior":num3 > num1 && num3 > num2 ?"O número 3 é o maior":"Os números são iguais");
		
		Math.max(num1, Math.max(num2, num3));
	
		input.close();
	}

}
