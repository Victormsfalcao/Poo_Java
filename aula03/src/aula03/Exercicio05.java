package aula03;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int notas = 0;
		float soma = 0;
		float calcNotas = 0;
		
		System.out.println("Digite a quantidade de alunos da turma:  ");
		int qtdAlunos = input.nextInt();
		
		for (int i = 1 ; i <= qtdAlunos; i++ ) {
		
			System.out.printf("Insira a nota do aluno %d: ",i);
			calcNotas = input.nextFloat();
			soma = soma + calcNotas;
		}
		
		float media = soma /qtdAlunos;
		System.out.printf("A media da nota dos %d alunos é de %.1f",qtdAlunos,media);
			
	
		
		input.close();
		
	}

}
