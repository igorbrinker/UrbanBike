package br.unilasalle;

public class PedalPremium extends UrbanBike {
	private double limite;
	
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
}
