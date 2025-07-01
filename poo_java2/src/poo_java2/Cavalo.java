package poo_java2;

abstract class Cavalo {

	String nome;
	
	public Cavalo() {
		
	}
	
	public Cavalo(String nome) {
		this.nome = nome;
	}
	public void comer() {
		System.out.println("Foi comer");	
	}
	public void comer(String comida){
		System.out.printf("Foi comer %s",comida);
		
	}
}
