package metodos;

public class Calculadora {

	public static void main(String[] args) {
		
		CalcularMetodos c1 = new CalcularMetodos();
		
		
		int respostas1 = c1.somar(5,6);
		System.out.println(respostas1);
		
		int respostas2 = c1.somar(5, 2, 3);
		System.out.println(respostas2);

		int respostaSu1 = c1.subtrair(5,6);
		System.out.println(respostaSu1);
		
		int respostaSu2 = c1.subtrair(5, 2, 3);
		System.out.println(respostaSu2);

		int respostaM1 = c1.multiplicar(5,6);
		System.out.println(respostaM1);

		int respostaM2 = c1.multiplicar(5,6,4);
		System.out.println(respostaM2);
		
		int respostaD1 = c1.dividir(10, 2);
		System.out.println(respostaD1);
		
		int respostaD2 = c1.dividir(20, 2,5);
		System.out.println(respostaD2);
		
		
		
	
		
		
	
	}

}
