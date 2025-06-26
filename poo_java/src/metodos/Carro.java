package metodos;

public class Carro {
	
	String modelo;
	String cor;
	double preco;
	
	public Carro() {
		
	}
	public Carro(String modelo){
		this.modelo = modelo;
	}
	public Carro(String modelo , String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	public Carro(String modelo , String cor, double preco) {
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
}
