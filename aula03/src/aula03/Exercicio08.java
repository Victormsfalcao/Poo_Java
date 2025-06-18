package aula03;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float arrayAlunos[] = new float [5];
		float soma = 0; 

		for(int i = 0;i < arrayAlunos.length;i++) {
			System.out.printf(" Insira a nota aluno %d : ", i + 1);
			arrayAlunos[i] = input.nextFloat();
			}
		
/*		for(int j = 0 ; j < arrayAlunos.length;j++ ) {
			soma += arrayAlunos[j];
			}*/
		
		for(float j : arrayAlunos) {
			soma +=j;
		}
		
		float media = soma / arrayAlunos.length;

		System.out.printf("A média dos %d alunos é %.1f", arrayAlunos.length,media );
		input.close();
	}
}
