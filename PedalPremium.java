package br.unilasalle;

public class PedalPremium extends UrbanBike implements Imprimivel{
	private double limite;
	
	
	protected double getLimite() {
		return this.limite;
	}
	
	@Override
	protected double creditar(double creditar) {
		carteira = carteira + creditar;
		return carteira;
	}
	
	@Override
	protected double pedalar(double pedalar) {
		if(carteira == 0) {
			System.out.println("Na proxima pedalada voce usara seus creditos premium...");
			carteira = carteira - pedalar;
		}
		if(carteira == limite) {
			System.out.println("Voce usou todo o seu limite premium! Recarregue novamente para poder pedalar mais.");
		}else carteira = carteira - pedalar;
		
		return carteira;
	}

	public void mostraDados() {
		if(this.premium != false) {
			System.out.println("ID: " + getNumeroConta() + ".");
			System.out.println("Saldo: R$" + getCarteira() + ".");
			System.out.println("Limite: R$" + getLimite() + ".");
			System.out.println("Tipo de conta: Premium.");
		}
	}
}
