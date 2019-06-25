package br.unilasalle;

public abstract class UrbanBike {
	protected int numeroDaConta;
	protected double carteira;
	protected boolean premium;
	protected double addCredito;
	protected double km;
	
	protected int getNumeroConta() {
		return numeroDaConta;
	}
	
	protected double getCarteira() {
		return carteira;
	}
	
	protected boolean getPremium() {
		return premium;
	}
	
	//Gasta creditos
	protected abstract double pedalar(double pedalar);
	
	//Recarrega creditos
	protected abstract double creditar(double creditar);
	
}
