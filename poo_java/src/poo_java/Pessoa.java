package poo_java;

public class Pessoa {
		
		String nome;
		int idade;
		double altura;
		String genero;


	public void comer(String comida) {
		System.out.printf("%s está comendo %s. ", nome , comida);	
	}


	public void exibirAtributos(String nome, int idade, double altura, String genero){
		System.out.printf("Nome: %s, Idade: %d, Altura: %.2f, Genero: %s",nome,idade,altura,genero );
		
	}
	}