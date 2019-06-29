package br.unilasalle;

import java.util.ArrayList;

public abstract class UrbanBike extends Menu {
	protected int numeroDaConta;
	protected int numeroOrigem;
	protected int numeroDestino;
	protected double carteira;
	protected boolean premium;
	protected double addCredito;
	protected double km;
	
	public int getNumeroConta() {
		return this.numeroDaConta;
	}
	
	public void setNumeroConta(int numConta) {
		this.numeroDaConta = numConta;
	}
	
	public void setCarteira(double dinheiro) {
		this.carteira = dinheiro;
	}
	
	public double getCarteira() {
		return this.carteira;
	}
	
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	public boolean getPremium() {
		return this.premium;
	}
	
	public void setCredito(double credito) {
		this.addCredito = credito;
	}
	
	public double getCredito() {
		return this.addCredito;
	}
	
	public void setKm(int distancia) {
		this.km = distancia;
	}
	
	public double getKm() {
		return this.km;
	}
	
	//Gasta creditos
	protected abstract double pedalar(double pedalar);
	
	//Recarrega creditos
	protected abstract double creditar(double creditar);
	
	public void transferir(int o, int d) {
		this.numeroOrigem = o;
		this.numeroDestino = d;
	}
	
}
