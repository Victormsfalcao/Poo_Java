package aula02;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String diaSemana;
		
		System.out.print("Insira um numero de 1 a 7: ");
		int numero = input.nextInt();

	/*	
		if (numero == 1){
			System.out.print("Domingo");
		}
		else if (numero == 2){
			System.out.print("Segunda-Feira");
		}
		
		else if (numero == 3){
			System.out.print("Terça-Feira");
		}
		
		else if (numero == 4){
			System.out.print("Quarta-Feira");
		}
		
		else if (numero == 5){
			System.out.print("Quinta-Feira");
		}
		
		else if (numero == 6){
			System.out.print("Sexta-Feira");
		}
		
		
		else if (numero == 7){
			System.out.print("Sábado");
		}
		
		else {
			System.out.print("Numero incorreto, tente novamente");
		}
		
		System.out.print(numero == 1 ?"Domingo": numero == 2?"Segunda-Feira":numero == 3?"Terça-Feira":numero == 4? "Quarta-Feira":numero == 5?"Quinta-Feira":numero == 6? "Sexta-Feira":numero == 7?"Sábado":"Numero incorreto, insira novamente" );
*/
		switch(numero) {
		case 1:
			System.out.print("Domingo");	
		case 2:
			System.out.print("Segunda - Feira");	
		case 3:
			System.out.println("Terça-Feira");
		case 4:
			System.out.println("Quarta-Feira");
		case 5:
			System.out.println("Quinta-Feira");
			
		case 6:
			System.out.println("Sexta-Feira");
		case 7:
			System.out.println("Sabado");
		case 8:
			System.out.println("Opção incorreta");
			
			
			
			
		case 6:
			diaSemana = "Sexta - Feira";
			
			
		case 7:
			diaSemana = "Sabado";
			
		default:
			diaSemana = "Número incorreto, tente novamente";
			
		
		input.close();
	}

}
}