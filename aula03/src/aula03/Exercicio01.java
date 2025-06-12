package aula03;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float soma = 0; 
		int notas = 0; 
		float calcNotas = 0;
		
		System.out.print("Quantos alunos tem na sua turma: ");
		int qtdAlunos = input.nextInt();
		
		while (notas < qtdAlunos) {
			
			System.out.printf("Insira a nota do aluno %d: ",notas + 1);
			calcNotas = input.nextFloat();
			soma = soma + calcNotas;
			notas ++;
		}
		
		float media = soma /qtdAlunos;
		System.out.printf("A media da nota dos %d alunos é de %.1f",qtdAlunos,media);
		input.close();
	}

}
