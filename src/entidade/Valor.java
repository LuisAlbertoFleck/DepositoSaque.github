package entidade;

public class Valor {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Valor(int numero, double saldo) {;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	public Valor(int numero, String nome, double depositoInicial) {;
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

		
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double account) {
		saldo+= account;
	}
	public void saque(double account) {
		saldo -= account +5.0;
	}
	public String toString() {
		return "conta "
				+ numero
				+ ", nome: "
				+ nome
				+" saldo: R$ "
				+ String.format("%.2f",saldo);
				
	}

}

