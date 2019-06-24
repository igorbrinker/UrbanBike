package br.unilasalle;

public abstract class UrbanBike {
	protected int numeroDaConta;
	protected double carteira;
	protected boolean premium;
	protected double addCredito;
	
	//Gasta creditos
	protected abstract double pedalar(double pedalar);
	
	//Recarrega creditos
	protected abstract double creditar(double creditar);
	
	protected void addCreditos(double credito) {
		this.addCredito = credito;
	}
	
}
