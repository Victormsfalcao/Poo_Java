package aula03;
import java.util.Scanner;
import java.util.Arrays;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arrayA[] = new int [4];
	
		for(int i = 0;i <= arrayA.length;i++) {
			System.out.printf("Lista A : Digite o %d valor: ", i + 1);
			arrayA[i] = input.nextInt();
			
		
		}
	
		
		int arrayB[] = new int [4];
		
		for(int i = 0;i <= arrayB.length;i++) {
			System.out.printf("Lista B : Digite o %d valor: ", i + 1);
			arrayB[i] = input.nextInt();
			}
		
		
		int arrayC[] = new int [4];
		for(int i = 0;i <= arrayC.length;i++) {
			System.out.printf("Lista C : Digite o %d valor: ", i + 1);
			arrayC[i] = input.nextInt();
			}
		
		int arrayD[] = new int [4];
		for(int i = 0;i <= arrayD.length;i++) {
			System.out.printf("Lista D : Digite o %d valor: ", i + 1);
			arrayD[i] = input.nextInt();
			}
		
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		
		System.out.println(Arrays.toString(arrayC));
		System.out.println(Arrays.toString(arrayD));
		
		
		
		
		input.close();
	
		
		
	}

}
