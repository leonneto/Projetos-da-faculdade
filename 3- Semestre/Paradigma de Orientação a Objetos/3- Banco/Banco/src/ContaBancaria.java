
public class ContaBancaria {
	private String titular;
	private int agencia;
	private int numero;
	private double saldo;
	
	public ContaBancaria(String titular,int agencia,int numero,double saldo){
    	this.titular=titular;
    	this.agencia=agencia;
    	this.numero=numero;
    	this.saldo=saldo;	
    }
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		this.saldo=this.saldo-valor;	
	}
	
	public void depositar(double valor) {
		this.saldo=this.saldo+valor;	
	}
	
	public void transferir(ContaBancaria destino,double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public void imprimirDados() {
		System.out.println("saldo atual : "+this.getSaldo());	
	}
	

}
