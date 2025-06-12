package aula03;

public class Exercicio06 {

	public static void main(String[] args) {
		int soma3 = 0;
		int soma5 = 0;
		int somaTotal = 0;
				
		for (int i = 1 ; i <= 20 ; i++) {
			
			if (i % 3 == 0) {
				soma3 +=i ;
			}
			if (i % 5 == 0) {
				soma5 +=i ;
			}
			somaTotal = soma3+soma5;
		}
		
			System.out.println(soma3);
			System.out.println(soma5);
			System.out.println(somaTotal);
			
			
	}

}

